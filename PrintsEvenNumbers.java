
public class PrintsEvenNumbers {
    public static void main(String[] args) {
        System.out.println("Here are the even numbers:");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}