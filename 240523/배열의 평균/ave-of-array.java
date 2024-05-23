import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[2][4];
        double rowAvg = 0, colAvg = 0, ttAvg = 0;

        for(int i = 0; i < 2; i++) {
            int sum = 0;
            for(int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];
            }
            rowAvg = sum / 4;
            System.out.print(rowAvg + " ");
        }
        System.out.println();

        for(int j = 0; j < 4; j++) {
            int sum = 0;
            for(int i = 0; i < 2; i++) {
                sum += arr[i][j];
            }
            colAvg = sum / 2;
            System.out.print(colAvg + " ");
        }
        System.out.println();

        int idx = 0;
        int ttSum = 0;
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 4; j++) {
                ttSum += arr[i][j];
                idx++;
            }
            ttAvg = ttSum / idx;
        }
        System.out.print(ttAvg + " ");

    }
}