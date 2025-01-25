import java.util.*;
public class Array_1 {
//    public static int linearSearch(int numbers[],int key){
//        for(int i=0;i<numbers.length;i++){
//            if(numbers[i]==key){
//                return i;
//            }
//        }
//        return -1;
//    }
//    public static void main(String[] args) {
//        int numbers[]= {2,4,5,6,7,8,10,12,15};
//        int key=10;
//        int index= linearSearch(numbers,key);
//        if(index==-1){
//            System.out.println("not found");
//        }
//        else{
//            System.out.println("key is index: "+index);
//        }
//    }

    //-------->>>>>>>>>>>>>>>>>>> LARGEST NUMBER
//    public static int getLargest(int numbers[]){
//        int largest=Integer.MIN_VALUE;
//        for(int i=0;i<numbers.length;i++){
//            if(largest<numbers[i]){
//                largest= numbers[i];
//            }
//        }
//        return largest;
//    }
//
//    public static void main(String[] args) {
//        int numbers[]={1,2,6,3,5};
//        System.out.println(getLargest(numbers));
//    }

    // --->>>>>>>>>>>>> MAX SUBARRAY SUM(PREFIX SUM)
//    public static void maxSubarraySum(int numbers[]){
//        int currSum=0;
//        int maxSum=Integer.MIN_VALUE;
//        int prefix[]=new int[numbers.length];
//        prefix[0]=numbers[0];
//        for(int i=1;i<prefix.length;i++){
//            prefix[i]=prefix[i-1]+numbers[i];
//        }
//        for(int i=0;i<numbers.length;i++){
//            int start=i;
//            for(int j=i;j<numbers.length;j++){
//                int end=j;
//                currSum= start==0 ? prefix[end] : prefix[end]-prefix[start-1];
//                if(maxSum<currSum){
//                    maxSum=currSum;
//                }
//            }
//        }
//        System.out.println(maxSum);
//    }
//
//    public static void main(String[] args) {
//        int numbers[]={1,-2,6,-1,3};
//        maxSubarraySum(numbers);
//    }

    //------------->>>>>>>>>>> SEARCH ELE IN 2 D ARRAY
//    public static boolean search(int matrix[][],int key){
//        for(int i=0;i<matrix.length;i++){
//            for(int j=0;j<matrix[0].length;j++){
//                if(matrix[i][j]==key){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
    // -------->>>>>>>>>>>> PRINT 2-D ARRAY
//    public static void main(String[] args) {
//        int matrix[][]=new int[3][3];
//        int n=matrix.length,m=matrix[0].length;
//        Scanner sc=new Scanner(System.in);
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                matrix[i][j]=sc.nextInt();
//            }
//        }
//        // output print
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                System.out.print(matrix[i][j]+" ");
//            }
//            System.out.println();
//        }
//    }

    //--------->>>>>>>>>>>>> SPIRAL MATRIX
//    public static void printSpiral(int matrix[][]){
//        int startRow=0;
//        int startCol=0;
//        int endRow= matrix.length-1;
//        int endCol= matrix[0].length-1;
//        while(startRow<=endRow && startCol<=endCol){
//            //top
//            for(int j=startCol;j<=endCol;j++){
//                System.out.print(matrix[startRow][j]+" ");
//            }
//            //right
//            for(int i=startRow+1;i<=endRow;i++){
//                System.out.print(matrix[i][endCol]+" ");
//            }
//            //bottom
//            for(int j=endCol-1;j>=startCol;j--){
//                if(startRow==endRow){
//                    break;
//                }
//                System.out.print(matrix[endRow][j]+" ");
//            }
//            //left
//            for(int i=endRow-1;i>=startRow+1;i--){
//                if(startCol==endCol){
//                    break;
//                }
//                System.out.print(matrix[i][startCol]+" ");
//            }
//            startRow++;
//            startCol++;
//            endRow--;
//            endCol--;
//
//        }
//        System.out.println();
//    }
//    public static void main(String[] args) {
//        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//        printSpiral(matrix);
//    }

    //------->>>>>>>>>>>>>>>>>>>>>> DIAGONAL SUM(brued froth approach)
//    public static int diagonalSum(int matrix[][]){
//        int sum=0;
//        for(int i=0;i<matrix.length;i++){
//            for(int j=0;j<matrix[0].length;j++){
//                if(i==j){
//                    sum+=matrix[i][j];
//                }else if(i+j==matrix.length-1){
//                    sum+=matrix[i][j];
//                }
//            }
//        }
//        return sum;
//    }
//
//    //--->>>>  OPTIMAL CODE
//    public static int diagonalSumOptimal(int matrix[][]){
//        int sum=0;
//        for(int i=0;i<matrix.length;i++){
//            // calculate primary diagonal sum
//            sum+=matrix[i][i];
//            // cal secondary diagonal sum
//            if(i !=matrix.length-1-i){
//                sum+=matrix[i][matrix.length-1-i];
//            }
//        }
//        return sum;
//    }
//
//    public static void main(String[] args) {
//        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
////        System.out.println(diagonalSum(matrix));
//        System.out.println(diagonalSumOptimal(matrix));
//    }

    //----------->>>>>>>>>>>>>> SEARCH ELE IN 2D MATRIXC(brued fruth)
    public static boolean searchEle(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    return true;
                }
            }
        }
        return false;
    }
    //----- >>>>>>>>>>>> OPTIMAL SEARCH ELE IN 2D MATRIX
    public static boolean staircaseSearch(int matrix[][],int key){
        int row=0,col=matrix[0].length-1;
        while(row< matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println("found key at ("+row+" ,"+col+")");
                return true;
            }else if(key<matrix[row][col]){
                col--;
            }else{
                row++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int key=667;
//        System.out.println(searchEle(matrix,key));
        System.out.println(staircaseSearch(matrix,key));
    }
}
