import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        int cnt = 0;

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            if(arr[i] % 2 == 0) {
                cnt++;
            }
            int evenArr[] = new int[cnt];
            for(int j = 0; j < cnt; j++){
                if(arr[i] % 2 == 0) {
                    evenArr[j] = arr[i];
                    System.out.print(evenArr[j] + " ");
                }
                break;
            }
        }
        

        // for(int z = 0; z < cnt; z++){
        //     System.out.print(evenArr[z] + " ");     
        // }

    }
}