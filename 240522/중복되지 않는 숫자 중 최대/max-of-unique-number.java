import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 첫 번째 줄: 원소의 수 N
        int N = sc.nextInt();

        // 두 번째 줄: N개의 숫자
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }

        // 등장 횟수를 저장할 배열 (숫자의 범위는 1~1000)
        int[] count = new int[1001];

        // 각 숫자의 등장 횟수를 계산
        for (int i = 0; i < N; i++) {
            count[numbers[i]]++;
        }

        // 중복하지 않는 숫자 중 최댓값을 찾기
        int maxUnique = -1;
        for (int i = 1; i <= 1000; i++) {
            if (count[i] == 1) {
                if (i > maxUnique) {
                    maxUnique = i;
                }
            }
        }

        // 결과 출력
        System.out.println(maxUnique);
    }
}