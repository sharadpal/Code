import java.util.*;
public class Heap_2 {
//    static class Point implements Comparable<Point>{
//        int x;
//        int y;
//        int distSq;
//        int idx;
//        public Point(int x,int y,int distSq,int idx){
//            this.x=x;
//            this.y=y;
//            this.distSq=distSq;
//            this.idx=idx;
//        }
//        @Override
//        public int compareTo(Point p2){
//            return this.distSq-p2.distSq; // ascending order
//
//        }
//    }
//
//    public static void main(String[] args) {
//        int pts[][]={{3,3},{5,-1},{-2,4}};
//        int k=2;
//        PriorityQueue<Point>pq= new PriorityQueue<>();
//        for(int i=0;i<pts.length;i++){
//            int distSq= pts[i][0]*pts[i][0]+pts[i][1]*pts[i][1];
//            pq.add(new Point(pts[i][0],pts[i][1],distSq,i));
//
//        }
//        // nearest k Cars
//        for(int i=0;i<k;i++){
//            System.out.println("C"+pq.remove().idx);
//        }
//    }

    //------->>>>>>>>>>>>> SLIDING WINDOW MAX
    static class Pair implements Comparable<Pair>{
        int val;
        int idx;
        public Pair(int val,int idx){
            this.val=val;
            this.idx=idx;
        }
        public int compareTo(Pair p2){
            // descending
            return p2.val-this.val;
        }

    }

    public static void main(String[] args) {
        int arr[]={1,3,-1,-3,5,3,6,7};
        int k=3;
        int res[]=new int[arr.length-k+1];
        PriorityQueue<Pair>pq= new PriorityQueue<>();
        // 1st window
        for(int i=0;i<k;i++){
            pq.add(new Pair(arr[i],i));

        }
        res[0]=pq.peek().val;
        for(int i=k;i<arr.length;i++){
            while(pq.size()>0 && pq.peek().idx<=(i-k)){
                pq.remove();
            }
            pq.add(new Pair(arr[i],i));
            res[i-k+1]=pq.peek().val;
        }
        // print result
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
