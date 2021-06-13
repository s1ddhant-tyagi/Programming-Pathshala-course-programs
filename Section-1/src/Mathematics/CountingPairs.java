package Mathematics;
import java.util.*;

public class CountingPairs {
//    static void solve(int[] arr, int k)
//    {
//        int count=0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j < arr.length; j++) {
//                if((arr[i]+arr[j])%k == 0)
//                    count++;
//            }
//        }
//        System.out.println(count);
//    }

    static void solve(int[] arr, int k)
    {
        int[] countArr = new int[k];
        Arrays.fill(countArr,0);
        for (int i = 0; i < arr.length; i++) {
            countArr[arr[i]%k]++;
        }
        int ans = 0;
        ans += (countArr[0]* (countArr[0]-1) )/2;
        for (int i = 1; i <= k/2; i++) {
            if(i==(k-i))
                ans += (countArr[i]* (countArr[i]-1) )/2;
            else
                ans += countArr[i]*countArr[k-i];
        }
        System.out.println(ans);
    }


    public static void main(String[] args) {
        int[] arr = {2,2,1,7,5,3};
        int k = 4;
        solve(arr, k);
    }
}