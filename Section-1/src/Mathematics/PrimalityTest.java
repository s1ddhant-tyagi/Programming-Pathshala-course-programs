package Mathematics;

public class PrimalityTest {
//    static boolean solve(int n)
//    {
//        for(int i=2; i<=n/2; i++)
//        {
//            if(n%i==0)
//                return false;
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//        int n = 11;
//        System.out.println(solve(n));
//    }


    static boolean solve(int n)
    {
        for(int i=2; i*i<=n; i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n =2;
        System.out.println(solve(n));
    }


}
