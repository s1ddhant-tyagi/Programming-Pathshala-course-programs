package Arrays;

public class MaximiseTheExpression {

/*
    //Naive Approach
    static void solve(int arr[], int p, int q, int r)
    {
        int max= Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    max=Math.max(max, (arr[i]*p+ arr[j]*q + arr[k]*r));
                }
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int p=1, q=2, r=3;
        solve(arr,p,q,r);
    }

 */

    //Optimised

    static void solve(int[] arr, int p, int q, int r, int[] preSum, int[] sufSum) {
        // TODO Auto-generated method stub
        int ans=Integer.MIN_VALUE;
        for (int j = 1; j < arr.length-1; j++) {
            ans = Math.max(ans,(preSum[j-1]+q*arr[j]+sufSum[j+1]));
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,-5};
        int p=-1, q=2, r=-3;
        int[] preSum = new int[arr.length];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < preSum.length; i++) {
            max = Math.max(max, p*arr[i]);
            preSum[i] = max;
        }
        max = Integer.MIN_VALUE;
        int[] sufSum = new int[arr.length];
        for (int i = sufSum.length-1; i >= 0; i--) {
            max=Math.max(max, r*arr[i]);
            sufSum[i]=max;
        }
        solve(arr, p, q, r, preSum, sufSum);
    }
}
