import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int arr[][] = new int[100][100];

        int num = 0;
        //[2] 처리
        for(int SPIN = 0; SPIN < n*m; SPIN++ ){  //0~8 : 9회전 : 대각선
            for(int i = 0; i < n; i++){ //0~4 : 5회전 : 행
               
                int j = SPIN - i; //열                
                if(j >= 0 && j < m){ //0보다 크거나 같고 5보다 작은 경우에
                    num = num + 1;
                    arr[i][j] = num;
                }
            }          
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}