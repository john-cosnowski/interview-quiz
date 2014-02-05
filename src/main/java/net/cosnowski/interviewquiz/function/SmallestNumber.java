package net.cosnowski.interviewquiz.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SmallestNumber
{
	/**
	 * Given any integer, find the smallest integer that can
	 * that can be created from all the digits in the number.
	 * @param number number to read digits from
	 * @return smallest number using all digits in number
	 */
	static public int FindSmallestNumber(int number)
	{
		if (number < 10)
		{
			return number;
		}
		List<Integer> digits = getDigits(number);
		Integer[] digitsArray = digits.toArray(new Integer[digits.size()]);
		Arrays.sort(digitsArray);
		for (int i = digitsArray.length - 1; i > 0; i--)
		{
			if (digitsArray[i - 1] == 0)
			{
				digitsArray[i - 1] = digitsArray[i];
				digitsArray[i] = 0;
			}
		}
		return getIntValue(digitsArray);
	}

	private static int getIntValue(Integer[] digitsArray)
	{
		int accumulator = 0;
		for (int i = 0; i < digitsArray.length; i++)
		{
			accumulator = (accumulator * 10) + digitsArray[i];
		}
		return accumulator;
	}

	private static List<Integer> getDigits(int number)
	{
		List<Integer> digits = new ArrayList<Integer>();
		do
		{
			digits.add(number % 10);
			number = number / 10;
		}
		while (number > 0);
		return digits;
	}
}
