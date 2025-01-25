public class DivedeConquer {

    //---------->>>>>>>>>>>>>>>>>>>> QUICK SHORT
//    public static  void printArr(int arr[]){
//        for(int i= 0;i<arr.length;i++){
//            System.out.print(arr[i]);
//        }
//        System.out.println();
//    }
//    public static void quickSort(int arr[],int si,int ei){
//        if(si>=ei){
//            return;
//        }
//        // Last element
//        int pIdx= partition(arr,si,ei);
//        quickSort(arr, si,pIdx-1);  //left
//        quickSort(arr,pIdx+1,ei);  // rigth
//
//    }
//    public static int  partition(int arr[],int si, int ei){
//        int pivot = arr[ei];
//        int i= si-1; // to make place for els smaller than pivot
//        for(int j=si;j<ei;j++){
//            if(arr[j]<=pivot){
//                i++;
//                //swap
//                int temp= arr[j];
//                arr[j]= arr[i];
//                arr[i]= temp;
//            }
//        }
//        i++;
//        int temp= pivot;
//        arr[ei]= arr[i];
//        arr[i]=temp;
//        return i;
//    }
//
//    public static void main(String[] args) {
//        int arr[]= {6,3,9,8,2,5};
//        quickSort(arr,0,arr.length-1);
//        printArr(arr);
//    }


   // ------------------>>>>>>>>>>>>>>>>>>  SUM OF RECURSION METHOD

//   public static int sum(int n ){
//       if(n==0){
//           return 0;
//       }
//
//       return n+sum(n-1);
//   }
//
//    public static void main(String[] args) {
//
//        System.out.println(sum(5));
//    }



    //  ------------->>>>>>>>>>>>>>>>   POWER FUNCTION OF RECURTION METHOD



//    public static int power(int a, int n){
//        if(n==0){
//            return 1;
//        }
//        int halfPowerSqr= power(a,n/2)*power(a,n/2);
//        if(n%2!=0){   // odd power
//            return a*halfPowerSqr;
//        }
//        return halfPowerSqr;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(power(2,30));
//    }


}


