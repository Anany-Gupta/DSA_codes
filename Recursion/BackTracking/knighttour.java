import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int chess[][] = new int[n][n];
    int r = sc.nextInt();
    int c = sc.nextInt();
    printKnightsTour(chess, r, c, 1);
    sc.close();


  }

  public static void printKnightsTour(int[][] chess, int r, int c, int Mn) {
    if (r < 0 || r >= chess.length || c < 0 || c >= chess[0].length || chess[r][c] != 0 ) {
      return;

    }
    if (Mn == chess.length * chess.length) {
      chess[r][c] = Mn;
      displayBoard(chess);
      chess[r][c] = 0;
      return  ;
    }

    chess[r][c] = Mn;

    printKnightsTour(chess, r - 2, c + 1, Mn + 1);
    printKnightsTour(chess, r - 1, c + 2, Mn + 1);
    printKnightsTour(chess, r + 1, c + 2, Mn + 1);
    printKnightsTour(chess, r + 2, c + 1, Mn + 1);
    printKnightsTour(chess, r + 2, c - 1, Mn + 1);
    printKnightsTour(chess, r + 1, c - 2, Mn + 1);
    printKnightsTour(chess, r - 1, c - 2, Mn + 1);
    printKnightsTour(chess, r - 2, c - 1, Mn + 1);
    chess[r][c] = 0;

  }

  public static void displayBoard(int[][] chess) {
    for (int i = 0; i < chess.length; i++) {
      for (int j = 0; j < chess[0].length; j++) {
        System.out.print(chess[i][j] + " ");
      }
      System.out.println();
    }

    System.out.println();
  }
}