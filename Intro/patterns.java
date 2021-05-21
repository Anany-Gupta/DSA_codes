/*
import java.util.*;
public class patterns{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++)
                System.out.print("*\t");
            
            System.out.println();
            
        }
    }
}
*/
/*
import java.util.*;
public class patterns{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for ( int i=1;i<=n;i++)
        {
            for (int j=1;j<=n;j++)
            {  
                if (i==1){
                    if (j>=1 && j<=((int)n/2)+1)
                        System.out.print("*\t");
                    else if (j>((int)n/2+1) && j<n)
                        System.out.print("\t");
                    else
                        System.out.print("*\t");
                }
                else if (i>1 && i<=(int)n/2){
                    if (j<=((int)n/2))
                        System.out.print("\t");
                    else if (j==((int)n/2)+1)
                        System.out.print("*\t");
                    else if(j>((int)n/2)+1 && j<n)
                        System.out.print("\t");
                    else 
                        System.out.print("*\t");
                        
                }
                else if(i==(int)n/2+1)
                        System.out.print("*\t");
                else if(i>(int)n/2+1 && i<n)
                {
                    if (j==1)
                            System.out.print("*\t");
                    else if(j>1 && j<((int)n/2)+1)
                            System.out.print("\t");
                    else if(j==((int)n/2)+1)
                            System.out.print("*\t");
                    
                }
               if (i==n){
                    if (j==1)
                        System.out.print("*\t");
                    else if (j>1 && j<((int)n/2)+1)
                        System.out.print("\t");
                    else if(j>=((int)n/2)+1)
                        System.out.print("*\t");
                }

            }System.out.println();
        }
        
    }
}
*/
/*
import java.util.*;
public class patterns{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for ( int i=1;i<=n;i++)
        {
            for (int j=n;j>i-1;j--)
              
                System.out.print("*\t");
                
            System.out.println();
        }

}
}*/
/*
import java.util.*;
public class patterns{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for ( int i=1;i<=n;i++)
        {
            for (int j=1;j<i;j++)
              
                System.out.print("\t");
            for (int j=i;j<=n;j++)
              
                System.out.print("*\t");
                
            System.out.println();
        }

}
}

/*
import java.util.*;
public class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for ( int i=1;i<=n;i++)
        {
            for (int j=1;j<n-i+1;j++)
              
                System.out.print("\t");
            for (int j=n-i+1;j<=n;j++)
              
                System.out.print("*\t");
                
            System.out.println();
        }

}
}
*/
/*
import java.util.*;
public class patterns{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int space=(int)n/2;
        int star=1;
        for (int i=1;i<=n;i++){
            
            
            for (int j=1;j<=space;j++)
                System.out.print("\t");
            for (int j=1;j<=star;j++)
                System.out.print("*\t");
            
            if (i<=(int)n/2){
                space--;
                star+=2;
            }
            else{
                space++;
                star-=2;
            }
            System.out.println();
            
            
        }
    }
}
*/
/*
import java.util.*;
public class patterns{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int space=1;
        int star=(int)n/2+1;
        for (int i=1;i<=n;i++){
            
            
            for (int j=1;j<=star;j++)
                System.out.print("*\t");
            for (int j=1;j<=space;j++)
                System.out.print("\t");
            for (int j=1;j<=star;j++)
                System.out.print("*\t");
            if (i<=(int)n/2){
                space+=2;
                star--;
            }
            else{
                space-=2;
                star++;
            }
            System.out.println();
            
            
        }
    }
}
*/
/*
import java.util.*;
public class patterns{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for ( int i=1;i<=n;i++)
        {
            for (int j=n;j>i-1;j--)
              
                System.out.print("*\t");
                
            System.out.println();
        }

}
}*/
/*
import java.util.*;
public class patterns{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for ( int i=1;i<=n;i++)
        {
            for (int j=1;j<i;j++)
              
                System.out.print("\t");
            for (int j=i;j<=n;j++)
              
                System.out.print("*\t");
                
            System.out.println();
        }

}
}
*/
/*
import java.util.*;
public class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for ( int i=1;i<=n;i++)
        {
            for (int j=1;j<n-i+1;j++)
              
                System.out.print("\t");
            for (int j=n-i+1;j<=n;j++)
              
                System.out.print("*\t");
                
            System.out.println();
        }

}
}

*/
import java.util.*;
public class patterns{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       for (int j=0;j<n;j++){
        for (int i=0;i<j;i++)   
            System.out.print("\t");
        System.out.println("*\t");
        
       }
            
