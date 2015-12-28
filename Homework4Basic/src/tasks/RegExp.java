/**
 * 
 */
package tasks;

import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
 * http://docs.oracle.com/javase/tutorial/essential/regex/
 * http://www.regular-expressions.info/unicode.html
*/
public class RegExp {

    public final static String regexpRef = new String("^[\\p{L}_]{1}[\\p{L}\\.-_]*");
    public final static String regexpSpace = new String("^\\s+");
    public final static String regexpDigits = new String("[\\d]+[\\d\\.]*");
    public final static String regexpPlus = new String("^\\+");
    public final static String regexpMinus = new String("^\\-");
    public final static String regexpString = new String("\"");

    public static void regExpSamples() throws Exception {
        int patternStartIdx = 13;
        String value = "this.int1 + 14.54";
        Pattern p = Pattern.compile(regexpDigits);
        Matcher m = p.matcher(value);
        
        if (m.find(patternStartIdx)) {
            System.out.println(value.substring(m.start(), m.end()));
        }
        
        p = Pattern.compile(regexpSpace);
        m = p.matcher(value);
        if (m.find(10)) {
            System.out.println("\""+value.substring(m.start(), m.end())+"\"");
        }
        
        // \Q - \E
        String value2 = p.quote("\"rest easy\" + [12345] + regexp");
        p = Pattern.compile(value2);
        m = p.matcher(value2);
        if (m.find()) {
            System.out.println(value2.substring(m.start(), m.end()));
        }
    }
}
