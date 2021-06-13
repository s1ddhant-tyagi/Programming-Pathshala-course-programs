package Mathematics;
import  java.util.*;

public class CountingTriplets {

    static void solve(int[] arr, int m)
    {
        int[] countArr = new int[m];
        Arrays.fill(countArr, 0);
        for (int i = 0; i < arr.length; i++) {
            countArr[arr[i]%m]++;
        }

        int ans = 0;
        ans += (countArr[0]*(countArr[0]-1)*(countArr[0]-2))/6;

        for (int i = 1; i < countArr.length; i++) {
            for (int j = i; j < countArr.length; j++) {
                int k;
                if((i+j)%m==0)
                    k=0;
                else
                    k=m-((i+j)%m);
                if(k<j) continue;

                if(i==j && j==k)
                    ans += (countArr[i]*(countArr[i]-1)*(countArr[i]-2))/6;
                else if(i==j)
                    ans += (countArr[i]*(countArr[i]-1))/2 * countArr[k];
                else if(i==k)
                    ans += (countArr[i]*(countArr[i]-1))/2 * countArr[j];
                else if(j==k)
                    ans += (countArr[j]*(countArr[j]-1))/2 * countArr[i];
                else
                    ans += countArr[i]*countArr[j]*countArr[k];
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        int[] arr = {};
        solve(arr, 4);
    }
}
