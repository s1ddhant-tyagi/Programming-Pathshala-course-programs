package Arrays;

import java.util.Scanner;

public class Homework1c {
    public static void main(String[] args) {
        int ans=0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m=sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] prefixSum = new int[n];
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            prefixSum[i] = sum;
        }
        for (int i = 0; i < m; i++) {
            int l=sc.nextInt(), r=sc.nextInt();
            if(l==1)
            {
                if(prefixSum[r-1]>0)
                    ans += prefixSum[r-1];
            }
            else if(prefixSum[r-1]-prefixSum[l-2]>0)
                ans += prefixSum[r-1]-prefixSum[l-2];
        }
        System.out.println(ans);
    }
}
