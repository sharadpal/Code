import javax.imageio.stream.ImageInputStream;

public class Recursion {
//    public static void print(int n){
//        if(n==1){
//            System.out.print(1);
//            return;
//        }
//        System.out.println(n);
//        print(n-1);
//    }
//
//    public static void main(String[] args) {
//        print(10);
//    }


    // FIBONACCI SERIES

//    public static int fib(int  n){
//        if(n==0){
//            return 0;
//        }
//        else if (n==1 || n==2){
//            return 1;
//        }else{
//            return fib(n-1)+fib(n-2);
//        }
//
//    }
//
//    public static void main(String[] args) {
//        int  n=9;
//        System.out.println(fib(n));
//    }


    //  ----->>>>>>>>>>>  PRINT NUMBER FROM N to 1 (INCREASINT ORDER)

//     public static void printInc(int n){
//         if(n==1){
//             System.out.print(n+" ");
//             return;
//         }
//         printInc(n-1);
//         System.out.print(n+" ");
//     }
//
//    public static void main(String[] args) {
//        int n=10;
//        printInc(n);
//    }


    // ---------->>>>>>>>>>> Factorial


//    public static int fib(int n){
//        if(n==0){
//            return 1;
//        }
//        return n*fib(n-1);
//
//    }
//
//    public static void main(String[] args) {
//        int n=-8;
//        System.out.println(fib(n ));
//    }


    //------->>>>>>>>>>>>> PRINT SUM OF FIRST N NATURAL NUMBER


//      public static int sumOfN(int n){
//          if(n==1){
//              return 1;
//          }
//          int sum1= n+sumOfN(n-1);
//          return sum1;
//      }
//
//    public static void main(String[] args) {
//        int n=5;
//        System.out.println(sumOfN(n));
//    }


    //---------->>>>>>>>>>FIBONACCI SERIES


//    public static int fibonacci(int n){
//        if(n==0 || n==1){
//            return n;
//        }
//        int f1= fibonacci(n-1);
//        int f2= fibonacci(n-2);
//        return f1+f2;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(fibonacci(5));
//    }


    //---------->>>>>>>>>>>>>>>>> TO CHECK THE NUMBER IS SORTED OR NOT


//   public static boolean isSorted(int arr[],int i){
//       if(i==arr.length-1){
//           return true;
//       }
//       if(arr[i]>arr[i+1]){
//           return false;
//       }
//       return isSorted(arr,i+1);
//   }
//
//    public static void main(String[] args) {
//        int arr[]= {1,2,4,3,7};
//        System.out.println(isSorted(arr,0));
//    }



    //-------------->>>>>>>>>>>>>>>>>> FIRST OCCURANCE ELEMENT


//    public static int firstOccu(int arr[],int key,int i){
//        if(i==arr.length){
//            return -1;
//        }
//         if(arr[i]==key){
//             return i;
//         }
//         return firstOccu(arr,key,i+1);
//    }
//
//    public static void main(String[] args) {
//        int arr[]={8,3,6,9,5,10,2,5,3};
//        System.out.println(firstOccu(arr,5,0));
//    }



    //------->>>>>>>>>>>>>>>> SEARCH LAST OCCURANCE ELEMENT


//    public static int lastOcc(int arr[],int key,int i){
//        if(i==arr.length){
//             return -1;
//        }
//        int isFound= lastOcc(arr,key,i+1);
//        if(isFound==-1&& arr[i]==key){
//            return i;
//        }
//        return isFound;
//    }
//
//    public static void main(String[] args) {
//        int arr[]={8,3,6,9,5,10,2,5,3};
//        System.out.println(lastOcc(arr,5,0));
//    }




    // -------->>>>>>>>>>>>>>>>  PRINT X TO THE POWER N

//    public static int power(int x,int n){
//        if(n==0){
//            return 1;
//        }
//        return x* power(x,n-1);
//    }
//
//    public static void main(String[] args) {
//        System.out.println(power(2,10));
//}



//    public static int optimizedPower(int a, int n){
//        if(n==0){
//            return 1;
//        }
//        int halfPowerSqr= optimizedPower(a,n/2)*optimizedPower(a,n/2);
//        if( n%2!=0){
//            halfPowerSqr= a*halfPowerSqr;
//        }
//        return halfPowerSqr;
//
//    }
//
//    public static void main(String[] args) {
//        int a=  2;
//        int n= 6;
//        System.out.println(optimizedPower(a,n));
//    }




    //------------>>>>>>>>>>>>>  TILLING PROBLEM IN FLOOR

//    public static int tillingP(int n){
//        if(n==1|| n==0){
//            return 1;
//        }
//        // kaam
//        int fnm1= tillingP(n-1);     // vertical
//        int  fnm2= tillingP(n-2);     // horizintal
//        int totWay= fnm1+ fnm2;
//        return totWay;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(tillingP(4));
//    }




    //------------------->>>>>>>>>>>>>>>>>>>>>  REMOVE  DUBLICATE STRING

//      public static void removeDublicate(String  Str,int idx,StringBuilder  newStr,boolean map[]){
//          if(idx== Str.length()){
//              System.out.println(newStr);
//              return;
//          }
//          char CurrChar=  Str.charAt(idx);
//          if(map[CurrChar-'a']==true){
//              removeDublicate(Str,idx+1,newStr,map);
//          }else{
//              map[CurrChar-'a']=true;
//              removeDublicate(Str,idx+1,newStr.append(CurrChar),map);
//          }
//
//      }
//
//    public static void main(String[] args) {
//        String Str="sharadpal";
//        removeDublicate(Str,0,new StringBuilder(""),new boolean[25]);
//    }




    //------------------>>>>>>>>>>>>>>>>>Question 2 :

    //You are given a number (eg - 2019), convert it into a String of english like
    //“two zero one nine”. Use a recursive function to solve this problem



    static String digits[] = {"zero", "one", "two", "three", "four", "five", "six",
            "seven", "eight", "nine"};
    public static void printDigits(int number) {
        if(number == 0) {
            return;
        }
        int lastDigit = number%10;
        printDigits(number/10);
        System.out.print(digits[lastDigit]+" ");
    }
    public static void main(String[] args) {
        printDigits(675746567);
        System.out.println();
    }
}