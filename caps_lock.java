import java.util.*;
public class caps_lock {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        String n=r.next();
        String b="";
        b+=(n.charAt(0)+"").toUpperCase();
        for(int i=1;i<n.length();i++){
            b+=(n.charAt(i)+"").toLowerCase();
        }
        
        System.out.println(b);
    }
}
