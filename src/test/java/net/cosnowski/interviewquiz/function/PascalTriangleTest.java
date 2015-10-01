package net.cosnowski.interviewquiz.function;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import static net.cosnowski.interviewquiz.util.MatcherUtils.arrayMatcherEqualTo;
import static net.cosnowski.interviewquiz.util.MatcherUtils.box;

public class PascalTriangleTest {

    @Test
    public void shouldReturnOne()  {
        int[] result = PascalTriangle.getPascalTriangleLevel(1);
        assertThat(result.length, is(1));
    }

    @Test
    public void shouldReturnOneOne()  {
        int[] result = PascalTriangle.getPascalTriangleLevel(2);
        assertThat(box(result), is(arrayMatcherEqualTo(1,1)));
    }

    @Test
    public void shouldReturnLevelThree()  {
        int[] result = PascalTriangle.getPascalTriangleLevel(3);
        assertThat(box(result), is(arrayMatcherEqualTo(1,2,1)));
    }

    @Test
    public void shouldReturnLevelFive()  {
        int[] result = PascalTriangle.getPascalTriangleLevel(5);
        assertThat(box(result), is(arrayMatcherEqualTo(1,4,6,4,1)));
    }
}
