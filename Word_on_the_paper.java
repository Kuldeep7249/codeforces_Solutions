import java.util.*;
public class Word_on_the_paper {
    public static void main(String[] args) {
        Scanner r=new Scanner (System.in);
        int n=r.nextInt();
        String a[]=new String[n];
        for(int i=0;i<n;i++){
            a[i]=r.nextLine();
        }
        
        for(String c:a){
            c.strip();
            System.out.println(c);
        }
    }
}
