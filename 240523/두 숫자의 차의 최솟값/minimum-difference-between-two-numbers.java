import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int minDiffer = Integer.MAX_VALUE;
        for(int i = 0; i < n-1; i++) {    // 마지막 요소는 다음 요소가 없으므로 N-1까지
            int difference = arr[i + 1] - arr[i];

            if(difference < minDiffer) {
                minDiffer = difference;
            }
        }

        System.out.print(minDiffer);
    }
}