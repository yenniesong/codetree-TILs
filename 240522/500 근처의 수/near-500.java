import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for(int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < 10; i++) {
            if(arr[i] > max && arr[i] < 500) {
                // if(arr[i] )
                max = arr[i];
            }

            if(min > arr[i] && arr[i] > 500) {
                min = arr[i];
            }
        }
        System.out.print(max + " " + min);
    }
}