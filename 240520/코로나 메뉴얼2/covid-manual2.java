import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int temp = 0, type = 0;
        char cold;
        int cntArr[] = new int[5];

        for(int i = 0; i < 3; i++){
            cold = sc.next().charAt(0);
            temp = sc.nextInt();

            if(cold == 'Y' && temp >= 37) {
                type = 0;
            } else if(cold == 'N' && temp >= 37){
                type = 2;
            } else if(cold == 'Y') {
                type = 1;
            } else {
                type = 3;
            }
            cntArr[type]++;
        }

        for(int i = 0; i < 4; i++){
            System.out.print(cntArr[i] + " ");
        }
        if(cntArr[0] >= 2) {
            System.out.print("E");
        }



    }
}