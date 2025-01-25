import java.util.*;

// -------->>>>>>>

//public class Array{
//    public static int buyAndSellStocks(int prices[]){
//        int buyPrice=Integer.MAX_VALUE;
//        int maxProfit=0;
//        for(int i=0;i<prices.length;i++){
//            if(buyPrice<prices[i]){
//                int profit= prices[i]-buyPrice;   //  today's profit
//                maxProfit= Math.max(maxProfit,profit);
//            }else{
//                buyPrice= prices[i];
//            }
//        }
//        return  maxProfit;
//    }
//
//    public static void main(String[] args) {
//        int prices[]= {7,1,5,3,6,4};
//        System.out.println(buyAndSellStocks(prices));
//    }
//}

// ------------>>>>>> TRAPPEDRAINWATER

//public class Array{
//    public static int trappedRainWater(int height[]){
//        int n= height.length;
//        // CALCULATE LEFT MAX BOUNDARY - ARRAY
//        int leftMax[] = new int[n];
//        leftMax[0]= height[0];
//        for(int i=1;i<n;i++){
//            leftMax[i]= Math.max(height[i],leftMax[i-1]);
//        }
//        //CALCULATE RIGHT MAX BOUNDARY- ARRAY
//        int rightMax[]= new int[n];
//        rightMax[n-1]= height[n-1];
//        for(int i=n-2;i>=0;i--){
//            rightMax[i]= Math.max(height[i],rightMax[i+1]);
//        }
//        int trappedWater=0;
//        // LOOP
//        for(int i=0;i<n;i++){
//            // WATERlEVEL = MIN(KEFTMAX BOUND, RIGHTMAX BOUND)
//            int waterLevel= Math.min(leftMax[i], rightMax[i]);
//            trappedWater+= waterLevel- height[i];
//        }
//        return trappedWater;
//    }
//
//    public static void main(String[] args) {
//        int height[]= {4,2,0,6,3,2,5};
//        System.out.println(trappedRainWater(height));
//    }
//}


//------->>>>>>>>>>>>> MAX SUBARRAY ( KADANE'S)

//public class Array{
//    public static void kadanes(int num[]){
//        int ms= Integer.MIN_VALUE;
//        int cs=0;
//        for(int i=0;i<num.length;i++){
//            cs= cs+ num[i];
//            if (cs<0){
//                cs=0;
//            }
//            ms= Math.max(cs,ms);
//
//        }
//        System.out.println("our max subArray is : "+ ms);
//    }
//
//    public static void main(String[] args) {
//        int num[]= { -2,-3,4,-1,-2,1,5,-3};
//        kadanes(num);
//    }
//}


//-------->>>>>>>> SUB ARRAY
public class Array{
    public static void subArray(int num[]){
        int tot=0;
        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=i;j<num.length;j++){
                int end = j;
                for(int k= start;k<=end;k++){  //  print
                    System.out.print(num[k]+" "); // SUBARRAY
                }
                tot++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(tot);
    }

    public static void main(String[] args) {
        int num[]= {1,2,3,4,5,6,7};
        subArray(num);
    }
}

//---------->>>>>>> PAIR OF ARRAY

//public class Array{
//    public static void main(String[] args) {
//        int tp=0;
//        int number[]= { 1,2,3,4,5,6};
//        for(int i=0;i<number.length;i++){
//            int current=number[i];
//            for(int j= i+1;j<number.length;j++){
//                System.out.print("("+number[i]+","+number[j]+")");
//                tp++;
//            }
//            System.out.println();
//        }
//        System.out.println(tp);
//    }
//
//}


// ----------->>>>>>  REVERSE ARRAY
//
//public  class Array{
//    public static void reverse(int number[]){
//        int first= 0;
//        int last= number.length-1;
//        while(first<last){
//            // SWAP
//            int temp= number[last];
//            number[last]= number[first];
//            number[first]= temp;
//            first++;
//            last--;
//        }
//    }
//
//    public static void main(String[] args) {
//        int number[]= {1,2,3,4,5,6,7,8,9};
//        reverse(number );
//        for(int i=0;i<number.length;i++){
//            System.out.print(number[i]+ " ");
//        }
//        System.out.println();
//    }
//}


//   ------->>>> BINARRY SEARCH CODE
//public class Array{
//    public static int binarrySearch(int number[], int key){
//        int start=0, end= number.length-1;
//        while(start<=end){
//            int mid= (start+end)/2;
//            // comprisons
//            if(number[mid]==key){
//                return mid;
//            }
//            if(number[mid]<key){
//                start= mid+1;
//            }else { // left
//                end = mid-1;
//            }
//        }
//        return -1;
//    }
//
//    public static void main(String[] args) {
//        int number[]= {1,2,3,4,5,6,7,8,9};
//        int key= 6;
//        System.out.println(binarrySearch(number,key));
//    }
//
//}


//pu blic class Array {
////    public static void main(String[] args) {
////        Scanner sc= new Scanner(System.in);
////              int marks[]= new int[50];
////         System.out.println(marks.length);
////    }
//    public static void update(int marks[], int nonchangable){
//        nonchangable = 5;
//        for(int i=0;i<marks.length;i++){
//            marks[i]= marks[i] + 1;
//        }
//  }
//    public static void main(String[] args) {
//        int marks[]= {1,2,3};
//        int nonchangable= 10;
//        update(marks, nonchangable);
//        System.out.println(nonchangable);
//        for(int i=0;i<marks.length;i++){
//            System.out.print(marks[i]+ " ");
//        }
//        System.out.println();
//    }
//}










