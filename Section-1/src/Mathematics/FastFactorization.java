package Mathematics;

public class FastFactorization {

    static void solve(int num, int n1)
    {
        int[] spf = new int[num+1];
        for (int i = 2; i*i <=num; i++) {
            if (spf[i]==0)
            {
                spf[i] = i;
                for (int j = i; i * j <= num; j++) {
                    if(spf[i*j]==0)
                    {
                        spf[i * j] = i;
                    }
                }
            }
        }

        for (int i = 1; i <= 10; i++) {
            System.out.print(spf[i]+" ");
        }

        while(n1>1)
        {
            if(spf[n1]==0)
            {
                System.out.println(n1);
                break;
            }
            System.out.println(spf[n1]);
            n1 = n1/spf[n1];

        }
    }

    public static void main(String[] args) {
        int num = 6060;
        int n1 = 4;
        solve(num, n1);
    }
}
