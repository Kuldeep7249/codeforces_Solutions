import java.util.*;
public class short_substrings {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int n=r.nextInt();
        r.nextLine();
        for(int i=0;i<n;i++){
            String a=r.nextLine();
            String d="";
            for(int j=0;j<a.length()-1;j+=2){
                d+=a.charAt(j);
            }
           
            d+=a.charAt(a.length()-1);
            System.out.println(d);
        }
    }
}
