package Arrays;

public class RotateTheArray {
    // BRUTE_FORCE
    // Time-complexity O(N2)        Space-complexity O(1)
//    static void solve(int[] arr, int k)
//    {
//        int N = arr.length;
//        for (int i = 0; i < k; i++) {
//            int temp=arr[N-1];
//            for (int j = N-1; j > 0; j--) {
//                arr[j] = arr[j-1];
//            }
//            arr[0]=temp;
//        }
//        for (int i = 0; i < N; i++) {
//            System.out.print(arr[i]+" ");
//        }
//    }




//    O(N)   O(K)



//    static void solve(int[] arr, int k)
//    {
//        int N = arr.length;
//        int[] tempArr = new int[k];
//        int index = arr.length-k;
//        for (int i = 0; i < k; i++) {
//            tempArr[i] = arr[index];
//            index++;
//        }
//        for (int i = N-1; i >=k ; i--) {
//            arr[i] = arr[i-k];
//        }
//        for (int i = 0; i < k; i++) {
//            arr[i] = tempArr[i];
//        }
//        for (int i = 0; i < N; i++) {
//            System.out.print(arr[i]+" ");
//        }
//    }


    static void reverse(int[] arr, int a, int b)
    {
        while(a<b)
        {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b--;
        }
    }

    static  void solve(int[] arr, int k)
    {
        int N = arr.length;
        reverse(arr,0,N-k-1);
        reverse(arr, N-k, N-1);
        reverse(arr, 0,N-1);
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,5,2,4,3};
        int k = 2;
        solve(arr,k);
    }
}
