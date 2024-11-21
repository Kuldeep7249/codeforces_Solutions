import java.util.*;
public class Sereja_and_dima {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int n=r.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=r.nextInt();
        }
        int s=0;
        int d=0;
        int c=1;
        int l=0;
        int h=n-1;
        int max=0;
        while(l<=h){
            if(a[l]<=a[h]){
                max=a[h];
                h--;
            }
            else if(a[l]>=a[h]){
                max=a[l];
                l++;
            }
            if(c%2!=0){
                s+=max;
            }
            else{
                d+=max;
            }
            c++;
        }
        System.out.println(s+" "+d);
        r.close();
    }
}
