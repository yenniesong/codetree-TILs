import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] =  new int[100];
        int cntArr[] = new int[10];

        // arr[i]를 입력받은 후 카운팅 배열을 통해 십의 자리수 각각의 빈도 저장, 0이 나오면 for문에서 빠져나오기
        for(int i = 0; i < 99; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] == 0)
                break;
            if(arr[i] < 10)
                continue;
            cntArr[arr[i] / 10]++;
        }

        // 결과 출력
        for (int i = 1; i < 10; i++) {
            System.out.println(i + " - " + cntArr[i]);
        }
    }
}