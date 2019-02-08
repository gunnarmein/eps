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
public class OO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EPSPerson p = new EPSPerson("Gunnar Mein", "gmein@eastsideprep.org");
        System.out.println(p);
        
        Student s = new Student ("Bohan", "Shakes", 9);
        System.out.println(s);
        
        MrOwen mo1 = new MrOwen();
        System.out.println("We made an object "+mo1.hashCode());
        mo1.setHobby("Biking");  
        MrOwen mo2 = new MrOwen();
        System.out.println("We made an object "+mo2.hashCode());
        mo2.setHobby("SeeaaaaaaHawks");
        
        System.out.println(mo1.getHobby());
        System.out.println(mo2.getHobby());
        
    }
    
}
