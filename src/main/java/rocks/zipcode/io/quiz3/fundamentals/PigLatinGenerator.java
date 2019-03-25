package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {

    /**
     *
     * If the word starts with a vowel, then return
     * the original string with "way" appended.
     *
     * If the word starts with a consonant, then shift consonants
     * from the beginning of the word to the end of the word until
     * the first vowel. Then, return the newly shifted string
     * with "ay" appended.
     */

    public String translate(String str) {

        String[] strArray = str.split(" ");
        StringBuilder strBuilder = new StringBuilder();

        for (String s : strArray) {
            if (VowelUtils.startsWithVowel(s)) strBuilder.append(s.concat("way"));
            else if ( !VowelUtils.startsWithVowel(s) ){
                int index = VowelUtils.getIndexOfFirstVowel(s);
                if (index == -1){
                    strBuilder.append(s.concat("ay"));
                }else {
                    String endPart = s.substring(index);
                    String beginPart = s.substring(0, index);
                    strBuilder.append(endPart + beginPart + "ay");
                }
            }
            strBuilder.append(" ");
        }
        strBuilder.delete(strBuilder.length()-1,strBuilder.length());
        return strBuilder.toString();
    }
}
