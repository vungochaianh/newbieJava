import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n");
        int n = scanner.nextInt();
        int s = 0;
        for (int i = 0; i < n ; i+=2){
            s += i;
        }
        System.out.println(s);
    }
}
