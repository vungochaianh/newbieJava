import java.util.Scanner;

public class Day16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text");
        String text = scanner.nextLine();
        System.out.println("Enter value");
        String val = scanner.nextLine();
        System.out.println(text.contains(val));
    }
}
