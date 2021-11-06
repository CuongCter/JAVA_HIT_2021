package Bai5;

public class RunMain {
    public static boolean isPrime(int n) {
        for(int i=2; i*i<=n; i++){
            if (n % i == 0) {
                return false;
            }
        }
        return n>1;
    }
    public static boolean isPrime(long n) {
        for(int i=2; i*i<=n; i++){
            if (n % i == 0) {
                return false;
            }
        }
        return n>1;
    }

    public static boolean isPrime(float n) {
        return false;
    }
    public static boolean isPrime(double n) {
        return false;

    }
    public static void main(String[] args) {
        // Kieu int
        System.out.println(isPrime(7));
        // Kieu long
        System.out.println(isPrime(29));
        // Kieu float
        System.out.println(isPrime(2.7f));
        // Kieu double
        System.out.println(isPrime(46.365479));
    }
}
