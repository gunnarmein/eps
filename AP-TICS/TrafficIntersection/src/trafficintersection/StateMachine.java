/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trafficintersection;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author gmein
 */
public class StateMachine implements FiniteStateMachine {

    int stateId;
    ArrayList<Delta> deltas = new ArrayList<>();
    HashMap<Integer, HashMap<String, Delta>> deltasByState = new HashMap<>();
    HashMap<Integer, State> states = new HashMap<>();

    @Override
    public State init(InputStream delta, int initialState) {
        stateId = 0;
        // skip Excel bill of materials
        Scanner sc = new Scanner(delta);
        // skip Excel bill of materials
        sc.nextLine();

        while (sc.hasNextLine()) {
            String s = sc.nextLine().trim();
            if (s.length() > 0) {
                System.out.println(s);
                String[] line = s.split(",");
                registerNewDelta(line);
            }
        }

        return states.get(initialState);
    }

    @Override
    public State getCurrentState() {
        return states.get(stateId);
    }

    @Override
    public String process(String input) {
        HashMap<String, Delta> group = deltasByState.get(stateId);
        if (group == null) {
            stateId = -1;
            System.out.println("invalid current state");
            return null;
        }

        String action = null;

        if (input != null) {
            Delta d = group.get(input);
            if (d != null) {
                System.out.println("From " + stateId + " bc " + input + " to " + d.newStateId);
                stateId = d.newStateId;
                action = d.action;
            } else {
                d = group.get("*");
                if (d != null) {
                    System.out.println("From " + stateId + " bc " + input + "* to " + d.newStateId);

                    stateId = d.newStateId;
                    action = d.action;
                }
            }
        }
        return action;
    }

    void registerNewDelta(String[] line) {
        try {
            if (line == null || line.length < 1) {
                return;
            }

            // skip comments marked with "!"
            if (line.length > 0 && line[0] == null || line[0].charAt(0) == '!') {
                return;
            }

            // state descriptor?
            if (line[0].equalsIgnoreCase("state")) {
                State s = new State(line);
                states.put(s.id, s);
                return;
            }
            // make a new entry for our transition table
            Delta d = new Delta(line);

            // add it to a master list (not sure why I am bothering)
            deltas.add(d);

            // organize under the state
            HashMap<String, Delta> group = deltasByState.get(d.stateId);
            if (group == null) {
                // make a new group for this state, if necessary
                group = new HashMap<>();
                deltasByState.put(d.stateId, group);
            }

            // within that group, organize by input string
            group.put(d.input, d);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    private class Delta {

        int stateId;
        String input;
        int newStateId;
        String action;

        Delta(String[] line) {
            stateId = Integer.parseInt(line[1].trim());
            input = line[2].trim();
            newStateId = Integer.parseInt(line[3].trim());
            action = line[4].trim();
        }
    }

}
