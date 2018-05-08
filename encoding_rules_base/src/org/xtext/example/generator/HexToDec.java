package org.xtext.example.generator;

public class HexToDec {
	public static long hex2decimal(String s) {
        String digits = "0123456789ABCDEF";
        s = s.toUpperCase().substring(2);
        long val = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int d = digits.indexOf(c);
            val = 16*val + d;
        }
        return val;
    }
}
