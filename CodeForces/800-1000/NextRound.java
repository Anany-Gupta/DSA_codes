import java.io.*;
import java.util.*;
import java.util.Scanner;
 
public class NextRound{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int k = sc.nextInt();
        int mMarks=0;
        for(int i = 0 ; i<n ;i++){
            a[i]=sc.nextInt();
            if(i==k){
                mMarks=a[i];
            }
        }
        if(mMarks==0){
            System.out.println(0);
            return;
            
        }
        int count=0;
        for(int i = 0 ; i < k ; i++){
            if(a[i]>=mMarks){
                count++;
            }
        }
        System.out.println(count);
        
    }
}