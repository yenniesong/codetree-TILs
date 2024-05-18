import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[11];

        for(int i = 0; i < 11; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] % 2 == 0){
                arr[i] = arr[i] / 2;
            } else {
                arr[i] = arr[i] + 3;
            }

            if(arr[i] == 0) {
                break;
            }
            
            System.out.print(arr[i] + " ");
        }
    }
}