import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ID");
        String ID = scanner.nextLine();
        if (checkRegex(ID) == true){
            System.out.println("Yes");
        }
        else
            System.out.println("No");
    }
    public static boolean checkRegex(String ID){
        String regexPattern = "^B[1-9]\\d{6}$";
        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(ID);
        return matcher.matches();
    }
}