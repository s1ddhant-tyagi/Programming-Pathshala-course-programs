package Arrays;

public class SpecialSearchingProblem {
    static void solve(int[][] arr, int key)
    {
        boolean flag = false;
        int n = arr.length;
        int i=0, j=n-1;
        while(i<=n-1 && j>=0)
        {
            if(arr[i][j]==key)
            {
                System.out.println(i+" "+j);
                flag = true;
                break;
            }
            else if(arr[i][j]<key)
            {
                i++;
            }
            else if(arr[i][j]>key)
            {
                j--;
            }

        }
        if(!flag)
            System.out.println(-1+" "+-1);
    }

    public static void main(String[] args) {
        int[][] arr = new int[4][];
        arr[0] = new int[]{10,20,30,40};
        arr[1] = new int[]{15,25,35,45};
        arr[2] = new int[]{27,29,37,48};
        arr[3] = new int[]{32,33,39,50};
        solve(arr,50);
    }
}
