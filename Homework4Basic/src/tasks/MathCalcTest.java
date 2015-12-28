/**
 * 
 */
package tasks;

/**
 * @author pzoli
 *
 */
public class MathCalcTest {

        public static void main(){
          double degrees = 45.0;
          double radians = Math.toRadians(degrees);
          double a = 60.0;
          double b = 60.0;
          double c = a/Math.sin(radians);
          System.out.format("The value of pi is %.4f%n", Math.PI);
          
          System.out.format("The sin(alpha) is %.4f %n",
                  a/c);

          System.out.format("The length of c side is %.4f with %.4f alpha degrees %n",
                  c, degrees);

          System.out.format("The arcsine of %.4f is %.4f degrees %n",
                          Math.sin(radians),
                          Math.toDegrees(Math.asin(Math.sin(radians))));
          System.out.format("The arctan of %.4f is %.4f degrees %n",
                          a/b,
                          Math.toDegrees(Math.atan(a/b)));
        }
}
