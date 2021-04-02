package Arrays;

public class ProcessingQueriesEfficiently {
//    static void solve(int[][] arr, int i1, int j1, int i2, int j2)
//    {
//        int sum = 0;
//        for (int i = i1; i <= i2; i++) {
//            for (int j = j1; j <= j2; j++) {
//                sum += arr[i][j];
//            }
//        }
//        System.out.println(sum);
//    }
//
//    public static void main(String[] args) {
//        int[][] arr = new int[3][];
//        arr[0] = new int[]{1,2,3};
//        arr[1] = new int[]{4,5,6};
//        arr[2] = new int[]{7,8,9};
//        int n = arr.length;
//        int m = arr[0].length;
//
//        solve(arr,0,1,2,2);
//    }








//    static void solve(int[][] arr, int i1, int j1, int i2, int j2, int[][]prefixSum)
//    {
//        int sum = 0;
//        for (int i = i1; i <= i2; i++) {
//            if(j1==0)
//                sum += prefixSum[i][j2];
//            else
//                sum += prefixSum[i][j2]-prefixSum[i][j1-1];
//        }
//        System.out.println(sum);
//    }

//    public static void main(String[] args) {
//        int[][] arr = new int[3][];
//        arr[0] = new int[]{1,2,3};
//        arr[1] = new int[]{4,5,6};
//        arr[2] = new int[]{7,8,9};
//        int n = arr.length;
//        int m = arr[0].length;
//
//        int prefixSum[][] = new int[3][3];
//
//        for (int i = 0; i < n; i++) {
//            int sum=0;
//            for (int j = 0; j < m; j++) {
//                sum += arr[i][j];
//                prefixSum[i][j] = sum;
//            }
//        }
//
//        solve(arr,0,0,1,2, prefixSum);
//    }


    static void solve(int i1, int j1, int i2, int j2, int[][]derArr)
    {
        int ans;
        if(i1==0 && j1==0)
            ans = derArr[i2][j2];
        else if(i1==0)
            ans = derArr[i2][j2]-derArr[i2][j1-1];
        else if(j1==0)
            ans = derArr[i2][j2]-derArr[i1-1][j2];
        else
            ans = derArr[i2][j2]-derArr[i1-1][j2]-derArr[i2][j1-1]+derArr[i1-1][j1-1];
        System.out.println(ans);
    }


    public static void main(String[] args) {
        int[][] arr = new int[3][];
        arr[0] = new int[]{1,2,3};
        arr[1] = new int[]{4,5,6};
        arr[2] = new int[]{7,8,9};
        int n = arr.length;
        int m = arr[0].length;

        int[][] derArr = new int[n][m];
        // ADDING ROWS
        for (int i = 0; i < n; i++) {
            int sum=0;
            for (int j = 0; j < m; j++) {
                sum += arr[i][j];
                derArr[i][j] = sum;
            }
        }

        //ADDING COLUMNS OF DERARR ARRAY
        for (int j = 0; j < m; j++) {
            int sum=0;
            for (int i = 0; i < n; i++) {
                sum += derArr[i][j];
                derArr[i][j] = sum;
            }
        }

        solve(0,0,1,2, derArr);
    }
}
