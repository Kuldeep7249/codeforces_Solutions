import java.util.*;
public class vanya_and_fence {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int n=r.nextInt();
        int h=r.nextInt();
        int c=0;
        for(int i=0;i<n;i++){
            int a=r.nextInt();
            c+=(a<=h)?1:2;
        }
        System.out.println(c);
    }
}
