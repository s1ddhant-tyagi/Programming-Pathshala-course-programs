package Arrays;

public class MaxGapProblemBucketing {
    public static void main(String[] args) {
        int[] arr = {65,25,70,20,27,33};
        int n = arr.length;
        if(n<2) System.out.println(0);;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }
        if(min == max) System.out.println(0);

        int gap = (int) Math.ceil((max-min)/(n-1));

        int[] minArr = new int[n];
        int[] maxArr = new int[n];
        for (int i = 0; i < n; i++) {
            minArr[i] = Integer.MAX_VALUE;
            maxArr[i] = Integer.MIN_VALUE;
        }

        for (int i = 0; i < n; i++) {
            int bkt = (arr[i]-min)/gap;
            minArr[bkt] = Math.min(minArr[bkt], arr[i]);
            maxArr[bkt] = Math.max(maxArr[bkt], arr[i]);
        }

        int ans = Integer.MIN_VALUE;
        int prev = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(minArr[i] == Integer.MAX_VALUE) continue;

            if(prev == Integer.MIN_VALUE) prev = maxArr[i];
            else
            {
                ans = Math.max(ans, minArr[i]-prev);
                prev = maxArr[i];
            }
        }
        System.out.println(ans);
    }



}
