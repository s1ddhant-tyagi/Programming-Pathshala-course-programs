package Mathematics;

public class LowestCommonMultiple {
//    static void solve(int a, int b)
//    {
//        int ans=-1;
//        for(int i = Math.max(a,b); i<=a*b; i++)
//        {
//            if(i%a==0 && i%b==0)
//            {
//                ans=i;
//                break;
//            }
//        }
//        System.out.println(ans);
//    }
//
//    public static void main(String[] args) {
//        int a=5, b=7;
//        solve(a,b);
//    }

//    static int HCF(int a, int b)
//    {
//        int dividend = Math.max(a,b);
//        int divisor = Math.min(a,b);
//        if(divisor==0) return dividend;
//
//        while(dividend%divisor !=0)
//        {
//            int temp = divisor;
//            divisor = dividend%divisor;
//            dividend = temp;
//        }
//        return divisor;
//    }
//
//    static int solve(int[] arr)
//    {
//        int n = arr.length;
//        if(arr[0]==0 || arr[1]==0 ) return 0;
//        int hcf = HCF(arr[0], arr[1]);
//        int lcm = (arr[0]*arr[1])/hcf;
//        for (int i = 2; i < n; i++) {
//            if(arr[i] == 0) return 0;
//            hcf = HCF(lcm, arr[i]);
//            lcm = (lcm*arr[i])/hcf;
//        }
//        return lcm;
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {1,2,8,3};
//        int lcm = solve(arr);
//        System.out.println(lcm);
//    }

    static int HCF(int a, int b)
    {
        int dividend = Math.max(a,b);
        int divisor = Math.min(a,b);
        if(divisor==0) return dividend;

        while(dividend%divisor !=0)
        {
            int temp = divisor;
            divisor = dividend%divisor;
            dividend = temp;
        }
        return divisor;
    }

    static int LCM(int a, int b)
    {
        return (a*b)/HCF(a,b);
    }

    static void solve(int n, int a, int b)
    {
        int ans = n/a+n/b;
        int common = n/LCM(a,b);
        ans -= common;
        System.out.println(ans);
    }

    public static void main(String[] args) {
        int n=25, a=4, b=6;
        solve(n,a,b);
    }
}
