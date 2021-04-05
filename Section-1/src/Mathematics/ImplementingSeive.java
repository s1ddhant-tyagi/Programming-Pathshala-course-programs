package Mathematics;

public class ImplementingSeive {

    static void solve(int n)
    {
        boolean[] arr = new boolean[n+1];

        for (int i = 2; i*i <=n; i++) {
            for (int j = i; j*i <= n; j++) {
                arr[i*j] = true;
            }
        }
        for (int i = 2; i <=n; i++) {
            if(!arr[i])
                System.out.println(i);

        }
    }

    public static void main(String[] args) {
        int n = 20;
        solve(n);
    }

}
