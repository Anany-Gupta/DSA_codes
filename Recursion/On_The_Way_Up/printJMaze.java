import java.util.*;

public class printJMaze {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        getMazePaths(1, 1, n, m, "");

        sc.close();
    }

    public static void getMazePaths(int sr, int sc, int dr, int dc, String ans) {
        if (sr == dr && sc == dc) {
            System.out.println(ans);
            return;
              }
          
      
       
        if (sc + 1 <= dc) {// 2
            for (int i = 1; i <= dc ; i++) {
                getMazePaths(sr, sc + i, dr, dc,  ans+"h" + i );// 2

            }

        }
         if (dr >= sr + 1) {// 3
            for (int i = 1; i < dr; i++) {
                getMazePaths(sr + i, sc, dr, dc,  ans+"v" + i );// 3
            }
        }
       
        if (dr >= sr + 1 && sc + 1 <= dc) { // 4
            int d = Math.min(dr, dc); // number of diagonals
            for (int i = 1; i < d; i++) {
                getMazePaths(sr + i, sc + i, dr, dc, ans+"d" + i );// 2

            }

        }

    }

}