package org.example;

import static org.example._345_Reverse_Vowels_of_a_String.reverseVowels;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _345_Reverse_Vowels_of_a_StringTest {

    @Test
    void reverseVowelsTest1() {
        String text = "Hello";
        String result = reverseVowels(text);

        assertEquals("Holle", result);
    }

    @Test
    void reverseVowelsTest2() {
        String text = "leetcode";
        String result = reverseVowels(text);

        assertEquals("leotcede", result);
    }

    @Test
    void reverseVowelsTest3() {
        String text = "HEllo";
        String result = reverseVowels(text);

        assertEquals("HollE", result);
    }


}
