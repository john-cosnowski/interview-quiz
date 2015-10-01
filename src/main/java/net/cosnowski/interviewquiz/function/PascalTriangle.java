package net.cosnowski.interviewquiz.function;

public class PascalTriangle {

    public static int[] getPascalTriangleLevel(int level)  {
        if (level < 1)  {
            throw new IllegalArgumentException();
        } else if (level == 1)  {
            return new int[]{1};
        } else if (level == 2)  {
            return new int[]{1,1};
        } else {
            int[] prev = getPascalTriangleLevel(level - 1);
            int[] ret = new int[level];
            ret[0] = 1;
            ret[level - 1] = 1;
            for (int i = 1; i < level - 1; i++) {
                ret[i] = prev[i - 1] + prev[i];
            }
            return ret;
        }
    }
}
