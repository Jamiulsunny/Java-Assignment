
public class SumAllRealNumbers {
    public static void main(String[] args) {
        System.out.println("Here are the real numbers:");
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
            sum = sum + i;
        }
        System.out.println("SUM OF ALL NUMBERS: " + sum);
    }
}
