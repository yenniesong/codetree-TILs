import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // final int INT_MIN = Integer.MIN_VALUE;

        int arr[] = new int[10];

        int maxVal = 0;
        for(int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();

            if(arr[i] > maxVal) {
                maxVal = arr[i];   
            }
        }

        System.out.print(maxVal);
    }
}