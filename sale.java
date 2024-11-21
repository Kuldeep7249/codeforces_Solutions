import java.util.*;
public class sale {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int n=r.nextInt();
        int m=r.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=r.nextInt();
        }
        Arrays.sort(a);
        int c=0;
        for(int i=0;i<m;i++){
            if(a[i]<=0){
                c+=Math.abs(a[i]);
            }
        }
        System.out.println(c);
    }
}
