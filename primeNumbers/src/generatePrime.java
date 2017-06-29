import java.util.ArrayList;
import java.util.Scanner;

public class generatePrime {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr = generate(30);
        arr.forEach((a)->System.out.println(a));

    }
    public static ArrayList<Integer> generate(int n){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        boolean prime=false;
        for (int i = n/2; i > 1 ; i--) {
            if (n % i == 0) {
                prime = checkPrime(i);
            }
            if(prime == true)
                arr.add(i);
            prime = false;
        }
        return arr;
    }
    public static boolean checkPrime(int n){
        for (int i = n/2; i > 1 ; i--) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}