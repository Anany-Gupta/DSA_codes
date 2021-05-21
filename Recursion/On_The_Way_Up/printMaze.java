
import java.util.*;

public class printMaze {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        getMazePaths(1, 1, n, m, "");

        sc.close();
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void getMazePaths(int sr, int sc, int dr, int dc, String ans) {
        if (sr == dr && sc == dc) {
            System.out.println(ans);
            return;
        }
        if (sc + 1 <= dc) {
            getMazePaths(sr, sc+1, dr, dc , ans + "h");// 2

        }
       
        if (dr >= sr + 1) {

            getMazePaths(sr+1, sc, dr , dc, ans + "v");// 3

        }

    }

}