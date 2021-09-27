
import java.util.PriorityQueue;
import java.util.Collections;

public class heapIntro{
    public static class Person implements Comparable<Person>{
        int wt,marks,rank;
        Person(int wt,int marks,int rank){
            this.wt = wt;
            this.marks = marks;
            this.rank= rank;

        }
        public int compareTo(Person o){
            return this.wt-o.wt;//For min
            // return o.wt-this.wt;//For max
        }
        public String toString(){
            return " Weight:" + this.wt +"\tMarks : "+this.marks +" \trank : " + this.rank+"\n" ;
        }
    }
    public static void main(String[] args) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>();//For default min priority
        // // PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());//For max priority=> this will work for other types as well
        // System.out.println(pq);
        // pq.add(10);
        // System.out.println(pq);
        // pq.add(-1);
        // System.out.println(pq);
        // pq.add(5);
        // System.out.println(pq);
        // pq.add(134);
        // System.out.println(pq);
        // pq.add(1);
        // System.out.println(pq);
        // pq.add(0);
        // System.out.println(pq);
        // pq.add(50);
        // System.out.println(pq);
        // pq.add(60);
        // System.out.println(pq);
        
        // System.out.println(pq.peek());
        // System.out.println(pq.remove());
        // System.out.println(pq);
        
        PriorityQueue<Person> pq = new PriorityQueue<>();
        pq.add(new Person(1,2,3));
        pq.add(new Person(4,5,6));
        pq.add(new Person(3,4,5));
        pq.add(new Person(7,8,9));
        pq.add(new Person(2,3,4));
        pq.add(new Person(5,6,7));
        pq.add(new Person(6,7,8));
        while(pq.size()>0){
            System.out.println(pq.remove());

        }
    }
}