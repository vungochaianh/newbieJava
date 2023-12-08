import java.util.Scanner;

public class Day13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        int[] array = new int[n];
        array[0] = sc.nextInt();
        int min = array[0];
        for(int i = 1; i < n ; i++){
            array[i] = sc.nextInt();
            if (min > array[i]){
                min = array[i];
            }
        }
        System.out.println(min);
    }
}
