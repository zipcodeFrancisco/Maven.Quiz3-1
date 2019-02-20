package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        return null;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        return null;
    }

    public static String[] getAllSubStrings(String string) {
        List<String> result = new ArrayList<>();
        int length = string.length();
        for (int c = 0; c < length; c++) {
            for (int i = 1; i <= length - c; i++) {
                result.add(string.substring(c, c + i));
            }
        }
        return result.stream().distinct().toArray(String[]::new);
    }

    public static Integer getNumberOfSubStrings(String input) {
        return getAllSubStrings(input).length;
    }
}
