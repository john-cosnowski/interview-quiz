package net.cosnowski.interviewquiz.function;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class FibonacciTest {

    @Test
    public void recursiveZeroShouldReturnZero()  {
        Long result = Fibonacci.recursive(0);
        assertThat(result, is(0L));
    }

    @Test
    public void recursiveOneShouldReturnOne()  {
        Long result = Fibonacci.recursive(1);
        assertThat(result, is(1L));
    }

    @Test
    public void recursiveTwoShouldReturnOne()  {
        Long result = Fibonacci.recursive(2);
        assertThat(result, is(1L));
    }

    @Test
    public void recursiveThreeShouldReturnTwo()  {
        Long result = Fibonacci.recursive(3);
        assertThat(result, is(2L));
    }

    @Test
    public void recursiveTwelveShouldReturn144()  {
        Long result = Fibonacci.recursive(12);
        assertThat(result, is(144L));
    }

    @Test
    public void iterativeZeroShouldReturnZero()  {
        Long result = Fibonacci.iterative(0);
        assertThat(result, is(0L));
    }

    @Test
    public void iterativeOneShouldReturnOne()  {
        Long result = Fibonacci.iterative(1);
        assertThat(result, is(1L));
    }

    @Test
    public void iterativeTwoShouldReturnOne()  {
        Long result = Fibonacci.iterative(2);
        assertThat(result, is(1L));
    }

    @Test
    public void iterativeThreeShouldReturnTwo()  {
        Long result = Fibonacci.iterative(3);
        assertThat(result, is(2L));
    }

    @Test
    public void iterativeTwelveShouldReturn144()  {
        Long result = Fibonacci.iterative(12);
        assertThat(result, is(144L));
    }
    
    //12586269025
    @Test
    public void iterative50()  {
        Long result = Fibonacci.iterative(50);
        assertThat(result, is(12586269025L));
    }
    
}
