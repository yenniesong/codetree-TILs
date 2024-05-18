import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int arr[] = new int[100];
        arr[0] = num1;
        arr[1] = num2;

        for(int i = 2; i < 100; i++){
            arr[i] = arr[i - 1] + (2*arr[i - 2]);
        }

        for(int i = 0; i < 10; i++){
            System.out.print(arr[i] + " ");
        }
    }
}