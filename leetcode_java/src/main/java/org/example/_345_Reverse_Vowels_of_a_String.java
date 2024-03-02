package org.example;

public class _345_Reverse_Vowels_of_a_String {


    public static boolean isVowel(char val) {
        return val == 'a' || val == 'e' || val == 'i' || val == 'o' || val == 'u' ||
                val == 'A' || val == 'E' || val == 'I' || val == 'O' || val == 'U';
    }

    public static String reverseVowels(String s) {

        char[] arr = s.toCharArray();

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            boolean leftIsVowel = isVowel(arr[left]);
            boolean rightIsVowel = isVowel(arr[right]);

            if (leftIsVowel && rightIsVowel) {
                char temp = arr[left];
                arr[left++] = arr[right];
                arr[right--] = temp;
                continue;
            }

            if (!leftIsVowel) left++;
            if (!rightIsVowel) right--;
        }

        return new String(arr);
    }
}
