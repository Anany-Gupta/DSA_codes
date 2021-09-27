import java.io.*;
import java.util.*;

public class floodfill {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        floodF(arr, 0, 0, "",new boolean[n][m]);
        scn.close();
    }

    public static void floodF(int[][] maze,int sr,int sc,String psf,boolean visited[][]){
        if (sr<0 ||  sc<0 || sr>=maze.length || sc>=maze[0].length || visited[sr][sc]==true || maze[sr][sc]==1 ){
            return;
        }
        if(sr==maze.length -1 && sc==maze[0].length-1){

            System.out.println(psf);
            return;

        }

        visited[sr][sc]=true;
        floodF(maze, sr-1, sc, psf, visited);
        floodF(maze, sr, sc-1, psf, visited);
        floodF(maze, sr+1, sc, psf, visited);
        floodF(maze, sr, sc+1, psf, visited);
        visited[sr][sc]=false;

    }
    
}
