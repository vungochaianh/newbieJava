import java.util.Scanner;

public class Day7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n");
        int n = scanner.nextInt();
        for (int i = 1 ; i < 21; i++){
            int s = n*i;
            System.out.println(s);
        }
    }
}
