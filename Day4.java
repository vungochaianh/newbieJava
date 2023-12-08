import java.util.Scanner;
import java.lang.Math;
public class Day4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a");
        int a = scanner.nextInt();
        System.out.println("Enter b");
        int b = scanner.nextInt();
        System.out.println("Enter c");
        int c = scanner.nextInt();
        if ( a + b > c || a + c > b || b + c > a){
            if (a*a + b*b == c*c || a*a + c*c == b*b || a*a + b*b == c*c){
                System.out.println("Yes");
            }
            else
                System.out.println("No");
        }
        else
            System.out.println("No");
    }
}
