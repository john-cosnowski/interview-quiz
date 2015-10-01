package net.cosnowski.interviewquiz.function;

public class Fibonacci {
    static public <T extends Number> Long recursive(T value)  {
        long roundValue = value.longValue();
        if (roundValue < 0)  {
            throw new IllegalArgumentException();
        } else if (roundValue == 0)  {
            return Long.valueOf(0L);
        } else if (roundValue == 1)  {
            return Long.valueOf(1L);
        } else {
            return Fibonacci.recursive(roundValue - 1) + Fibonacci.recursive(roundValue - 2);
        }
    }

    static public <T extends Number> Long iterative(T value)  {
        long roundValue = value.longValue();
        if (roundValue < 0)  {
            throw new IllegalArgumentException();
        } else if (roundValue == 0)  {
            return Long.valueOf(0L);
        } else if (roundValue == 1)  {
            return Long.valueOf(1L);
        } else {
            long fNminus2 = 0;
            long fNminus1 = 1;
            for (long index = 2; index < roundValue; index++)  {
                long temp = fNminus1;
                fNminus1 = fNminus1 + fNminus2;
                fNminus2 = temp;
            }
            return Long.valueOf(fNminus1 + fNminus2);
        }
    }
    
    static public long recursiveWithSeed(long f0, long f1, long index)  {
        if (index < 0)  {
            throw new IllegalArgumentException();
        }
        if (index == 0)  {
            return f0;
        }
        if (index == 1)  {
            return f1;
        }
        return Math.addExact(recursiveWithSeed(f0, f1, index - 2), recursiveWithSeed(f0, f1, index - 1));
    }
    
    static public long iterativeWithSeed(long f0, long f1, long index)  {
        if (index < 0)  {
            throw new IllegalArgumentException();
        }
        if (index == 0)  {
            return f0;
        }
        if (index == 1)  {
            return f1;
        }
        long valueMinus2 = f0;
        long valueMinus1 = f1;
        for (long i = 2; i < index; i++)  {
            long temp = valueMinus1;
            valueMinus1 = Math.addExact(valueMinus1, valueMinus2);
            valueMinus2 = temp;
        }
        return Math.addExact(valueMinus1, valueMinus2);
    }
}
