import javax.xml.parsers.SAXParser;
import java.util.*;

public class Hash_1 {
//    public static void main(String[] args) {
//        HashMap<String,Integer> hm= new HashMap<>();

//        //insert
//        hm.put("India",100);
//        hm.put("china",150);
//        hm.put("US",50);

//        System.out.println(hm);
//        // output-{china=150, US=50, India=100}  order undifine
//          // get operation  O(1)
//
//        int population = hm.get("India");
//        System.out.println(population);     // 100
//        System.out.println(hm.get("Indonesia"));   // null
//
//        //containsKey_o(1)     true/ false
//        System.out.println(hm.containsKey("India")); // true
//        System.out.println(hm.containsKey("Indonesia"));  //false


        // remove
//
//        System.out.println(hm.remove("china"));
//        System.out.println(hm);
//        // 150
//        //{US=50, India=100}
//
//        // size
//        System.out.println(hm.size());  // 2
//
//        // is empty
//
//        System.out.println(hm.isEmpty());  //false


//
//
//        HashMap<String,Integer> hm = new HashMap<>();
//        hm.put("India",100);
//        hm.put("china",150);
//        hm.put("US",50);
//        hm.put("Indonesia",6);
//        hm.put("Nepal", 5);
//
//        // Iterate
//
//        Set<String> keys= hm.keySet();
//        System.out.println(keys);
//
//        for(String k: keys){
//            System.out.println("key="+k+", value="+hm.get(k));
//        }


//    }


    //------>>>>>>>>>>>>>>>>>>>>>>  2 LinkedHashMap
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm= new LinkedHashMap<>();
        lhm.put("India",100);
        lhm.put("China",150);
        lhm.put("Us",50);
        System.out.println(lhm); // o/p=key insert order

        TreeMap<String,Integer>tm= new TreeMap<>();
        tm.put("India",100);
        tm.put("China",150);
        tm.put("Us",50);
        System.out.println(tm);  // o/p= alphabetical order(key) n
    }
}



