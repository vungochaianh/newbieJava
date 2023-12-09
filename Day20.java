import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        if (checkRegex(str) == true){
            System.out.println("Yes");
        }
        else
            System.out.println("No");
    }
    public static boolean checkRegex(String str){
        String regexPattern = "^[A-Z][A-Za-z0-9]{2,18}[0-9]$";
        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
}
