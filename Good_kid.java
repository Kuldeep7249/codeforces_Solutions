import java.util.*;
public class Good_kid {
    public static void main(String[] args) {
        Scanner r=new Scanner (System.in);
        int n=r.nextInt();
        for(int i=0;i<n;i++){
            int k=r.nextInt();
            int a[]=new int[k];
            for(int j=0;j<k;j++){
                a[j]=r.nextInt();
            }
            Arrays.sort(a);
            a[0]++;
            int s=1;
            for(int g:a){
                s=s*g;
            }
            System.out.println(s);
        }
    }
}
