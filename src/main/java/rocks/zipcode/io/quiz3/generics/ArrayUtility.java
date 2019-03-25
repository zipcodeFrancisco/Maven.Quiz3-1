package rocks.zipcode.io.quiz3.generics;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {

        Map<SomeType, Long> xx = Arrays.asList(array)
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Set<SomeType> zz = xx
                .entrySet()
                .stream()
                .filter( e -> e.getValue() % 2 != 0 )
                .map(x -> x.getKey())
                .collect(Collectors.toSet());

        return zz.iterator().next();
    }

    public SomeType findEvenOccurringValue() {
        Map<SomeType, Long> xx = Arrays.asList(array)
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Set<SomeType> zz = xx
                .entrySet()
                .stream()
                .filter( e -> e.getValue() % 2 == 0 )
                .map(x -> x.getKey())
                .collect(Collectors.toSet());

        return zz.iterator().next();
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        Integer c = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valueToEvaluate){
                c++;
            }
        }
        return c;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        return Arrays.stream(array)
                .filter(element -> predicate.apply(element))
                .toArray(size -> Arrays.copyOf(array,size));
    }
}
