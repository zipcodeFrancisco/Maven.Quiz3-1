package rocks.zipcode.io.quiz3.fundamentals;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        for (String s : word.split("")) {
            if ( isVowel(s.charAt(0)) ) return true;
        }
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        int counter = 0;
        for (String s : word.split("")) {
            if ( isVowel(s.charAt(0)) ) return counter;
            counter++;
        }
        return -1;
    }


    public static Boolean startsWithVowel(String word) {
        return getIndexOfFirstVowel(word) == 0 ? true : false;
    }

    public static Boolean isVowel(Character character) {
        String vowels = "aeiou";
        for (String s : vowels.toLowerCase().split("")) {
            if (s.equals(character.toString().toLowerCase())) return true;
        }
        return false;
    }




}
