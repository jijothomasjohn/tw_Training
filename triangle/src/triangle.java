import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = keyboard.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j > 0 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}