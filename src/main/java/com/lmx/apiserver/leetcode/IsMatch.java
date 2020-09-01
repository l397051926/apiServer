package com.lmx.apiserver.leetcode;

/**
 * @author: lmx
 * @create: 2020/9/1
 **/
public class IsMatch {
    public static void main(String[] args) {
//        System.out.println(isMatch("ab", ".*"));
//        System.out.println(isMatch("aab", "c*a*b"));
        System.out.println(isMatch("aaaaac", "a*c"));
//        System.out.println(isMatch("a", "."));
    }

    /**
     * 举例几种情况 第一种  a=a  a=.
     * 第二种 aa = aa aa = a* aa = .*
     * a*s
     * aaab
     *"mississippi"
     * "mis*is*ip*."
     *
     * "mississippi"
     * "mis*is*p*."
     * @param s
     * @param p
     * @return
     */
    public static boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();

        boolean[][] f = new boolean[m + 1][n + 1];
        f[0][0] = true;
        for (int i = 0; i <= m; ++i) {
            for (int j = 1; j <= n; ++j) {
                if (p.charAt(j - 1) == '*') {
                    f[i][j] = f[i][j - 2];
                    if (matches(s, p, i, j - 1)) {
                        f[i][j] = f[i][j] || f[i - 1][j];
                    }
                }
                else {
                    if (matches(s, p, i, j)) {
                        f[i][j] = f[i - 1][j - 1];
                    }
                }
            }
        }
        return f[m][n];
    }

    public static boolean matches(String s, String p, int i, int j) {
        if (i == 0) {
            return false;
        }
        if (p.charAt(j - 1) == '.') {
            return true;
        }
        return s.charAt(i - 1) == p.charAt(j - 1);
    }

}
