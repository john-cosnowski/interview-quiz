package net.cosnowski.interviewquiz.util;

import static org.hamcrest.CoreMatchers.equalTo;

import java.util.Arrays;

import org.hamcrest.Matcher;
import org.hamcrest.collection.IsArray;

public class MatcherUtils {

    @SafeVarargs
    public static <T> IsArray<T> arrayMatcherEqualTo(T...elements)  {
        @SuppressWarnings("unchecked")
        Matcher<T>[] elementMatchers = new Matcher[elements.length];
        for (int i = 0; i < elements.length; i++)  {
            elementMatchers[i] = equalTo(elements[i]);
        }
        return IsArray.array(elementMatchers);
    }
    
    public static Integer[] box(int[] array)  {
        //  New in Java 8
        return Arrays.stream(array).boxed().toArray(Integer[]::new);
    }
}
