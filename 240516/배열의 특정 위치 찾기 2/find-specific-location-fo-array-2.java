import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int oddTotal = 0;
        int evenTotal = 0;

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        
        for(int i = 0; i < arr.length; i+=2){
            oddTotal += arr[i];
        }
        for(int i = 1; i < arr.length; i+=2){
            evenTotal += arr[i];
        }
        if(evenTotal > oddTotal) {
            System.out.print(evenTotal - oddTotal);
        }

        
        if(oddTotal > evenTotal) {
            System.out.print(oddTotal - evenTotal);
        }
    }
}