import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[4][4];
        int val;

        for(int i = 0; i < 4; i++) {
            int sum = 0;
            for(int j = 0; j < 4; j++) {
                val = sc.nextInt();
                sum += val;
            }
            System.out.println(sum);
        }
    }
}