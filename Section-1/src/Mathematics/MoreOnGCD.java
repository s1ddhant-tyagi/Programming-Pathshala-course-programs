package Mathematics;

public class MoreOnGCD {
//    static int solve(int[] arr)
//    {
//        int n = arr.length;
//        for (int i = 0; i < n-1; i++) {
//            int a = arr[i];
//            int b = arr[i+1];
//
//            int dividend = Math.max(a,b);
//            int divisor = Math.min(a,b);
//            if (divisor == 0)
//            {
//                arr[i+1] = dividend;
//                // you can also take a variable and store fcd in it
//                continue;
//            }
//            while(dividend%divisor != 0)
//            {
//                int temp = divisor;
//                divisor = dividend%divisor;
//                dividend = temp;
//            }
//            arr[i+1] = divisor;
//        }
//        return arr[n-1];
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {6, 10, 15};
//        System.out.println(solve(arr));
//    }


    static int solve(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int a = arr[i];
            int b = arr[i+1];

            int dividend = Math.max(a,b);
            int divisor = Math.min(a,b);
            if (divisor == 0)
            {
                arr[i+1] = dividend;
                // you can also take a variable and store fcd in it
            }
            while(dividend%divisor != 0)
            {
                int temp = divisor;
                divisor = dividend%divisor;
                dividend = temp;
            }
            arr[i+1] = divisor;
        }
        if(arr[n-1]==1)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {
        int[] arr = {6,10,15};
        System.out.println(solve(arr));
    }
}
