
import java.util.Scanner;

public class again25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();

        if (n >= 2) {
            System.out.println(25);
        } else {
            System.out.println((long)Math.pow(5, n) % 100);
        }

        scanner.close();
    }
}
