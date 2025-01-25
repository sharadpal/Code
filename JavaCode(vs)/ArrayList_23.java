import java.util.*;
public class ArrayList_23 {
//    public static void main(String[] args) {
//         ArrayList<Integer> list=new ArrayList<>();
//         list.add(1);
//         list.add(2);
//         list.add(3);
//        list.add(4);
////        list.remove(0);
////        System.out.println(list);
////        System.out.println(list.size());
//        for(int i=0;i<list.size();i++){
//            System.out.print(list.get(i)+ " ");
//        }
//        System.out.println();
//    }



    //----------->>>>>>>>>>>>>>> REVERSE AN ARRAY LIST

//    public static void main(String[] args) {
//        ArrayList<Integer> list= new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        for(int i=list.size()-1;i>=0;i--){
//            System.out.print(list.get(i)+ " ");
//        }
//        System.out.println();
//    }


     // -------------->>>>>>>>>> FIND THE MAX ELEMENT


//    public static void main(String[] args) {
//        ArrayList<Integer> list= new ArrayList<>();
//        list.add(4);
//        list.add(6);
//        list.add(2);
//        list.add(9);
//        list.add(5);
//        int max= Integer.MIN_VALUE;
//        for(int i=0;i<list.size();i++){
//            if(max<list.get(i)){
//                max= list.get(i);
//            }
//
//
//            max= Math.max(max,list.get(i));        // second method
//        }
//        System.out.println("max Element"+ max);
//    }


    //-------------->>>>>>>>>>>>>> SWAP TWO NUMBER


//    public static void swap(ArrayList<Integer> list, int idx1,int idx2){
//        int temp= list.get(idx1);
//        list.set(idx1,list.get(idx2));
//        list.set(idx2,temp);
//
//    }
//
//    public static void main(String[] args) {
//        ArrayList<Integer> list= new ArrayList<>();
//        list.add(2);
//        list.add(5);
//        list.add(9);
//        list.add(3);
//        list.add(6);
//
//        int idx1=1, idx2=3;
//        System.out.println(list);
//        swap(list,idx1,idx2);
//        System.out.println(list);
//    }


    // -------------->>>>>> ASCENDING & DESCENDING


//    public static void main(String[] args) {
//        ArrayList<Integer> list=new ArrayList<>();
//        list.add(2);
//        list.add(5);
//        list.add(9);
//        list.add(3);
//        list.add(6);
//        System.out.println(list);
//        Collections.sort(list);      // ascending
//        System.out.println(list);
//
//        Collections.sort(list,Collections.reverseOrder());
//        System.out.println(list);
//    }


    //----------->>>>>>>>>> MULTIDIMENTION


//    public static void main(String[] args) {
//        ArrayList<ArrayList<Integer>> mainList= new ArrayList<>();
//        ArrayList<Integer> list= new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        mainList.add(list);
//        ArrayList<Integer> list2= new ArrayList<>();
//        list2.add(3); list2.add(4);
//        mainList.add(list2);
//        for(int i=0;i<mainList.size();i++){
//            ArrayList<Integer> currList= mainList.get(i);
//            for(int j=0;j<currList.size();j++){
//                System.out.print(currList.get(j)+ " ");
//            }
//            System.out.println();
//        }
//        System.out.println(mainList);
//    }



    //------->>>>>>>>>>>>>>>>>> FIND IF ANY PAIR IN A SORTED ARRAYlIST HAS TARGET SUM


//    public static boolean pairSum(ArrayList<Integer> list, int target){
//        for(int i=0;i<list.size();i++){
//            for(int j=i+1;j<list.size();j++){
//                if(list.get(i)+list.get(j)==target){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//
//    public static void main(String[] args) {
//        ArrayList<Integer> list= new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        int target=5;
//        System.out.println(pairSum(list,target));
//    }



    //------------>>>>>>>>>>>>>>>> PAIR SUM TARGET



//    public static boolean pairSum(ArrayList<Integer> list, int target){
//       int lp=0;
//       int rp=list.size()-1;
//       while(lp!=rp) {
//           if (list.get(lp) + list.get(rp) == target) {
//               return true;
//           }
//           if (list.get(lp) + list.get(rp) < target) {
//               lp++;
//           } else {
//               rp--;
//           }
//       }
//       return false;
//    }
//
//    public static void main(String[] args) {
//        ArrayList<Integer> list= new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        int target= 5;
//        System.out.println(pairSum(list,target));
//    }
}
