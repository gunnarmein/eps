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
public class Student extends EPSPerson {
    int grade;
    
    Student(String fname, String lname, int grade) {
        this.name = fname+" "+lname;
        this.contactEmail = (fname.substring(0,1)+lname+"@eastsideprep.org").toLowerCase();
        this.grade = grade;
    }
    
    
    @Override 
    public String toString() {
        return "Student: "+name+", email: "+contactEmail+", grade "+grade;
    }
    
}
