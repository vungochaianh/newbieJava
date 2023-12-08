import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a");
        int a = scanner.nextInt();
        System.out.println("Enter b");
        int b = scanner.nextInt();
        System.out.println("Enter c");
        int c = scanner.nextInt();
        if ( a + b > c || a + c > b || b + c > a){
            System.out.println("Yes");
        }
        else
            System.out.println("No");
    }
}
