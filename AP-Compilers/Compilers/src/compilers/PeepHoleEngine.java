/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilers;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import vx86.Instruction;
import vx86.Program;
import vx86.Util;
import vx86.Vx86;

/**
 *
 * @author gmein
 */
public class PeepHoleEngine {

    public static class Pattern {

        LinkedList<Instruction> list;
        Object matchThis;
        Object matchThat;

        public Pattern() {
            list = new LinkedList<>();
        }

        public void add(Instruction x) {
            list.add(x);
        }

        public void clear() {
            matchThis = null;
            matchThat = null;
        }

        public boolean match(List<Instruction> sample) {
            Iterator<Instruction> p = this.list.iterator();
            Iterator<Instruction> s = sample.iterator();

            while (p.hasNext() && s.hasNext()) {
                //Util.print(".");
                Instruction xp = p.next();
                Instruction xs = s.next();

                if (!xp.matches(xs)) {
                    matchThis = null;
                    matchThat = null;
                    return false;
                }

                if (matchThis == null) {
                    matchThis = xp.extractThis(xs);
                }
                if (matchThat == null) {
                    matchThat = xp.extractThat(xs);
                }
            }

            // whole pattern matched?
            if (!p.hasNext()) {
                return true;
            }

            matchThis = null;
            matchThat = null;
            return false;
        }

        public void fillFrom(Pattern src) {
            for (Instruction x : this.list) {
                x.fillThisAndThat(src.matchThis, src.matchThat);
            }
        }

    }

    void process(Program p, PeepHoleApplication pa) {
        for (int i = 0; i < p.size(); i++) {
            pa.pattern.clear();
            if (pa.pattern.match(p.subList(i, i + Math.min(p.size() - i, pa.pattern.list.size())))) {
                Util.print(" Match found for " + pa.name + " in " + i + ", replacing, variables: ");
                Util.println(pa.pattern.matchThis + ", " + pa.pattern.matchThat);
                pa.substitution.fillFrom(pa.pattern);
                p.replace(i, pa.pattern.list.size(), pa.substitution.list);
                pa.pattern.clear();
            }
        }
    }

    void processAll(Program p, List<PeepHoleApplication> lps) {
        int oldSize;
        do {
            oldSize = p.size();
            // process all patterns
            for (PeepHoleApplication pa : lps) {
                process(p, pa);
                Util.println("Done processing pattern " + pa.name);
                p.dump();
            }
        } while (p.size() != oldSize); // until no more improvement
    }
}
