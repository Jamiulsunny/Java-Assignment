
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer number: ");
        int num = input.nextInt();
        int count = 0;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                count++;
                break;
            }
        }

        if (num <= 1) {
            System.out.println("Number is not a prime number.");
        } else if (count == 0) {
            System.out.println("Number is a prime number.");
        } else {
            System.out.println("Number is not a prime number.");
        }
    }
}