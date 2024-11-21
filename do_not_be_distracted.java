import java.util.*;

public class do_not_be_distracted {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int n = r.nextInt();
        r.nextLine();
        for (int i = 0; i < n; i++) {
            int k = r.nextInt();
            r.nextLine();
            String s = r.nextLine();
            Set<Character> a = new HashSet<>();
            boolean d=false;
            a.add(s.charAt(0));
            for (int j = 1; j < k; j++) {
                if (s.charAt(j) == s.charAt(j - 1)) {
                    continue;
                } else if (a.contains(s.charAt(j))) {
                    System.out.println("NO");
                    d=!d;
                    break;
                }
                else{
                    a.add(s.charAt(j));
                } 
            }
            if(!d){
                System.out.println("YES");
            }
        }
    }
}
