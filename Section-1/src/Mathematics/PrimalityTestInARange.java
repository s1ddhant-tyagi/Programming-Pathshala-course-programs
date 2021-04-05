package Mathematics;

import java.sql.SQLOutput;

public class PrimalityTestInARange {
    static void solve(int n)
    {
        for(int i=2; i<=n; i++)
        {
            boolean flag = true;
            for (int j = 2; j*j <= i; j++) {
                if(i%j == 0)
                {
                    flag = false;
                    break;
                }
            }
            if(flag)
                System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int n = 100;
        solve(100);
    }
}
