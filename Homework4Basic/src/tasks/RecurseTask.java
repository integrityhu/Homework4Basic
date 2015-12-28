/**
 * 
 */
package tasks;

/**
 * @author pzoli
 *
 */
public class RecurseTask {
    
    private static Boolean value = false;
    
    private static void recurse(StringBuffer param, int cnt) {
        if (cnt < 5) {
            System.out.println(cnt + " = " + value);
            cnt++;
            param.append("=");
            recurse(param, cnt);
            param.append("-");
            value = !value;              
        }
        System.out.println(cnt + " = " + value);
        System.out.println(param);
    }

    public static void main(Boolean value) {
        RecurseTask.value = value;
        StringBuffer buff = new StringBuffer();
        recurse(buff, 0);
    }
}
