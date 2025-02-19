import java.util.*;
import java.util.LinkedList;
import java.util.HashMap;
public class HashMap_2 {
    static class HashMap<K,V>{
        private class Node{
            K key;
            V value;
            public Node(K key, V value){
                this.key= key;
                this.value= value;
            }
        }
        private int n;
        int N;
        private LinkedList<Node>buckets[];
        public HashMap(){
            this.N=0;
            this.buckets= new LinkedList[4];
            for(int i=0;i<4;i++){
                this.buckets[i]=new LinkedList<>();
            }
        }
        private int hashFunction(K key){
            int hc= key.hashCode();
            return Math.abs(hc)%buckets.length;
        }
        private int SearchInLL(K key, int bi){   // bi= bucket idx
            LinkedList<Node>ll= buckets[bi];
            int di=0;
            for(int i=0;i<ll.size();i++){
                Node node= ll.get(i);
                if(node.key==key){
                    return di;
                }
                di++;
            }
            return -1;
        }
        @SuppressWarnings("unchecked")
        private void rehash(){
            LinkedList<Node> oldBuck[]= buckets;
            buckets= new LinkedList[N*2];
            N=2*N;
            for(int i=0;i<buckets.length;i++){
                buckets[i]=new LinkedList<>();
            }
            for(int i=0;i<oldBuck.length;i++){
                LinkedList<Node> ll= oldBuck[i];
                for(int j=0;j<ll.size();j++){
                    Node node= ll.remove();
                    put(node.key,node.value);
                }
            }
        }
        public void put(K key,V value){
            int bi= hashFunction(key);
            int di= SearchInLL(key,bi);
            if(di!= -1){
                Node node= buckets[bi].get(di);
                node.value= value;
            }else{
                buckets[bi].add(new Node(key,value));
                n++;
            }
            double lambda=(double) n/N;
            if(lambda>2.0){
                rehash();
            }
        }
        public boolean containsKey(K key){
            int bi= hashFunction(key);
            int di= SearchInLL(key,bi);
            if(di!= -1){
                return true;
            }else{
                return false;
            }
        }
        public V remove(K key){
            int bi= hashFunction(key);  // bi= bucketIndex
            int di= SearchInLL(key,bi); // di= dataIndex
            if(di!= -1){
                Node node= buckets[bi].remove(di);
                n--;
                return node.value;
            }else{
                return null;
            }
        }
        public V get(K key){
            int bi= hashFunction(key);
            int di= SearchInLL(key,bi);
            if(di!= -1){
                Node node= buckets[bi].get(di);
                return  node.value;
            }else{
                return null;
            }
        }
        public ArrayList<K> keSet(){
            ArrayList<K> keys= new ArrayList<>();
            for(int i=0;i<buckets.length;i++){
                LinkedList<Node>ll= buckets[i];
                for(Node node: ll){
                    keys.add(node.key);
                }
            }
            return keys;
        }
        public boolean isEmpty(){
            return n==0;
        }
    }


    public static void main(String[] args) {
        HashMap<String,Integer> hm= new HashMap<>();
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",50);
        hm.put("Nepal",5);

        ArrayList<String> keys= hm.keSet();
        for(String key: keys){
            System.out.println(key);
        }
    }
}
