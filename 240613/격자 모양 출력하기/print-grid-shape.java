import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // n x n 크기의 격자의 칸 위에 m 개의 점이 놓여져 있습니다.
        // 각 점의 크기는 해당 칸의 행 번호와 열 번호의 곱이 됩니다.
        // 각 점의 위치에 해당하는 정보가 주어질 때, 격자의 모양을 출력하는 프로그램을 작성해보세요.
        // 단, 행과 열의 번호는 1부터 시작됩니다.

        // 입력 형식
        // 첫 번째 줄에 격자의 크기 n과 점의 개수 m이 공백을 두고 주어집니다.
        // 두 번째 줄부터 m개의 줄에 걸쳐 각 점의 행 번호와 열 번호가 공백을 사이에 두고 주어집니다.
        // 주어진 m개의 점의 위치는 모두 다름을 가정해도 좋습니다.

        // 출력 형식
        // 첫 번째 줄부터 n개의 줄에 걸쳐, 각 행에 해당하는 n개의 값을 공백을 사이에 두고 출력합니다.
        // 점이 있는 칸은 점의 크기를, 나머지 칸은 0을 출력합합니다.
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int placed[][] = new int[n][n];

        for(int i = 0; i < m; i++) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            placed[r-1][c-1] = r * c; 
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(placed[i][j] + " ");
            }
            System.out.println();
        }
    }
}