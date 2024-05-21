import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // final int INT_MIN = Integer.MIN_VALUE;
        final int INT_MAX = Integer.MAX_VALUE;

        int input = sc.nextInt();
        int arr[] = new int[input];

        int minVal = INT_MAX;
        int cnt = 0;
        for(int i = 0; i < input; i++){
            arr[i] = sc.nextInt();

            if(minVal > arr[i]) {
                minVal = arr[i];
                cnt++;
            }
        }
        System.out.print(minVal + " " + cnt);

    }
}