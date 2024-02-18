import unittest

from samples.example._1768_Merge_String_Alternatively import mergealternately


class Test1768(unittest.TestCase):

    def test1(self):
        word1 = "abc"
        word2 = "pqr"

        result = mergealternately(word1, word2)
        self.assertEqual(result, "apbqcr")

    def test2(self):
        word1 = "a"
        word2 = "pqr"

        result = mergealternately(word1, word2)
        self.assertEqual(result, "apqr")

    def test3(self):
        word1 = "abc"
        word2 = "p"

        result = mergealternately(word1, word2)
        self.assertEqual(result, "apbc")


