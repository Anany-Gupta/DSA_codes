import java.util.*;

public class Solution4 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (n>0 && n <= 1000000000&& m>0){
        System.out.println(countMaze(0, n, m));
        ArrayList<String> answer = getPaths(0, n, m);
        System.out.println(answer);
        printMaze(0,n,m,"");}

        sc.close();
    }

    public static ArrayList<String> getPaths(int sr, int dr, int choice) {
        if (sr == dr) {
            ArrayList<String> bList = new ArrayList<>();
            bList.add("");
            return bList;
        } else if (sr > dr) {
            ArrayList<String> bList = new ArrayList<>();
            return bList;
        }
        ArrayList<String> myPath = new ArrayList<>();// 1

        if (dr >= sr + 1) {// 3
            for (int i = 1; i <= choice && i+sr<=dr; i++) {
                ArrayList<String> prevPath = getPaths(sr + i, dr, choice);// 3
                for (String path : prevPath) {
                    myPath.add(i + path);
                }
            }
        }

        return myPath;

    }
    public static int countMaze(int sr, int dr, int choice) {
        if (sr == dr) {
            return 0;
        }
        
        int Totalcount=1;
        for (int i = 1; i + sr <= dr && i <=choice ;i++) {

            int csf=countMaze(sr + i, dr, choice);
            Totalcount+=csf;

        }
        return Totalcount;
    }

    public static void printMaze(int sr, int dr, int choice, String ans) {
        if (sr == dr) {
            System.out.println(ans);
            return;
        }
        for (int i = 1; i + sr <= dr &&  i <= choice ; i++) {
            printMaze(sr + i, dr, choice, ans + i);

        }
    }
}
