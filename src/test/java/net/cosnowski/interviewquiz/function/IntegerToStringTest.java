package net.cosnowski.interviewquiz.function;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;


public class IntegerToStringTest
{
    @Test
    public void testZero()
    {
        int value = 0;
        String res = IntegerToString.integerToString(value);
        assertThat(res, is("0"));
    }
    
    @Test
    public void testOne()
    {
        int value = 1;
        String res = IntegerToString.integerToString(value);
        assertThat(res, is("1"));
    }
    
    @Test
    public void testOneHundred()
    {
        int value = 100;
        String res = IntegerToString.integerToString(value);
        assertThat(res, is("100"));
    }
    
    @Test
    public void testNegativeOne()
    {
        int value = -1;
        String res = IntegerToString.integerToString(value);
        assertThat(res, is("-1"));
    }
    
}
