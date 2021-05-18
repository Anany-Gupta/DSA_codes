
import java.util.*;

public class maze {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<String> answer = getMazePaths(1, 1, n, m);
        System.out.println(answer);
        sc.close();
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr == dr && sc == dc){
            ArrayList<String> bList = new ArrayList<>();
            bList.add("");
            return bList;
        }
        ArrayList<String> myPath = new ArrayList<>();//1
        if (sc+1<=dc){
            ArrayList<String> horizontalM = getMazePaths(sr, sc, dr, dc-1);//2
            for(String path : horizontalM){
                myPath.add(path+"h");
            }

        }
        if (dr>=sr+1){
            
            ArrayList<String> verticalM = getMazePaths(sr, sc, dr - 1, dc);//3
            for(String path : verticalM){
                myPath.add(path+"v");//8
            }
        }
        
        return myPath;

        }
       

}