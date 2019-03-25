package rocks.zipcode.io.quiz3.fundamentals;

import java.util.*;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        return str.substring(0,indexToCapitalize)
                .concat(str.substring(indexToCapitalize,indexToCapitalize + 1).toUpperCase())
                .concat(str.substring(indexToCapitalize + 1));
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        return baseString.charAt(indexOfString) == characterToCheckFor;
    }

    public static String[] getAllSubStrings(String string) {
        Set set = new HashSet();

        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                set.add( string.substring(i, j) );
            }
        }
        String[] array = (String[]) set.toArray(new String[set.size()]);
        Collections.sort(Arrays.asList(array));
        return array;
    }

    public static Integer getNumberOfSubStrings(String input){
        return getAllSubStrings(input).length;
    }
}
