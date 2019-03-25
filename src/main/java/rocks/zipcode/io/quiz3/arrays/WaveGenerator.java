package rocks.zipcode.io.quiz3.arrays;

import rocks.zipcode.io.quiz3.fundamentals.StringUtils;
import rocks.zipcode.io.quiz3.fundamentals.VowelUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {

        String lowerStr = str.toLowerCase();
        List<String> list = new ArrayList();
        for (int i = 0; i < lowerStr.length(); i++) {
            if ( lowerStr.substring(i,i+1).matches("[a-z]") ) {
                    list.add(StringUtils.capitalizeNthCharacter(lowerStr, i));
            }
        }
        String[] result = list.toArray(new String[0]);
        return result;
    }
}
