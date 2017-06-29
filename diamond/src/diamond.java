import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = keyboard.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2*i-1) ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = n-i; j > 0 ; j--) {
                System.out.print(" ");
            }
            for (int j = 2*i-1; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}