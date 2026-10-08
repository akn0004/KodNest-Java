
import java.util.Scanner;

public class Num {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sa = arr[0];
        for (int j = 0; j < n; j++) {
            if (arr[j] > sa) {
                sa = arr[j];
            }
        }
        System.out.println("Largest element is " + sa);
    }
}
