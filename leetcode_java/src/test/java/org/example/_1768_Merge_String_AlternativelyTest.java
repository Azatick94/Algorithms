package org.example;

import org.junit.jupiter.api.Test;

import static org.example._1768_Merge_String_Alternatively.mergeAlternately;
import static org.junit.jupiter.api.Assertions.*;

class _1768_Merge_String_AlternativelyTest {

    @Test
    void mergeAlternatelyTest1() {
        String word1 = "abc";
        String word2 = "pqr";

        String result = mergeAlternately(word1, word2);
        assertEquals("apbqcr", result);
    }

    @Test
    void mergeAlternatelyTest2() {
        String word1 = "a";
        String word2 = "pqr";

        String result = mergeAlternately(word1, word2);
        assertEquals("apqr", result);
    }

    @Test
    void mergeAlternatelyTest3() {
        String word1 = "abc";
        String word2 = "p";

        String result = mergeAlternately(word1, word2);
        assertEquals("apbc", result);
    }

}
