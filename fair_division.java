import java.util.*;
public class fair_division {
    public static void main(String[] args) {
        Scanner r=new Scanner (System.in);
        int n=r.nextInt();
        r.nextLine();
        for(int l=0;l<n;l++){
            int k=r.nextInt();
            r.nextLine();
            int a[]=new int[k];
            int c1=0,c2=0;
            for(int j=0;j<k;j++){
                a[j]=r.nextInt();
                if(a[j]==1) c1++;
                else c2++;
            }
            int total=c1+(c2*2);
            if(total%2!=0){
                System.out.println("No");
                continue;
            }
            int t=total/2;
            int max2=Math.min(t/2,c2);
            t-=max2*2;
            if(t<=c1){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
