import java.util.*;

public class Chat_room {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder a = new StringBuilder("hello");
        for (char b : s.toCharArray()) {
            if (a.length() == 0) {
                break;
            }
            if (b == a.charAt(0)) {
                a.deleteCharAt(0);
            }
        }
        if(a.length()==0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
