import java.util.Scanner;

public class Day12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        int max = 0;
        int[] array = new int[n];
        for(int i = 0; i < n ; i++){
            array[i] = sc.nextInt();
            if (max < array[i]){
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
