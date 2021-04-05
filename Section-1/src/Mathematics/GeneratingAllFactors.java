package Mathematics;

public class GeneratingAllFactors {
    static void solve(int n)
    {
        for (int i = 1; i <= (int)Math.sqrt(n); i++) {
            if(n%i==0)
            {
                if(i*i==n)
                    System.out.println(i);
                else
                {
                    System.out.println(i);
                    System.out.println(n/i);
                }
            }
    }
    }

    public static void main(String[] args) {
        int n = 36;
        solve(n);
    }


//    static void solve(int n)
//    {
//        int root = (int)Math.sqrt(n);
//        if(root*root == n)
//            System.out.println(true);
//        else
//            System.out.println(false);
//    }
//
//    public static void main(String[] args) {
//        int n=5;
//        solve(n);
//    }
}
