import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {
        System.out.println("Enter Number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num > 0){
            System.out.println("Bigger than 0");
        }
        else System.out.println("Lower than 0");
    }
}
