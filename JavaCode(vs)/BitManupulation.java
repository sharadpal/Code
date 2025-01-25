public class BitManupulation {
//    public static void main(String[] args) {
//        System.out.println(12&56);
//        System.out.println(6^7);
//        System.out.println(~0);
//    }


//    public static void oddOrEven(int  n){
//        int bitMast=1;
//        if((n&bitMast)==0){
//            System.out.println("n is even");
//        }else{
//            System.out.println("number is odd ");
//        }
//    }
//
//    public static void main(String[] args) {
//        oddOrEven(3);
//        oddOrEven(4);
//    }


//    public static int getIthBit(int n, int i){
//        int bitMast=1<<i;
//        if((n&bitMast)==0){
//            return 0;
//        }else{
//            return 1;
//        }
//    }
//
//    public static void main(String[] args) {
//        System.out.println(getIthBit(7,0));
//    }



    public static int setIthBit(int n,int i){
        int bitMast= 1<<i;
        return n |bitMast;
    }
//
//    public static void main(String[] args) {
//        System.out.println(setIthBit(10,2));
//    }





    public static int clearIBit(int n,int i){
        int bitMast=~(1<<i);
        return n&bitMast;
    }
//
//    public static void main(String[] args) {
//        System.out.println(clearIBit(10,1));
//    }



    //--->>> chek a number is     power   OF   TWO OR NOT

     public static boolean isPowerOfTwo(int n){
         return (n&(n-1))==0;
     }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
    }

    //-->>>>>> UPDSATE IthBIT
//    public static int updateIthBit(int n,int i,int newBit){
//        if(newBit==0){
//            return clearIBit(n,i);
//        }else{
//            return setIthBit(n,i);
//        }
//    }
//    public static void main(String[] args){
//        System.out.println(updateIthBit(10,2,1));
//    }

    //--------CLEAR LAST ITH BITS

//    public static int clearIBits(int n,int i){
//        int bitMask=(~0)<<i;
//        return n& bitMask;
//    }
//    public static void main(String[] args) {
//        System.out.println(clearIBits(15,2));
//    }

    //----->>>>>>> CLEAR ITSINRANGE
//    public static int clearIBitsinRange(int n,int i,int j){
//        int a=((~0)<<(j+1));
//        int b=(1<<i)-1;
//        int bitMask=a| b;
//        return n& bitMask;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(clearIBitsinRange(10,2,4));
//    }
}
