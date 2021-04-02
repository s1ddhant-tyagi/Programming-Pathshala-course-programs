package Arrays;

public class ArrayRearrangement {
//    static void solve(int[] arr)
//    {
//        int n = arr.length;
//        int[] ans = new int[n];
//        for (int i = 0; i < n; i++) {
//            ans[arr[i]] = i;
//        }
//
//        for (int i = 0; i < n; i++) {
//            System.out.println(ans[i]+" ");
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {1,3,0,2};
//        solve(arr);
//    }


    static void solve(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(arr[i]>=0)
            {
                int index=arr[i], value=i;
                while(index!=i)
                {
                    int temp = arr[index];
                    arr[index] = -(value+1);
                    value = index;
                    index = temp;
                }
                arr[index] = -(value+1);
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i] = (arr[i]*-1)-1;
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
