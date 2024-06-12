import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // n * n 크기의 격자 위에 m개의 동전이 각각 어느 위치에 있는지 주어졌을 때, 
        // 현재 격자의 상태를 출력하는 프로그램을 작성해보세요.
        
        // 입력 형식
        // 첫 번째 줄에 격자의 크기를 나타내는 n과 동전의 개수를 나타내는 m이 
        // 공백을 사이에 두고 주어집니다.
        // 두 번째 줄부터는 m개의 줄에 걸쳐 동전의 위치 (r, c)값이 공백을 사이에 
        // 두고 주어집니다. (r, c)는 해당 점이 r행 c열에 놓여야 함을 의미합니다. 
        // 입력으로 주어지는 모든 동전의 위치는 서로 겹치지 않음을 가정해도 좋습니다. 
        // (1 ≤ r ≤ n, 1 ≤ c ≤ n)

        // 출력 형식
        // n개의 줄에 걸쳐 각 행에 해당하는 n개의 숫자를 공백을 사이에 두고 출력합니다. 
        // 해당 칸에 동전이 놓여져 있는 경우라면 1을 출력하고, 
        // 동전이 놓여져 있지 않다면 0을 출력합니다.
        
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int coin = sc.nextInt();

        int placed[][] = new int[size][size];

        for(int i = 0; i < coin; i++) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            placed[r-1][c-1] = 1;
        }

        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                System.out.print(placed[i][j] + " ");
            }
            System.out.println();
        }

    }
}