       sc.close();     
        
    }
}
/*
import java.util.*;
public class patterns{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       for (int j=0;j<n;j++){
        for (int i=0;i<n-j-1;i++)   
            System.out.print("\t");
        System.out.println("*\t");
       }
            
        
    }
}
*/
/*
//Pattern 9 usefull for n=odd
import java.util.*;
public class patterns{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int space1=0;
        int space2=n-2;
        for (int i=1;i<=n;i++){
            //System.out.println(space1+"    "+space2);
            
            for (int j=0;j<space1;j++)
                System.out.print("\t");
            System.out.print("*\t");
            for (int j=0;j<space2;j++)
                System.out.print("\t");
           
            if (space2>0)
                System.out.print("*\t");
             
            if (i<=(int)n/2){
                space1++;
                space2-=2;
            }
            else{
                space2+=2;
                space1--;
            }
            System.out.println();
    }
}
}
*/
/*
//Pattern 9 usefull for n=odd

import java.util.*;
public class patterns{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
          for (int j=1;j<=n;j++){
              if (i==j || i+j==n+1)
                  System.out.print("*\t");
              else
                  System.out.print("\t");
          }System.out.println();
          
        }
        
    }
}
*/

/*
//Pattern 10 
import java.util.*;
public class patterns{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int space1=(int)n/2;
        int space2=-1;
        for (int i=1;i<=n;i++){
            //System.out.println(space1+"    "+space2);
            
            for (int j=0;j<space1;j++)
                System.out.print("\t");
            System.out.print("*\t");
            for (int j=0;j<space2;j++)
                System.out.print("\t");
           
            if (space2>0)
                System.out.print("*\t");
            
            if (i<=(int)n/2){
                space1--;
                space2+=2;
            }
            else{
                space2-=2;
                space1++;
            }
            System.out.println();
    }
}
}
*/
/*
//Pattern 11
import java.util.*;
public class patterns{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int count=1;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(count+"\t");
                count++;
            }
                System.out.println();
                
        }
 
    }
}
*/
/*
//Pattern 12
import java.util.*;
public class patterns{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int c;
        
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(a+"\t");
                c=a+b;
                a=b;
                b=c;
                
            }
                System.out.println();
                
        }
 
    }
}
*/
/*
//Pattern 13
import java.util.*;
public class patterns{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        
        for (int i=0;i<n;i++){
            int icj=1;
            for (int j=0;j<=i;j++){
                
                System.out.print(icj+"\t");
                int icjp1=icj*(i-j)/(j+1);
                icj=icjp1;
                
            }
                System.out.println();
                
        }
 
    }
}
*/
/*14
import java.util.*;
public class patterns{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        
        for (int i=1;i<=10;i++)
                System.out.println(n+"*"+i+"="+n*i);
                
        
 
    }
}
*/
/*15
import java.util.*;
public class patterns{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int space=(int)n/2;
        int star=1;
        int val=1;
        for (int i=1;i<=n;i++){
            
            int cval=val;
            for (int j=1;j<=space;j++)
                System.out.print("\t");
            for (int j=1;j<=star;j++){
                System.out.print(cval +"\t");
                if (j<=star/2)
                    cval++;
                else
                    cval--;
            }
            if (i<=(int)n/2){
                space--;
                star+=2;
                val++;
            }
            else{
                space++;
                star-=2;
                val--;
            }
            System.out.println();
            
            
        }
    }
}
*/
/*

//pattern 16
import java.util.*;
public class patterns{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int space=(2*n)-3;
        int star=1;
        
        for (int i=1;i<=n;i++){
            int count=1;
            for (int j=1;j<=star;j++){
                System.out.print(count+"\t");
                
                    count++;
            }
            for (int j=1;j<=space;j++)
                System.out.print("\t");
            if (i==n){
                star--;
                count--;}
            for (int j=1;j<=star;j++)
            {   
                count--;
                System.out.print(count+"\t");
            
            }
            star++;
            space-=2;
            System.out.println();
                
            
        }

    }
}
*/
/*
//pattern17
import java.util.*;
public class patterns{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int space=n/2;
        int star=1;
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=space;j++)
            {
                if (i==n/2+1)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            for ( int j=1;j<=star;j++)
                System.out.print("*\t");
            System.out.println();
             
            if (i<=n/2)
                star++;
            else 
                star--;
            
        }
}
}
*/
/*
//Pattern 18

import java.util.*;
public class patterns{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int space=0;
        int star=n;
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=space;j++)
            {       
                
                    System.out.print("\t");
            }
            for ( int j=1;j<=star;j++){
                if (i>1 && i<=n/2 && j>1 && j<star)
                System.out.print("\t");
                else
                    System.out.print("*\t");
            }System.out.println();
             
            if (i<=n/2){
                space++;
                star-=2;
            }
            else{ 
                star+=2;
                space--;
            
        }
        }
}
}
*/
/*
//pattern 20

import java.util.*;
public class patterns{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
       
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=n;j++)
            {       
                if (j==1 || j==n)
                    System.out.print("*\t");
                else if (i==j ||i+j==n+1)
                {
                    if (i>n/2)
                        System.out.print("*\t");
                    else 
                        System.out.print("\t");
                    
                }
                else
                    System.out.print("\t");
            
        }System.out.println();
        }
}
}
*/