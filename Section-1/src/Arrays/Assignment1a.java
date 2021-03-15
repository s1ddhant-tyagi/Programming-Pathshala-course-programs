package Arrays;
import java.util.*;


public class Assignment1a {
    static void solve(long arr[], long p, long q, long r, long[] preSum, long[] sufSum)
    {
        long ans = Long.MIN_VALUE;
        for(long j=0; j<arr.length; j++)
        {
            ans = Math.max(ans, preSum[(int) j]+q*arr[(int) j]+sufSum[(int) j]);
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(), p=sc.nextLong(), q=sc.nextLong(), r=sc.nextLong();
        long arr[] = new long[(int) n];
        for(long i=0; i<n; i++)
            arr[(int) i]=sc.nextLong();

        long[] preSum = new long[arr.length];
        long max = Long.MIN_VALUE;
        for (long i = 0; i < preSum.length; i++) {
            max = Math.max(max, p*arr[(int) i]);
            preSum[(int) i] = max;
        }
        max = Long.MIN_VALUE;
        long[] sufSum = new long[arr.length];
        for (long i = sufSum.length-1; i >= 0; i--) {
            max=Math.max(max, r*arr[(int) i]);
            sufSum[(int) i]=max;
        }

        solve(arr, p, q, r, preSum, sufSum);
    }
}
