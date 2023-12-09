import java.util.Scanner;

public class Day19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] ch = str.toCharArray();
        int asw = 0;
        for (int i = 0; i < str.length()- 1 ; i++){
            if (ch[i] == 'a'){
                ++asw;
            }
        }
        System.out.println(asw);
    }
}
