// Question : - You are given N intervals and for ith interval you have its start time, end time and its special value. 
//              Write a function to select 2 intervals which do not coincide with each other amd maximise the sum of special values of two intervals

import java.util.*;
import java.lang.*;

public class stacksquad {
    public static class Interval implements Comparable<Interval> {
        int st, et, spval;

        Interval(int st, int et, int spval) {
            this.st = st; // start time
            this.et = et; // end time
            this.spval = spval; // special value
        }

        public int compareTo(Interval i) {
            if (this.st > i.st) {
                return this.st-i.st;
            }
            return this.st-i.st ;
        }
    }

    public static void display(Interval i) {
        System.out.println(i.st + " " + i.et + " " + i.spval);

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Interval arr[] = new Interval[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Interval(sc.nextInt(), sc.nextInt(), sc.nextInt());
        }
        System.out.println();
        Arrays.sort(arr);
        // for (int i = 0; i < n; i++) {
        //     display(arr[i]);
        // }
        sc.close();
        int sumdp[] = new int[arr.length];
        
        for (int i = 0; i < arr.length-1; i++) {
            int currentVal = arr[i].spval;
            int sencondVal = Integer.MIN_VALUE;
            for (int j = i + i; j < arr.length; j++) {
                if(arr[i].et<arr[j].st){
                    sencondVal = Math.max(arr[j].spval, sencondVal);
                }
                
            }
            if(sencondVal==Integer.MIN_VALUE){
                sumdp[i]=-1;
            }
            else sumdp[i]=currentVal+sencondVal;
            
        }
        int answer=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            answer = Math.max(answer, sumdp[i]);
        }
        System.out.println(answer);
    }

}
