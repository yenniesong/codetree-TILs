import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        arr[0] = num1; arr[1] = num2;

        for(int i = 2; i < arr.length; i++) {
            arr[i] = (arr[i - 1] + arr[i - 2])%10;
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }



    }
}