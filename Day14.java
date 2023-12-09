import java.util.Scanner;

public class Day14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        int[] array = new int[n];
        int i,j,tmp;
        for (i = 0; i < n ; i++){
            array[i] = scanner.nextInt();
        }
        for (i = 0; i < n; i++){
            for (j = i ; j < n;j++){
                if (array[j] < array[i]){
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        for (i = 0 ; i < n ; i++){
            System.out.println(array[i]);
        }
    }
}
