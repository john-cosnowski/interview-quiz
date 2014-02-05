package net.cosnowski.interviewquiz.function;

import java.util.ArrayList;
import java.util.List;

public class StringPermutations
{
	private static String[] stringArray = new String[0];
	
    public static String[] printStringPermutations(String str)
    {
        char[] strChars = str.toCharArray();
        boolean[] usedChars = new boolean[strChars.length];
        StringBuilder out = new StringBuilder();
        List<String> results = new ArrayList<String>();
        doStringPermuations(strChars, usedChars, results, out, 0);
        System.out.println("Number permutations: " + results.size());
        return results.toArray(stringArray);
    }
    
    private static void doStringPermuations(
            char[] str, boolean[] usedChars, List<String> results,
            StringBuilder out, int level)
    {
        if (level == str.length)
        {
            System.out.println(out.toString());
            results.add(out.toString());
        }
        else
        {
            for (int i = 0; i < str.length; i++)
            {
                if (!usedChars[i])
                {
                    out.append(str[i]);
                    usedChars[i] = true;
                    doStringPermuations(str, usedChars, results, out, level + 1);
                    usedChars[i] = false;
                    out.setLength(out.length() - 1);
                }
            }
        }
    }
}
