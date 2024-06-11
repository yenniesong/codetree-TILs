import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[][] = new int[n][n];

        // 첫 번째 행과 첫 번째 열에는 모두 1이 들어갑니다.
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][0] = 1;
                arr[0][j] = 1;
            }
        }

        // 나머지 칸들은 바로 위의 값과 바로 왼쪽 값, 
        // 그리고 왼쪽 위의 값의 합이 되어야 합니다.
        for(int i = 1; i < n; i++) {
            for(int j = 1; j < n; j++) {
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j] + arr[i][j - 1];
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}