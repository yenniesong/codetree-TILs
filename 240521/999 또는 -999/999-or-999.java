import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int INT_MIN = Integer.MIN_VALUE;
        final int INT_MAX = Integer.MAX_VALUE;

        int arr[] = new int[100];
        int maxVal = INT_MIN;
        int minVal = INT_MAX;

        for(int i = 0; i < 100; i++) {
            arr[i] = sc.nextInt();

            if(arr[i] == 999 || arr[i] == -999) {
                break;
            }

            if(arr[i] > maxVal) {
                maxVal = arr[i];
            }

            if(minVal > arr[i]) {
                minVal = arr[i];
            }
        }

        System.out.print(maxVal + " " + minVal);
    }
}