import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char arr[][] = new char[5][3];

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 3; j++) {
                arr[i][j] = sc.next().charAt(0);
            }
        }

        // 아스키코드
        // 대문자 : 65 ~ 90
        // 소문자 : 97 ~122
        // ① 대문자와 소문자의 아스키코드는 32씩 차이 난다. 
        // ② (대문자 - 65) 혹은 (소문자 - 97)을 통해 인덱스 값을 도출할 수 있다. 
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.printf("%c ", arr[i][j] - 32);
            }
            System.out.println();
        }
    }
}