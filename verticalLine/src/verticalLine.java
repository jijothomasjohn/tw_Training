import java.util.Scanner;

public class verticalLine {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = keyboard.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }
    }
}
