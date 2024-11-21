import java.util.*;
public class twins {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int n=r.nextInt();
        int a[]=new int[n];
        int t=0;
        for(int i=0;i<n;i++){
            a[i]=r.nextInt();
            t+=a[i];
        }
        int s=0;
        int c=0;
        Arrays.sort(a);;
        for(int i=n-1;i>=0;i--){
            s+=a[i];
            t-=a[i];
            c++;
            if(s>t){
                System.out.println(c);
                break;
            }
        }
        

    }
}
