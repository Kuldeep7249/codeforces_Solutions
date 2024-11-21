import java.math.BigInteger;
import java.util.*;

public class odd_divisor {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int n = r.nextInt();
        for (int i = 0; i < n; i++) {
            BigInteger a = r.nextBigInteger();
            int j = 2;
            BigInteger g=ne
            while (j <= a/2) {
                if (a % j == 0 && j % 2 != 0) {
                    System.out.println("YES");
                    break;
                }

                j++;
            }
            if(a%2!=0){
                System.out.println("YES");
            }
            else{
            System.out.println("NO");
            }
        }
        r.close();
    }
}
