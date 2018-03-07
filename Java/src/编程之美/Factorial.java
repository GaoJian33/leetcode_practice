package Java.编程之美;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fac(10));
    }

    public static int fac(int N){
        int n = 1;
        for (int i = 1; i <= N; i++) {
            n *= i;
        }
        return n;
    }

}
