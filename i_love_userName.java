import java.util.*;
public class i_love_userName {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int n=r.nextInt();
        int a=r.nextInt();
        int min=a;
        int max=a;
        int c=0;
        for(int i=1;i<n;i++){
            int current=r.nextInt();
            if(current>max){
                c++;
                max=current;
            }
            else if(current<min){
                c++;
                min=current;
            }
        }
        System.out.println(c);
    }
}
