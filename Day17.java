import java.util.Scanner;

public class Day17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String val = scanner.nextLine();
        if(str.indexOf(val) >= 0){
            System.out.println(str.indexOf(val));
        }
        else
            System.out.println("no");
    }
}
