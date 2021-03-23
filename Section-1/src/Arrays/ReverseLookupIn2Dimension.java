package Arrays;

public class ReverseLookupIn2Dimension {
    static void solve(int[][] arr)
    {
        int n = arr.length;
        int m = arr[0].length;
        int ans=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int sum = ((i+1)*(j+1)*(n-i)*(n-j))*arr[i][j];
                ans += sum;
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        int[][] arr = new int[2][];
        arr[0] = new int[]{1,1};
        arr[1] = new int[]{1,1};
        solve(arr);
    }
}
