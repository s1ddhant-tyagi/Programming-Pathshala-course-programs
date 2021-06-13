package Recursion;

public class DistinctPaths1 {

    static int count_paths(int i, int j, int m, int n)
    {
        if(i==m-1) return 1;
        if(j==n-1) return 1;
        return count_paths(i+1, j, m, n) + count_paths(i, j+1, m, n);
    }

    public static void main(String[] args) {
        System.out.println(count_paths(0, 0, 3,3));
    }
}
