package org.example;

public class _1768_Merge_String_Alternatively {


    public static String mergeAlternately(String word1, String word2) {

        int p1 = 0;
        int p2 = 0;

        int l1 = word1.length();
        int l2 = word2.length();
        StringBuilder builder = new StringBuilder();

        while (p1 < l1 || p2 < l2) {

            if (p1 < l1) {
                builder.append(word1.charAt(p1));
                p1++;
            }
            if (p2 < l2) {
                builder.append(word2.charAt(p2));
                p2++;
            }
        }

        return builder.toString();
    }


}
