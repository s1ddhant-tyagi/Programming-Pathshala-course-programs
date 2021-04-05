package Mathematics;

public class PrimeFactorization {



//    static void solve(int n)
//    {
//        int num = n;
//        for (int i = 2; i <= num; i++) {
//            while(n%i == 0)
//            {
//                System.out.print(i+" ");
//                n /= i;
//            }
//        }
//    }

//---------------------------------------------------------------------------------------


    static boolean check(int n)
    {
        for (int i = 2; i*i <= n; i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }

    static void solve(int n)
    {
        int change = n;
        for (int i = 2; i*i <= n; i++) {
            while(change%i == 0)
            {
                System.out.print(i+" ");
                change /= i;
            }
        }
        if(change != 1)
            System.out.print(change);
    }

    public static void main(String[] args) {
        int n=2149;
        solve(n);
    }
}
