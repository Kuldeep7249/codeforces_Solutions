import java.util.*;
public class easy_problem {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int n=r.nextInt();
        int c=0;
        for(int i=0;i<n;i++){
            int a=r.nextInt();
            if(a==1){
               c++;
               break;
            }
        }
        if(c>=1){
            System.out.println("HARD");
        }
        else{
            System.out.println("EASY");
        }
    }
}
