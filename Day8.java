import java.util.Scanner;

public class Day8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n, Warning n <= 1000");
        int n = scanner.nextInt();
        for (int i = 1 ; i <= n ; i++){
            if (checkPrime(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean checkPrime(int n){
        for (int i = 2 ; i <= n/2 ; i+=3) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
