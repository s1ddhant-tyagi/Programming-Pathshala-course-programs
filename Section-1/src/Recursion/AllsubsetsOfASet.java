package Recursion;

public class AllsubsetsOfASet {

    static void subsets(int[] arr, String current, int index)
    {
        if(index==arr.length)
        {
            System.out.println(current);
            return;
        }



        subsets(arr, current,index+1);
        subsets(arr, current+arr[index], index+1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2};
        subsets(arr, "", 0);
    }
}
