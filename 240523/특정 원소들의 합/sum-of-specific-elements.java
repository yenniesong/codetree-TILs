import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[4][4];

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();
                // System.out.println(arr[i][j] + " ");
            }
        }

        int sum = 0;
        for(int i = 1; i <= 4; i++) {
            for(int j = 0; j < i; j++) {
                sum += arr[i-1][j];
            }
        }
        System.out.println(sum);
    }
}