import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        int max = Integer.MIN_VALUE;
        int cnt = 0;
        int idx = -1;
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            if(arr[i] > max) {
                // System.out.println("arr[i] > max : " + max);
                max = arr[i];
            } else if(arr[i] == max) {
                cnt++;
                // System.out.println("arr[i] == max : " + max);
                // System.out.println("cnt : " + cnt);
                // idx = -1
            }
            
            

        }
        if(cnt > 0) {
            idx = -1;
            System.out.print(idx);
        } else {
            System.out.print(max);
        }
    }
}