import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int arr[] = new int[input];

        int maxVal1 = 0;
        int maxVal2 = 0;
        for(int i = 0; i < input; i++) {
            arr[i] = sc.nextInt();

            if(arr[0] > arr[1]) {
                maxVal1 = arr[0];
                maxVal2 = arr[1];
            } else {
                maxVal1 = arr[1];
                maxVal2 = arr[0];
            }
        }

        // Step 2: 3번째 원소부터 보면서 max1과 max2를 갱신합니다.
        for (int i = 2; i < input; i++) {
            if (arr[i] >= maxVal1) {
                // Case 1: 지금까지 본 숫자들보다 좋다면
                //         max2, max1 모두 갱신해줍니다.
                maxVal2 = maxVal1;
                maxVal1 = arr[i];
            } 
            else if (arr[i] > maxVal2){
                // Case 2: max2보다만 좋다면 max2를 갱신합니다.
                maxVal2 = arr[i];
            }
        }



        System.out.print(maxVal1 + " " + maxVal2);
    }
}