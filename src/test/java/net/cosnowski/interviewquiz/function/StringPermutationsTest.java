package net.cosnowski.interviewquiz.function;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;


public class StringPermutationsTest
{
    @Test
    public void testAB()
    {
        final String testValue = "AB";
        String[] results = StringPermutations.printStringPermutations(testValue);
        assertThat(results.length, is(2));
    }

    @Test
    public void testABCD()
    {
        final String testValue = "ABCD";
        String[] results = StringPermutations.printStringPermutations(testValue);
        assertThat(results.length, is(24));
    }
}
