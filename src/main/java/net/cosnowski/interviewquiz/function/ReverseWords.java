package net.cosnowski.interviewquiz.function;

public class ReverseWords {

    public static void reverse(char[] buf, int start, int end)  {
        if (start > end)  {
            int temp = start;
            start = end;
            end = temp;
        }
        for (; start < end; start++, end--)  {
            char temp = buf[start];
            buf[start] = buf[end];
            buf[end] = temp;
        }
    }
    
    public static void reverseWords(char[] buf)  {
        ReverseWords.reverse(buf, 0, buf.length - 1);
        for (int start = 0; start < buf.length; )  {
            int firstNonSpace = start;
            for (; firstNonSpace < buf.length && Character.isWhitespace(buf[firstNonSpace]); firstNonSpace++)
                ;
            if (firstNonSpace >= buf.length) {
                break;
            }
            int firstSpace = firstNonSpace;
            for (; firstSpace < buf.length && !Character.isWhitespace(buf[firstSpace]); firstSpace++)
                ;
            ReverseWords.reverse(buf, firstNonSpace, firstSpace - 1);
            start = firstSpace;
        }
    }
    
    public static String reverseWords(String value)  {
        char[] valueBuf = value.toCharArray();
        ReverseWords.reverseWords(valueBuf);
        return new String(valueBuf);
    }
}
