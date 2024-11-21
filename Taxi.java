import java.util.*;
public class Taxi {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int n=r.nextInt();
        int a[]=new int[5];
        for(int i=0;i<n;i++){
            int t=r.nextInt();
            a[t]++;
        }
        int c=a[4];
        int m=Math.min(a[3],a[1]);
        c+=m;
        a[3]-=m;
        a[1]-=m;
        c+=a[3];
        c+=a[2]/2;
        if(a[2]%2!=0){
            c+=1;
            a[1]=Math.max(0,a[1]-2);
        }
        c+=(a[1]+3)/4;
        System.out.println(c);
        r.close();
    }
}
