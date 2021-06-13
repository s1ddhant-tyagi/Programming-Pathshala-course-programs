package Recursion;

public class PrintFrom1toN {

//    static void print_fun(int x, int N)
//    {
//        if(x>N) return;
//        System.out.print(x+" ");
//        print_fun(x+1, N);
//    }

    static void print_fun(int N)
    {
        if(N<1) return;
        print_fun(N-1);
        System.out.print(N+" ");
    }


    public static void main(String[] args) {
        print_fun(20);
    }
}
