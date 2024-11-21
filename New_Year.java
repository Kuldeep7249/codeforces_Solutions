import java.util.*;
public class New_Year {
    public static void main(String[] args) {
        Scanner r=new Scanner (System.in);
        int a[]=new int[3];
        for(int i=0;i<3;i++){
            a[i]=r.nextInt();
        }
        Arrays.sort(a);
        System.out.println((a[2]-a[1])+(a[1]-a[0]));
    }
}
