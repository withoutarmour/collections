import org.w3c.dom.ls.LSOutput;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static Set<String> set1 = new HashSet<String>();
    public static Set<String> set2 = new HashSet<String>();


    public static void main(String[] args){

        set2.add("sss");
        set2.add("eee");
        set1.add("www");
        set1.add("eee");

        System.out.println("Union: "+union(set1,set2));
        System.out.println("Intersect: "+intersect(set1,set2));
    }

    public static String union(Set set1, Set set2) {
        set1.add(set2);
        String un = " ";
        un += set1;
        return un;
    }
    
    public static String intersect(Set set1, Set set2){
        set1.retainAll(set2);
        String un = " ";
        un += set1;
        return un;


    }
}
