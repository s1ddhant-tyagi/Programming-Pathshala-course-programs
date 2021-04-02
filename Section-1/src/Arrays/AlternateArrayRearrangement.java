package Arrays;

public class AlternateArrayRearrangement {

//    static void solve(int[] arr)
//    {
//        int n = arr.length;
//        for (int i = 0; i < n; i++) {
//            if(arr[i]<n)
//            {
//                int index=arr[i], value=i;
//                while(index!=i)
//                {
//                    arr[index] += value*n;
//                    value = index;
//                    index = arr[index]%n;
//                }
//                arr[index] += value*n;
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            arr[i] /= n;
//        }
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i]+" ");
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {2,0,1,4,5,3};
//        solve(arr);
//    }

    static void solve(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int oldValue = arr[i]%n;
            arr[oldValue] += n*i;
        }
        for (int i = 0; i < n; i++) {
            arr[i] /= n;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,0,1,4,5,3};
        solve(arr);
    }
}
