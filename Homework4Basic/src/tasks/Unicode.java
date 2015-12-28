/**
 * 
 */
package tasks;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author pzoli
 * 
 */
public class Unicode {

    public static void getCharInfo() {
        Character a = 'a';
        String result = Character.UnicodeBlock.of(a).toString().replace('_', ' ') + " " + Integer.toHexString(a.toString().codePointAt(0)).toUpperCase(Locale.ENGLISH);
        System.out.println(result);
    }

    public static void isPatternMatch() {
        String value = "árvíztűrő-tükörfúró.gép";
        Pattern pattern = Pattern.compile("[\\w-\\.]+", Pattern.UNICODE_CHARACTER_CLASS);
        Matcher matcher = pattern.matcher(value);
        if (matcher.matches()) {
            System.out.println(matcher.group());
        }
    }

    /**
     * Test Unicode
     */
    public static void test() {
        isPatternMatch();
        getCharInfo();
    }
}
