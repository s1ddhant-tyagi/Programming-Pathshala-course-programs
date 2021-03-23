package Arrays;

public class ReverseLookupIn1Dimension {
    // O(n2)   O(1)
//    static void solve(int[] arr)
//    {
//        int n = arr.length;
//        int ans=0;
//        for (int i = 0; i < n; i++) {
//            int currentSum = 0;
//            for (int j = i; j < n; j++) {
//                currentSum += arr[j];
//                ans += currentSum;
//            }
//        }
//        System.out.println(ans);
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {1,2,3};
//        solve(arr);
//    }



    static void solve(int[] arr)
    {
        int n=arr.length;
        int ans=0;
        for (int i = 0; i < n; i++) {
            ans += (i+1)*(n-i)*arr[i];
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        solve(arr);
    }
}
