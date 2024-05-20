import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int arr[] = new int[a];

        int cnt = 0;
        for(int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();

            if(arr[i] == b) {
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}