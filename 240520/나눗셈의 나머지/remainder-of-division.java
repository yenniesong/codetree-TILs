import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        a = sc.nextInt();
        b = sc.nextInt();

        int cntArr[] = new int[b];
    
        for(int i = 0; i < 100; i++) {
            int temp = a / b;
            cntArr[a % b]++;
            if(temp <= 1) {
                break;
            }
            a = temp;
        }

        int total = 0;
        for(int i = 0; i < b; i++) {
            total += cntArr[i] * cntArr[i];
        }
        System.out.print(total);

    }
}