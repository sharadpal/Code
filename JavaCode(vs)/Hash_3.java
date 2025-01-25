import java.util.*;
public class Hash_3 {
    // MAJORITY ELEMENT (find ele which freq arr.length/3)
//    public static void main(String[] args) {
//        int arr[]={1,3,2,5,1,3,1,5,1};
//        HashMap<Integer,Integer>map= new HashMap<>();
//
//        for(int i=0;i<arr.length;i++){
//            if(map.containsKey(arr[i])){
//                map.put(arr[i],map.get(arr[i])+1);
//            }else{
//                map.put(arr[i],1);
//            }
//        }
//        Set<Integer> keySet= map.keySet();
//        // we directly use, not store in the set
//        // for(Integer key: map.keySet()
//        for(Integer key: keySet){
//            if(map.get(key)>arr.length/3){
//                System.out.println(key) ;
//            }
//        }
//    }


    //------------>>>>>>>>>> VALID ANAGRAM
    public static boolean isAnagram(String s,String t){
        HashMap<Character,Integer> map=new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        for(int i=0;i<t.length();i++){
            char ch= t.charAt(i);
            if(map.get(ch)!=null){
                if(map.get(ch)==1){
                    map.remove(ch);
                }else {
                    map.put(ch, map.get(ch) - 1);
                }
            }else{
                return false;
            }
        }
        return map.isEmpty();
    }

    public static void main(String[] args) {
        String s= "race";
        String t= "care";
        System.out.println(isAnagram(s,t));
    }
}
