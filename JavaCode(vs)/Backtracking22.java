public class Backtracking22 {
//    public static void changeArr(int arr[],int i,int  val){
//        //BASE CASE
//        if(i==arr.length){
//            printArr(arr);
//            return;
//        }
//        //RECURSION
//        arr[i]=val;
//        changeArr(arr,i+1,val+1);
//        arr[i]=arr[i]-2;
//    }
//    public static void printArr(int arr[]){
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//
//        }
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//        int arr[]= new int[5];
//        changeArr(arr,0 , 1);
//        printArr(arr);
//    }



    // ------------>>>>>>>>>>>>> FIND THE SUBSETS



//    public static void findSubsets(String str,String ans,int i){
//        //BASE CASE
//        if(i==str.length()){
//            if(i==0){
//                System.out.println("NULL");
//                return;
//            }
//            System.out.println(ans);
//            return;
//        }
//        // YES CHOISCE
//        findSubsets(str,ans+str.charAt(i),i+1);
//        // NO CHOICE
//        findSubsets(str,ans,i+1);
//    }
//
//    public static void main(String[] args) {
//        String str= "abc";
//        findSubsets(str,"",0);
//    }


    //--------------->>>>>>>>>>>>>>>>>>> FIND PERMUTATION


//     public static void findPermutation(String str, String ans){
//         // base case
//         if(str.length()==0){
//             System.out.println(ans);
//             return;
//         }
//         // recursion
//         for(int i=0;i<str.length();i++){
//             char curr= str.charAt(i);
//             // abcde=>  "ab"+"de"= "abde "
//             String newStr= str.substring(0,i)+str.substring(i+1);
//             findPermutation(newStr,ans+ curr);
//         }
//     }
//
//    public static void main(String[] args) {
//        String str= "abc";
//        findPermutation(str,"");
//    }


    //------------>>>>>>>>>>>> GRID WAYS

    public static int gridWays(int i,int j,int n,int m){
        if(i==n-1|| j==m-1){             // condn for last cell
            return 1;
        } else if (i==n|| j==n) {   // boundary cross
            return 0;
        }
        int w1= gridWays(i+1,j,n,m);
        int w2 = gridWays(i,j+1,n,m);
         return w1+w2;
    }

    public static void main(String[] args) {
        int n=3,m=3;
        System.out.println(gridWays(0,0,n,m));
    }

}
