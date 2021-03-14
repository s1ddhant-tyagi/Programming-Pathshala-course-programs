package Arrays;

public class HistogramProblem {
    static void solve(int[] arr)
    {
        int[] prefixMax = new int[arr.length];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            prefixMax[i] = max;
        }
        int[] suffixMax = new int[arr.length];
        max = Integer.MIN_VALUE;
        for (int i = arr.length-1; i >= 0 ; i--) {
            max = Math.max(max, arr[i]);
            suffixMax[i] = max;
        }
        int ans=0;
        for (int i = 1; i < arr.length-1; i++) {
            int minPillar = Math.min(prefixMax[i-1], suffixMax[i+1]);
            if(arr[i]<minPillar)
            {
                ans += minPillar-arr[i];
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,3,0,2};
        solve(arr);
    }
}
