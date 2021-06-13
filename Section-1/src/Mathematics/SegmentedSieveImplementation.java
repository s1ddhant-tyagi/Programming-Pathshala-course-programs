package Mathematics;
import java.util.*;
public class SegmentedSieveImplementation {
    public static void main(String[] args) {
        int  L = 900;
        int R = 1000;
        int n = 1000000;
        int[] primes = new int[n+1];
        Arrays.fill(primes, 1);
        primes[0]=0;
        primes[1]=0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 2; i*i <= n; i++) {
            if(primes[i]==1)
            {
                list.add(i);
                for (int j = i; i*j <= n; j++) {
                    primes[i*j]=0;
                }
            }
        }

        int[] ans = new int[R-L+1];

        for (int i = 0; i < list.size(); i++) {
            int prime = list.get(i);
            int multiple = (int)Math.ceil((L*1.0)/prime);
            for (int j = Math.max(2,multiple); j <= (int)Math.floor((R*1.0)/prime) ; j++) {
                ans[(prime*j)-L]=1;
            }
        }


        for (int i = 0; i < ans.length; i++) {
            if(ans[i]==0)
                System.out.println(i+L);
        }
    }
}
