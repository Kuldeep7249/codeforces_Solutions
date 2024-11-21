import java.util.*;

public class team_olympiad {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int n = r.nextInt();
        int a[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = r.nextInt();
        }
        if (a.length <= 3) {
            System.out.println(0);
        } else {
            ArrayList<Integer> one = new ArrayList<>();
            ArrayList<Integer> two = new ArrayList<>();
            ArrayList<Integer> three = new ArrayList<>();

            for (int i = 1; i <= n; i++) {
                if (a[i] == 1) {
                    one.add(i);
                } else if (a[i] == 2) {
                    two.add(i);
                } else if (a[i] == 3) {
                    three.add(i);
                }
            }
            int min = Math.min(one.size(), two.size());
            min = Math.min(min, three.size());
            if (min == 0) {
                System.out.println(0);
            } else {
                System.out.println(min);
            }
            for(int i=0;i<min;i++){
                System.out.println(one.get(i)+" "+two.get(i)+" "+three.get(i));
            }
        }
        r.close();
    }
}
