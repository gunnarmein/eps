package oo;

import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gmein
 */
public class MrOwen extends EPSPerson implements Electrician {
    
    static int nextId = 0;
    int id;
    
    MrOwen() {
        id = nextId++;
    }

    @Override
    public void installOutlet() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void fixLights() {
        System.out.println("Random number : "+random.nextInt());
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void tryToFixInternetButFail() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString () {
        return "Hi I am Mr. Owen!";
    }
    
    private static String currentHobby;
    
    String getHobby() {
        return currentHobby;
    }
    
    void setHobby(String newHobby) {
        System.out.println("Setting new hobby for: "+this.hashCode());
        this.currentHobby = newHobby;
    }
    
    
    static void doSomeUsefulStuff(int a) {
       
    }
    
}
