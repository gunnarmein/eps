/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trafficintersection;

import java.io.InputStream;

/**
 *
 * @author gmein
 */
public interface FiniteStateMachine {
    State init(InputStream delta, int initialState);
    String process(String input);
    State getCurrentState();
}
