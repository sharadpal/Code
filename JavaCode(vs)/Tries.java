import java.awt.image.BandedSampleModel;

public class Tries {
//    static class Node{
//        Node children[]=new Node[26];
//        boolean eow=false;
//
//        Node(){
//            for(int i=0;i<26;i++){
//                children[i]=null;
//            }
//        }
//    }
//    public static Node root= new Node();
//    public static void insert(String word){
//        Node curr= root;
//        for(int level=0;level<word.length();level++){
//            int idx=word.charAt(level)-'a';
//            if(curr.children[idx]==null){
//                curr.children[idx]=new Node();
//            }
//            curr=curr.children[idx];
//        }
//        curr.eow=true;
//    }
//
//    public static boolean search(String key){
//        Node curr=root;
//        for(int level=0;level<key.length();level++){
//            int idx= key.charAt(level)-'a';
//            if(curr.children[idx]==null){
//                return false;
//            }
//            curr=curr.children[idx];
//        }
//        return curr.eow==true;
//    }
//    //----->>>>> WORD BREAK
//    public static boolean wordBreak(String key){
//        if(key.length()==0){
//            return true;
//        }
//        for(int i=1;i<=key.length();i++){
//            if(search(key.substring(0,i)) && wordBreak(key.substring(i))){
//                return true;
//            }
//
//        }
//        return false;
//    }
//
//    public static void main(String[] args) {
//        String words[]={ "the","a","there","their","any","three"};
//        for(int i=0;i<words.length;i++){
//            insert(words[i]);
//        }
//        System.out.println(search("three"));
//        System.out.println(search("thorr"));

//        String arr[]={"i","like","sam","sumsung","mobile","ice"};
//        for(int i=0;i<arr.length;i++){
//            insert(arr[i]);
//        }
//        String key="ilike";
//        System.out.println(wordBreak(key));
//    }


    //------->>>>> PREFIX PROBLEMS
    static class Node{
        Node[] children= new Node[26];
        boolean eow=false;
        int freq;
        public Node(){
            for(int i=0;i<children.length;i++){
                children[i]=null;
            }
            freq=1;
        }
    }
    public static Node root=new Node();
    public static void insert(String word){
        Node curr= root;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }else {
                curr.children[idx].freq++;
            }
            curr=curr.children[idx];
        }
        curr.eow=true;
    }
    public static void findPrefix(Node root,String ans){
        if(root==null){
            return;
        }
        if(root.freq==1){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<root.children.length;i++){   // i<26 is same
            if(root.children[i]!=null){
                findPrefix(root.children[i],ans+(char)(i+'a'));
            }
        }
    }
    //--------->>>>>>>>> STARTWITH

    public static boolean startWith(String prefix){
        Node curr= root;
        for(int i=0;i<prefix.length();i++){
            int idx= prefix.charAt(i)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr=curr.children[idx];
        }
        return true;
    }

    //-------->>>>>> UNIQUE SUBSTRING
    public static int countNodes(Node root){
        if(root==null){
            return 0;
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(root.children[i]!=null){
                count+=countNodes(root.children[i]);
            }
        }
        return count+1;
    }

    public static void main(String[] args) {
//        String arr[]={"zebra","dog","duck","dove"};
//        for(int i=0;i<arr.length;i++){
//            insert(arr[i]);
//        }
//        root.freq=-1;
//        findPrefix(root,"");

        //--->> startwith problem
//        String words[] = {"apple", "app", "mango", "man", "women"};
//        String prefix1="app";
//        String prefix2="moon";
//
//        for(int i=0;i< words.length;i++){
//            insert(words[i]);
//        }
//        System.out.println(startWith(prefix1));
//        System.out.println(startWith(prefix2));

        //-->>>>> UNIQUE SUBSET
        String str="ababa";
        for(int i=0;i<str.length();i++){
            String suffix= str.substring(i);
            insert(suffix);
        }
        System.out.println(countNodes(root));
    }



}
