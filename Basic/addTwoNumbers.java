package Basic;

import java.util.Scanner;

public class addTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a");
        int a = scanner.nextInt();
        System.out.println("Enter b");
        int b = scanner.nextInt();
        int sum = a + b;
        System.out.println(sum);

    }
}
