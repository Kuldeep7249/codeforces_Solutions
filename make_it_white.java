import java.util.*;
public class make_it_white {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int n=r.nextInt();
        for(int j=0;j<n;j++){
            int k=r.nextInt();
            String g=r.next();
            int l=-1;
            int h=-1;
            for(int i=0;i<k;i++){
                if(g.charAt(i)=='B'){
                    l=i;
                    break;
                }
            }
            for(int i=k-1;i>=0;i--){
                if(g.charAt(i)=='B'){
                    h=i;
                    break;
                }
            }
            System.out.println(h-l+1);
        }
    }
}
