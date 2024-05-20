import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char arr[] = new char[]{ 'L', 'E', 'B', 'R', 'O', 'S' };

        char input = sc.next().charAt(0);

        int index = -1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == input) {
                index = i;
            }
        }

        if(index == -1) {
            System.out.print("None");
        } else {
            System.out.print(index);
        }
    }
}