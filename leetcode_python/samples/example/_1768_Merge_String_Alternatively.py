def mergealternately(word1: str, word2: str) -> str:
    p1 = 0
    p2 = 0

    l1 = len(word1)
    l2 = len(word2)

    result = ""
    while (p1 < l1) or (p2 < l2):
        if p1 < l1:
            result += word1[p1]
            p1 += 1
        if p2 < l2:
            result += word2[p2]
            p2 += 1

    return result
