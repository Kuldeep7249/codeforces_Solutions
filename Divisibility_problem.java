import java.util.Scanner;

public class Divisibility_problem {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int n=r.nextInt();
        for(int i=0;i<n;i++){
            int a=r.nextInt();
            int b=r.nextInt();
            if(a%b==0){
                System.out.println(0);
            }
            else{
                if(a<b){
                    System.out.println(b-a);
                }
                else{
                    int d=a%b;
                    System.out.println(b-d);
                }
            }
        }
    }
}
