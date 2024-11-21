import java.util.*;
public class sol_228A {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        Set<Long>a=new HashSet<>();
        for(int i=0;i<4;i++){
            a.add(r.nextLong());
        }
        System.out.println(4-a.size());
    }
}
