import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[2][4];

        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // 가로 평균
        for(int i = 0; i < 2; i++) {
            float rSum = 0;
            for(int j = 0; j < 4; j++) {
                rSum += arr[i][j];
            }
            System.out.printf("%.1f ", rSum / 4);
        }
        System.out.println();

        // 세로 평균
        for(int i = 0; i < 4; i++) {
            float cSum = 0;
            for(int j = 0; j < 2; j++) {
                cSum += arr[j][i];
            }
            System.out.printf("%.1f ", cSum / 2);
        }
        System.out.println();

        // 전체 평균
        float tSum = 0;
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 4; j++) {
                tSum += arr[i][j];
            }
        }
        System.out.printf("%.1f ", tSum / 8);

    }
}