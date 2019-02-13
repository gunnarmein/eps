/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

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

        Student s = new Student("Bohan", "Shakes", 9);
        System.out.println(s);

        MrOwen mo1 = new MrOwen();
        System.out.println("We made an object " + mo1.hashCode());
        mo1.setHobby("Biking");
        MrOwen mo2 = new MrOwen();
        System.out.println("We made an object " + mo2.hashCode());
        mo2.setHobby("SeeaaaaaaHawks");

        System.out.println(mo1.getHobby());
        System.out.println(mo2.getHobby());

        //
        // Collections
        //
        ArrayList<String> list = new ArrayList<>(); // when you first type this,an error appears - click the lightbulb and import the class
        list.add("a");
        list.add("word");
        list.add("another");
        list.add("word");

        // sort the list, using the natural order of type String
        list.sort(null);

        // copy one list to another list
        ArrayList<String> list2 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            list2.add(list.get(i));
        }

        // copy one list to another list, leaving out anything that says "word"
        list2.clear();
        for (int i = 0; i < list.size(); i++) {
            String item = list.get(i);
            if (!s.equals("word")) {
                list2.add(item);
            }
        }

        // I can make ArrayLists of other items, too - like tuples
        Tuple t1 = new Tuple("hah", 1);
        Tuple t2 = new Tuple("bah", 2);

        ArrayList<Tuple> tlist = new ArrayList<>();  // I don't have to say "Tuple " on the right side because it is clear from the left side
        tlist.add(t1);
        tlist.add(t2);

        // and of course I can sort:
        tlist.sort(null);
        // what would the "natural sort order" be for a tuple? I am not giving a Comparator as an argument, so it will look for 
        // the "Comparable" interface on the Tuple class. Luckily, you are providing that. 

        ArrayList<String> speech = new ArrayList<>();
        speech.add("a");
        speech.add("b");
        speech.add("a");
        speech.add("c");
        speech.add("c");
        speech.add("b");

        ArrayList<String> useless = new ArrayList<>();
        useless.add("b");
        useless.add("c");

        System.out.println(speech);

//        for (int i = 0; i < useless.size(); i++) {
//
//            if (speech.contains(useless.get(i))) {
//
//                speech.remove(useless.get(i));
//
//                i--;
//
//            }
//
//        }
        for (int i = 0; i < useless.size(); i++) {
// if (speech.contains("\\s"+useless.get(i)+"\\s")) {

            if (speech.contains(useless.get(i))) {
                speech.remove(useless.get(i));

                i--;

            }
        }

        System.out.println(speech);

    }

}
