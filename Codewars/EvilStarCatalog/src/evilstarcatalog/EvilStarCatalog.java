/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evilstarcatalog;



/**
 *
 * @author guberti
 */
public class EvilStarCatalog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[][] catalog = new double[][] {
            new double[] {-600.4013619371242,   663.3727593516903,   10.775074027138885 },
            new double[] {-427.7227152824023,   525.7984890979155,  -209.95790868271808 },
            new double[] {-178.21876569094798,  496.6218822376138,  -581.3966201501732  },
            new double[] { 376.788432966282,   -901.2356664570855,  -447.65852084166875 },
            new double[] { 121.32412172379236, -799.879150291442,    32.21341082145909  },
            new double[] {-68.62472802981063,   428.39491679126036, -379.3684839366857  },
            new double[] { 577.6448628305502,   901.419822491943,   -851.7581231850075  },
            new double[] {-998.1831495419673,   488.98353654308335,  640.7779446374359  }};
        
        StarPositioner positioner = new StarPositioner(catalog);
        
        double[][] observations = new double[][] {
            new double[] {1.6697366504665592,  2.4642006264959466 },
            new double[] {1.9995468158464413,  2.4626825999200097 },
            new double[] {2.5235217088088477,  2.1825088866900657 },
            new double[] {2.055972757464053,  -1.3010855013482359 },
            new double[] {1.6459618545806944, -1.5471041102631036 },
            new double[] {2.4853561579626464,  2.045170908704814  },
            new double[] {2.3661669856760694,  1.0333244382055098 },
            new double[] {1.1362198405133772,  2.8011753808764595 }};
        
        double[] position = positioner.getPosition(observations);
        double[] expected = new double[] {100.0, 100.0, 100.0, 
            3.141592653589793, 3.141592653589793};
            
        double allowedDeviation = 0.00000001;
        for (int i = 0; i < 5; i++) {
            if (Math.abs(position[i]- expected[i])> allowedDeviation) {
                System.out.println("failed: expected "+expected[i]+", received "+position[i]);
                return;
            }
        }
        System.out.println("passed!");
    }
}
