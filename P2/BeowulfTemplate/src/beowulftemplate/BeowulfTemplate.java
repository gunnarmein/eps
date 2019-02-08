package beowulftemplate;

import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author gmein
 */
public class BeowulfTemplate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // opens the beowulf.txt file that is under src\beowulftemplate\resourcces in your porject folder
        // in your project, make a folder resources under src\<yourpackage> and put beowulf.txt in there
        InputStream is = BeowulfTemplate.class.getResourceAsStream("resources/beowulf.txt");
        if (is == null) {
            System.out.println("beowulf.txt not found");
            System.exit(-1);
        }
        
        
        // goes through beowulf and prints every word. This is not what you want to do.
        Scanner sc = new Scanner(is);
        while (sc.hasNext()) {
            System.out.println(sc.next());
        }
    }

}
