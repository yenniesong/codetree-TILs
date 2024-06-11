import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[5][5];

        // 첫 번째 행과 첫 번째 열은 모두 1로 초기화 합니다.
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                arr[i][0] = 1;
                arr[0][j] = 1;
            }
        }

        // 나머지 칸들은 바로 위의 값과 바로 왼쪽의 값을 더합니다.
        for(int i = 1; i < 5; i++) {
            for(int j = 1; j < 5; j++) {
                arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
            }
        }
        
        // 출력
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}