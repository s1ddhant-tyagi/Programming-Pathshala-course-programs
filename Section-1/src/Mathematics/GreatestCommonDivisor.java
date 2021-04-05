package Mathematics;

import java.util.ArrayList;

public class GreatestCommonDivisor {
//    static void solve(int a, int b)
//    {
//        int ans = 1;
//        int size = (a>b)?b:a;
//        for (int i = 2; i <= size; i++) {
//            if(a%i==0 && b%i==0)
//                ans = i;
//        }
//        System.out.println(ans);
//
//    }
//
//    public static void main(String[] args) {
//        int a=12, b=4;
//        solve(a,b);
//    }

    static void solve(int a, int b)
    {
        int dividend = Math.max(a,b);
        int divisor = Math.min(a,b);
        if (divisor == 0)
        {
            System.out.println(dividend);
            return;
        }
        while(dividend%divisor != 0)
        {
            int temp = divisor;
            divisor = dividend%divisor;
            dividend = temp;
        }
        System.out.println(divisor);
    }

    public static void main(String[] args) {
        int a=7, b=0;
        solve(a,b);
    }
}
