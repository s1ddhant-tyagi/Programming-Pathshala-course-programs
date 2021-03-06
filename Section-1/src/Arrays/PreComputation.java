package Arrays;

public class PreComputation {
    //Sum of elements from index l to r

/*
    static void solve(int arr[], int l, int r)
    {
        if(l>0)
            System.out.println(arr[r]-arr[l-1]);
        else if(l==0)
            System.out.println(arr[r]);
    }

    public static void main(String[] args) {

        int arr[]= {1,2,3,4,5,6};
        int n = arr.length;
        int prefixSumArr[] = new int[n];
        int sum=0;
        for(int i=0; i<n; i++)
        {
            sum += arr[i];
            prefixSumArr[i]=sum;
        }
        solve(prefixSumArr,3,5);
    }
*/

    //return maximum element until index i


    static void solve(int arr[], int ind)
    {
        System.out.println(arr[ind]);
    }

    public static void main(String[] args) {

        int arr[]= {1,2,3,4,5,6};
        int n = arr.length;
        int prefixMaxArr[] = new int[n];
        int suffixMaxArr[] = new int[n];
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++)
        {
            max = Math.max(max, arr[i]);
            prefixMaxArr[i]=max;
        }
        max = Integer.MIN_VALUE;
        for(int i=n-1; i>=0; i--)
        {
            max = Math.max(max, arr[i]);
            suffixMaxArr[i] = max;
        }
        solve(prefixMaxArr,3);
    }
}
