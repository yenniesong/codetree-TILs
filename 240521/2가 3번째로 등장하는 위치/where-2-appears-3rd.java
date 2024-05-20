import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int num = 0;
        int arr[] = new int[a];

        int cnt = 0;
        for(int i = 0; i < a; i++){
            arr[i] = sc.nextInt();

            if(arr[i] == 2) {
                cnt++;
            }
            if(cnt == 3) {
                num = i;
                break;
            }

        }


        System.out.print(num + 1);
    }
}