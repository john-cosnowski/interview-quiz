package net.cosnowski.interviewquiz.function;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ReverseWordsTest {

    @Test
    public void shouldReverseTwoWords()  {
        String test = "Barack Obama";
        String result = ReverseWords.reverseWords(test);
        assertThat(result, is("Obama Barack"));
    }

    @Test
    public void shouldReverseTwoWordsWithPadding()  {
        String test = "  Barack Obama   ";
        String result = ReverseWords.reverseWords(test);
        assertThat(result, is("   Obama Barack  "));
    }

    @Test
    public void shouldNotChangeOneWord()  {
        String test = "Barack";
        String result = ReverseWords.reverseWords(test);
        assertThat(result, is("Barack"));
        assertThat(result == test, is(false));
    }
}
