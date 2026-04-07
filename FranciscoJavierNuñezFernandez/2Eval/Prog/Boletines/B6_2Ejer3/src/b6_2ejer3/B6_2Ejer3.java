
package b6_2ejer3;

/**
 *
 * @author elfra
 */
import java.util.regex.*;

public class B6_2Ejer3 {

    
    public static void main(String[] args) {
 // Apartado a)
 
Pattern p = Pattern.compile("^-?[0-9]+$"); 
Matcher m = p.matcher("-999");

 if (m.matches()) {

            System.out.println("Coincide el patrón del a)");
        } else {
            System.out.println("El patrón a) no coincide");
        }
    
 // Apartado b)
    
 Pattern pb = Pattern.compile("^[0-9]+$");
 Matcher mb = pb.matcher("22222");
 if (mb.matches()) {

            System.out.println("Coincide el patrón del b)");
        } else {
            System.out.println("El patrón b) no coincide");
        }
 
 // Apartado c)
 
 Pattern pc = Pattern.compile("^-[0-9]+$");
 Matcher mc = pc.matcher("-555");
  
  if (mc.matches()) {

            System.out.println("Coincide el patrón del c)");
        } else {
            System.out.println("El patrón c) no coincide");
        }
  
  // Apartado d)
  
 Pattern pd = Pattern.compile("^[0-9]{8}[A-Z]$");
 Matcher md = pd.matcher("53776358N");
  
  if (md.matches()) {

            System.out.println("Coincide el patrón del d)");
        } else {
            System.out.println("El patrón d) no coincide");
        }
  // Apartado f)
 Pattern pf = Pattern.compile("^[0-9]{4}[A-Z]{3}$");
 Matcher mf = pf.matcher("1410HYC");
  
  if (mf.matches()) {

            System.out.println("Coincide el patrón del f)");
        } else {
            System.out.println("El patrón f) no coincide");
        }
  // Apartado g)
  
 Pattern pg = Pattern.compile("[01]+");
 Matcher mg = pg.matcher("1");
  
  if (mg.matches()) {

            System.out.println("Coincide el patrón del g)");
        } else {
            System.out.println("El patrón g) no coincide");
        }
  
  // Apartado h)
  
 Pattern ph = Pattern.compile("[0-7]+");
 Matcher mh = ph.matcher("17");
  
  if (mh.matches()) {

            System.out.println("Coincide el patrón del h)");
        } else {
            System.out.println("El patrón h) no coincide");
        }
 Pattern pi = Pattern.compile("[0-9A-F]+");
 Matcher mi = pi.matcher("F134D");
  
  if (mi.matches()) {

            System.out.println("Coincide el patrón del c)");
        } else {
            System.out.println("El patrón c) no coincide");
        }
  }  
}
