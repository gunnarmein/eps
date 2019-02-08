/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oo;

/**
 *
 * @author gmein
 */
public class EPSPerson {
    protected String name;
    protected String contactEmail;
    void quickContact(String message) {
        // email
    }
    
    EPSPerson(){
    }
    
    EPSPerson(String name, String email) {
        this.name = name;
        this.contactEmail = email;
        System.out.println(this);
    }
    
   
    public String toString() {
        return "EPSPerson: "+name+", email: "+contactEmail;
    }
    
    
}
