/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arduinocomm;

import dk.thibaut.serial.SerialPort;
import dk.thibaut.serial.enums.BaudRate;
import dk.thibaut.serial.enums.DataBits;
import dk.thibaut.serial.enums.Parity;
import dk.thibaut.serial.enums.StopBits;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gmein
 */
public class ArduinoPort {

    private SerialPort port;
    private InputStream is;
    private OutputStream os;

    boolean initialize() {
        try {
            // Get a list of available ports names (COM2, COM4, ...)
            List<String> portNames = SerialPort.getAvailablePortsNames();

            for (String name : portNames) {
                // Get a new instance of SerialPort by opening a port.
                System.out.println("trying port " + name + " ...");
                port = SerialPort.open(name);

                // Configure the connection
                port.setTimeout(100);
                port.setConfig(BaudRate.B9600, Parity.NONE, StopBits.ONE, DataBits.D8);

                os = port.getOutputStream();
                String msg = "Are you the Arduino?";
                //System.out.println("writing ...");
                os.write(msg.getBytes());
                //System.out.println("done writing");

                Thread.sleep(100);

                is = port.getInputStream();
                byte[] byteBuffer = new byte[4096];
                int n = is.read(byteBuffer);
                String s = new String(byteBuffer, 0, n);
                //System.out.println("read " + n + " bytes");
                if (n > 0) {
                    if (s.equals("Yes I am the Arduino")) {
                        System.out.println("success!");
                        return true;
                    }
                }
                port.close();
            }
        } catch (Exception e) {
            System.out.println("Exception in serial comm: " + e);
        }

        is = null;
        os = null;
        port = null;

        return false;
    }

    public void write(String s) {
        try {
            os.write(s.getBytes());
        } catch (IOException ex) {
            System.out.println("Serial comm exception: " + ex);
        }

    }

    public int read(byte[] ab) {
        int n = 0;
        try {
            n = is.read(ab);
        } catch (IOException ex) {
            System.out.println("Serial comm exception: " + ex);
        }
        return n;
    }
}
