package Mathematics;

public class CountingDivisorsFaster {

//    static void solve(int n)
//    {
//        int ans = 1;
//        int num = n;
//        for (int i = 2; i*i <= num; i++) {
//            int count = 0;
//            while(n%i==0)
//            {
//                count++;
//                n=n/i;
//            }
//            if(count>0)
//                ans = ans*(count+1);
//        }
//        System.out.println(ans);
//    }



    static void solve(int num, int n)
    {
        int ans = 1;
        int[] spf = new int[num+1];

        for (int i = 2; i*i <= num; i++) {
            if(spf[i]==0)
            {
                spf[i] = i;
                for (int j = i; i*j <= num; j++) {
                    if(spf[i*j]==0)
                    {
                        spf[i*j] = i;
                    }
                }
            }
        }



        int count = 0;
        int primeFactor = spf[n];
        while(n > 1)
        {

            if(spf[n]==primeFactor)
            {
                count++;
            }
            else
            {
                ans = ans*(count+1);
                count = 1;
            }
            if(spf[n]==0)
                break;
            primeFactor = spf[n];
            n = n/primeFactor;
//            System.out.println(primeFactor+" "+count+" "+n);
        }
        ans = ans*(count+1);
        System.out.println(ans);
    }


    public static void main(String[] args) {
        int num = 6060;
        int n = 101;
        solve(num,n);
    }
}
