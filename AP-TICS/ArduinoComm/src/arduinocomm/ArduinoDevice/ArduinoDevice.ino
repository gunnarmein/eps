// delay in milliseconds between blinks of the LED
unsigned int interval = 200;

// buffer for serial comm
char buffer[1024];

// output lines
#define HSYNC 5
#define VSYNC 6
#define SIGNAL 0


void setup()
{
  // initialize the digital pin as an output.
  pinMode(LED_BUILTIN, OUTPUT);
  blink(1);
  while (!Serial);
  Serial.begin(9600);
  Serial.setTimeout(50);

  bool fReady = false;
  do {
    // wait for available bytes
    while (!Serial.available());

    int bytes = Serial.readBytesUntil(0, buffer, sizeof(buffer));
    buffer[bytes] = 0;
    if (strcmp(buffer, "Are you the Arduino?") == 0) {
      strcpy (buffer, "Yes I am the Arduino");
      Serial.print(buffer);
      Serial.flush();
      fReady = true;
    }
  } while (!fReady);
  //blink(3);
}


void blink(int number) {
  while (number--) {
    digitalWrite(LED_BUILTIN, HIGH);
    delay(interval);
    digitalWrite(LED_BUILTIN, LOW);
    delay(interval);
  }
}

void loop()
{
  // wait for available bytes
  long last = millis();
  while (!Serial.available()) {
    if (millis() - last > 10000) {
      setup();
      return;
    }
  }
  int bytes = Serial.readBytesUntil(0, buffer, sizeof(buffer));
  buffer[bytes] = 0;

  if (strncmp(buffer, "video ", 6) == 0) {
    video(&buffer[6]);
  }
  
  Serial.print(buffer);
  Serial.flush();
}

void video(char *params) {
  String frequency = params;
  String lineNumber = frequency.substring(frequency.indexOf(',')+1);
  frequency = frequency.substring(0,frequency.indexOf(','));

  
  int freq = frequency.toInt();
  int lines = lineNumber.toInt();

  Serial.println("Video "+String(freq)+":"+String(lines));
  
  long vinterval = (long)((1.0/freq)*1000000);            // length of frame in microseconds
  long hinterval = (long)(((double)vinterval) / lines);   // length of one line in microseconds

  Serial.println("Intervals "+String(vinterval)+":"+String(hinterval));

  bool on = true;
  do {
    for (int i = 0; i<lines; i++) {
      analogWrite(SIGNAL, 0);
      long lineStart = micros();
      while(micros()-lineStart < hinterval);
      digitalWrite(HSYNC, HIGH);
      delayMicroseconds(20);
      digitalWrite(HSYNC, LOW);
    }
    digitalWrite(VSYNC, HIGH);
    digitalWrite(LED_BUILTIN, on?HIGH:LOW);
    on = !on;
    delayMicroseconds(20);
    digitalWrite(VSYNC, LOW);
  } while (!Serial.available());  // repeat until serial message comes in
}
