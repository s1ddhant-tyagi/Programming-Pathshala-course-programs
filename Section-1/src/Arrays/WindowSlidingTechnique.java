package Arrays;

public class WindowSlidingTechnique {
    static void solve(int[] arr, int k)
    {
        int n = arr.length;
        int count = 0;
        for (int i : arr) {
            if (i <= k)
                count++;
        }
        int legalElements = 0;
        int maxLegalElements = 0;
        for (int i = 0; i < count; i++) {
            if(arr[i]<=k)
                legalElements++;
        }
        maxLegalElements = Math.max(maxLegalElements, legalElements);
        for (int i = count; i < n; i++) {
            if(arr[i-count]<=k)
                legalElements--;
            if(arr[i]<=k)
                legalElements++;
            maxLegalElements = Math.max(maxLegalElements, legalElements);
        }
        System.out.println(count-maxLegalElements);
    }

    public static void main(String[] args) {
        int[] arr = {2,8,6,5,7,9,8,7,4};
        int k = 5;
        solve(arr,k);
    }
}
