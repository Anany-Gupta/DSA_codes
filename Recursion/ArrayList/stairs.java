import java.util.*;

public class stairs {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> ans = getStairPaths(n);
        System.out.println(ans);
        sc.close();
    }

    public static ArrayList<String> getStairPaths(int n) {

        if (n == 0) {
            ArrayList<String> blist = new ArrayList<>();
            blist.add("");
            return blist;

        } else if (n < 0) {
            ArrayList<String> blist = new ArrayList<>();
            return blist;

        }
        ArrayList<String> path1 = getStairPaths(n - 1);

        ArrayList<String> path2 = getStairPaths(n - 2);

        ArrayList<String> path3 = getStairPaths(n - 3);

        ArrayList<String> myResult = new ArrayList<>();

        for (String prev : path1) {
            myResult.add(1 + prev);
        }
        for (String prev : path2) {
            myResult.add(2 + prev);
        }
        for (String prev : path3) {
            myResult.add(3 + prev);
        }

        return myResult;
    }
}
