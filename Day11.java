import java.util.Scanner;

public class Day11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        int[] array = new int[n];
        double s = 0;
        for(int i = 0; i < n ; i++){
            array[i] = sc.nextInt();
            s += array[i];
        }
        System.out.println(s/n);
    }
}
