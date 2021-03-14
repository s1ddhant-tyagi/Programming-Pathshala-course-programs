package Arrays;

public class MaximumChunks {

//    static boolean canBeChunked(int[] arr, int i, int j)
//    {
//        int count=0;
//        for (int k = i; k <= j; k++) {
//            if(arr[k]>=i && arr[k]<=j)
//                count++;
//        }
//        if(count==(j-i)+1)
//            return true;
//        else
//            return false;
//    }
//    static void solve(int[] arr)
//    {
//        int i=0;
//        int ans=0;
//        while(i< arr.length)
//        {
//            for (int j = i; j < arr.length; j++) {
//                if(canBeChunked(arr,i,j))
//                {
//                    ans++;
//                    i=j+1;
//                    break;
//                }
//            }
//        }
//        System.out.println(ans);
//    }

    static void solve(int[] arr)
    {
        int ans=0;

        int[] prefixMax = new int[arr.length];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            prefixMax[i] = max;
        }

        for (int i = 0; i < arr.length; i++) {
            if(prefixMax[i]==i)
                ans++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,1,2,0,4,3};
        solve(arr);
    }
}
