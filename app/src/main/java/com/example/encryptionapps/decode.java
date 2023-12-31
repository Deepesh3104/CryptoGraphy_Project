package com.example.encryptionapps;

import static java.lang.StrictMath.pow;

public class decode {
    public static String dec(String s) {
        String inv = "This code was not encrypted by CryptoGuard Pro";
        String initializer = "11111111";
        boolean flag = true;

        for (int i = 0; i < 8; i++) {
            if (initializer.charAt(i) != s.charAt(i)) {
                flag = false;
                break;
            }
        }

        if (!flag) {
            return inv;
        }

        String data = "";
        for (int i = 8; i < s.length(); i++) {
            char temp = s.charAt(i);
            data = data.concat(String.valueOf(temp));
        }

        int asc[][] = new int[11101][8];
        int idx = -1;
        int idx2 = 0;

        for (int i = 0; i < data.length(); i++) {
            if (i % 7 == 0) {
                idx++;
                idx2 = 0;
                char temp = data.charAt(i);
                asc[idx][idx2] = temp - '0';
                idx2++;
            } else {
                char temp = data.charAt(i);
                asc[idx][idx2] = temp - '0';
                idx2++;
            }
        }

        int num[] = new int[11111];
        int nidx = 0;
        int temp;
        int ct;

        for (int i = 0; i <= idx; i++) {
            ct = 0;
            temp = 0;
            for (int j = 6; j >= 0; j--) {
                int temp1 = (int) pow(2, ct);
                temp += (asc[i][j] * temp1);
                ct++;
            }
            num[nidx++] = temp;
        }

        StringBuilder rv = new StringBuilder();
        for (int i = 0; i < nidx; i++) {
            char ch = (char) num[i];
            rv.append(ch);
        }

        return rv.toString();
    }
}
