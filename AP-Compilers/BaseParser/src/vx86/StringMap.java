/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vx86;

import java.util.HashMap;

/**
 *
 * @author gmein
 */
public class StringMap {

        HashMap<Integer, String> map = new HashMap<>();

        public int newStringId(String s) {
            int id = map.size() + 1;
            map.put(map.size() + 1, s);
            return id;
        }

        public String getString(int id) {
            return map.get(id);
        }

    }