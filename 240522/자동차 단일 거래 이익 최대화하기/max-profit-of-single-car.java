import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }

            if(min < arr[i]) {
                max = arr[i];
            }
        }

        int total = 0;
        if(max > min) {
            total = (max - min);
        } else {
            total = 0;
        }
        System.out.print(total);
    }
}