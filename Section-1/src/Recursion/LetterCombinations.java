package Recursion;

public class LetterCombinations {

    static void letComb(String ans, String given, int givInd, String[] digitMap)
    {
        if(givInd >= given.length())
        {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < digitMap[given.charAt(givInd)-48].length(); i++) {
            letComb(ans+digitMap[given.charAt(givInd)-48].charAt(i), given, givInd+1, digitMap);
        }
    }


    public static void main(String[] args) {
        String[] digitMap = new String[10];
        digitMap[0] = "";
        digitMap[1] = "";
        digitMap[2] = "abc";
        digitMap[3] = "def";
        digitMap[4] = "ghi";
        digitMap[5] = "jkl";
        digitMap[6] = "mno";
        digitMap[7] = "pqrs";
        digitMap[8] = "tuv";
        digitMap[9] = "wxyz";
        letComb("", "237", 0, digitMap);
    }
}
