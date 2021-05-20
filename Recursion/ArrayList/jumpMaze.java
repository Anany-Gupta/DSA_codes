import java.util.*;

public class jumpMaze {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<String> answer = getMazePaths(1, 1, n, m);
        System.out.println(answer);
        sc.close();
    }

    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            ArrayList<String> bList = new ArrayList<>();
            bList.add("");
            return bList;
        } else if (sc > dc || sr > dr) {
            ArrayList<String> bList = new ArrayList<>();
            return bList;
        }
        ArrayList<String> myPath = new ArrayList<>();//1
        if (sc + 1 <= dc) {//2
            for (int i = 1; i <= dc-sc; i++) {
                ArrayList<String> horizontalM = getMazePaths(sr, sc+i, dr, dc );// 2
                for (String path : horizontalM) {
                    myPath.add("h" + i+path );
                }
            }

        }
        if (dr >= sr + 1) {//3
            for (int i = 1; i < dr-sr; i++) {
                ArrayList<String> verticalM = getMazePaths(sr + i, sc, dr, dc);// 3
                for (String path : verticalM) {
                    myPath.add( "v" + i+ path );
                }
            }
        }
        if (dr >= sr + 1 && sc + 1 <= dc){ //4
            int d=Math.min(dr, dc); // number of diagonals
            for (int i = 1; i < d; i++) {
                ArrayList<String> diagonalM = getMazePaths(sr+i, sc+i, dr, dc );// 2
                for (String path : diagonalM) {
                    myPath.add("d" + i+path );
                }
            }
            
        }

        return myPath;

    }

}