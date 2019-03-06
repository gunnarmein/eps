/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arduinocomm;

/**
 *
 * @author gmein
 */
public class ArduinoComm {

    static ArduinoPort a;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        a = new ArduinoPort();

        if (!a.initialize()) {
            System.out.println("could not find Arduino ");
            return;
        }
        
        video (10,60);

    }

    // sample activity:
    // sends numbers (as strings) 1 to 10, waits to see what comes back, prints it
    static void numbers() {

        byte[] ab = new byte[1024];
        for (int i = 0; i < 10; i++) {
            System.out.println("Sending " + i);
            a.write(Integer.toString(i));
            try {
                Thread.sleep(200);
            } catch (InterruptedException ex) {
            }
            int n = a.read(ab);
            String s = new String(ab, 0, n);
            System.out.println("Received " + s);

        }
    }

    static void video(int freq, int lines) {
        byte[] ab = new byte[1024];
        a.write("video " + freq + "," + lines);
        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
        }
        int n = a.read(ab);
        String s = new String(ab, 0, n);
        System.out.println("Received " + s);
    }
}
