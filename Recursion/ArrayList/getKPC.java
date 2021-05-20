import java.util.*;

public class getKPC {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ArrayList<String> ans = KPC(str);
        System.out.println(ans);
        sc.close();
    }

    public static ArrayList<String> KPC(String str) {
        if (str.length() == 0) {
            ArrayList<String> blist = new ArrayList<>();
            blist.add("");

            return blist;
        }
        String subS = str.substring(1);
        ArrayList<String> prevResult = KPC(subS);//1
        ArrayList<String> myResult = new ArrayList<>();
        char num = str.charAt(0);
        ArrayList<String> presentChars = new ArrayList<>();
        switch (num) {
            // 0 -> .;
            // 1 -> abc
            // 2 -> def
            // 3 -> ghi
            // 4 -> jkl
            // 5 -> mno
            // 6 -> pqrs
            // 7 -> tu
            // 8 -> vwx
            // 9 -> yz
            case '0':
                presentChars.add(".");
                presentChars.add(";");
                break;
            case '1':
                presentChars.add("a");
                presentChars.add("b");
                presentChars.add("c");
                break;
            case '2':
                presentChars.add("d");
                presentChars.add("e");
                presentChars.add("f");
                break;
            case '3':

                presentChars.add("g");
                presentChars.add("h");
                presentChars.add("i");
                break;
            case '4':
                presentChars.add("j");
                presentChars.add("k");
                presentChars.add("l");
                break;
            case '5':
                presentChars.add("m");
                presentChars.add("n");
                presentChars.add("o");
                break;
            case '6':

                presentChars.add("p");
                presentChars.add("q");
                presentChars.add("r");
                presentChars.add("s");
                break;

            case '7':
                presentChars.add("t");
                presentChars.add("u");
                break;

            case '8':
                presentChars.add("v");
                presentChars.add("w");
                presentChars.add("x");
                break;
            case '9':
                presentChars.add("y");
                presentChars.add("z");
                break;

        }
        for (String pAns : presentChars) {
            for (String prev : prevResult) {
                myResult.add(pAns + prev);
            }
        }
        return myResult;

    }

}