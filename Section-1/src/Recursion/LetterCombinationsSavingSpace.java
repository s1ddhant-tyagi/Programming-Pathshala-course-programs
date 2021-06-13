package Recursion;

public class LetterCombinationsSavingSpace {

    static void letComb(char[] ans, String given, int gInd, String[] digitMap)
    {
        if(gInd >= given.length())
        {
            for (int i = 0; i < ans.length; i++) {
                System.out.print(ans[i]);
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < digitMap[given.charAt(gInd)-48].length(); i++) {
            ans[gInd] = digitMap[given.charAt(gInd)-48].charAt(i);
            letComb(ans, given, gInd+1, digitMap);
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
        char[] ans = new char[3];
        letComb(ans, "237", 0, digitMap);
    }
}
