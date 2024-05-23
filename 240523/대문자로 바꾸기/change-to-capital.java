import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char arr[][] = new char[5][3];

        // 2D 배열에서 소문자를 대문자로 변환
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.next().charAt(0);
                if (arr[i][j] >= 'a' && arr[i][j] <= 'z') {
                    arr[i][j] += 'A' - 'a'; // 소문자를 대문자로 변환
                }
            }
        }

        // 변환된 배열 출력
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}