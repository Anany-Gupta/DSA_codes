
import java.util.ArrayList;
import java.util.HashMap;


public class hmIntro {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        System.out.println(hm);
        hm.put("I",270);
        hm.put("A",170);
        hm.put("C",350);
        hm.put("T",600);
        hm.put("P",210);
        hm.put("Q",230);
        System.out.println(hm);
        System.out.println("I :"+hm.get("I"));
        System.out.println("i :"+ hm.get("i"));//Case Sensitive Prints NULL
        
        hm.put("Q",21);//If we put a key already existing the it will update the value for that key
        System.out.println(hm);
        //Removal
        
        System.out.println("hm.remove('keyValue')");
        System.out.println("hm.remove('I')");
        hm.remove("I");
        System.out.println("hm.remove('Q')");
        System.out.println(hm.remove("Q"));
        System.out.println("hm.remove('Q')");
        System.out.println(hm.remove("Q"));

        System.out.println("hm.containsKey('Q')");
        System.out.println(hm.containsKey("Q"));
        System.out.println("hm.containsKey('P')");
        System.out.println(hm.containsKey("P"));
        
        
        System.out.println(hm);
        System.out.println("hm.keySet()");
        System.out.println(hm.keySet());


        //We cannot directly convert Set -> ArrayList So we use  Constructor of ArrayList


        ArrayList<String> list = new ArrayList<>(hm.keySet());
        System.out.println(list.toString());
    }
    
}
