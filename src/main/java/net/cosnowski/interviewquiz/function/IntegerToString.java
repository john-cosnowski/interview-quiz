package net.cosnowski.interviewquiz.function;

public class IntegerToString
{
    static public String integerToString(int value)
    {
        StringBuilder sb = new StringBuilder();
        boolean isNeg = value < 0;
        value = Math.abs(value);
        do
        {
            int mod = value % 10;
            sb.insert(0, (char)(mod + '0'));
            value = value / 10;
        }
        while (value > 0);
        if (isNeg)
        {
            sb.insert(0, '-');
        }
        return sb.toString();
    }
}
