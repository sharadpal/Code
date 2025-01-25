public class Dp_2 {
    // --->>>>>>>> 0/1 KNAPSACK   RECURSIVE
    public static int knapsack(int val[], int wt[], int W,int n){
        if(W==0 || n==0){
            return 0;
        }
        if(wt[n-1]<=W){  // valid
            // include
            int ans1=val[n-1]+knapsack(val,wt, W-wt[n-1],n-1);
            // exclude
            int ans2= knapsack(val,wt,W,n-1);
            return Math.max(ans1,ans2);
        }
        else{   // not valid
            return knapsack(val,wt,W,n-1);

        }
    }

    // -------------->>>>>>>>> USING MEMORIZATIONS
    public static int knapsack(int val[], int wt[],int W, int n,int dp[][]){
        if(W==0 || n==0){
            return 0;
        }
        if(dp[n][W]!=-1){
            return dp[n][W];
        }
        if(wt[n-1]<=W){
            // include(valid)
            int ans1= val[n-1]+ knapsack(val,wt,W-wt[n-1],n-1,dp);
            // exclude
            int ans2= knapsack(val,wt,W,n-1,dp);
            dp[n][W]=Math.max(ans1,ans2);
            return dp[n][W];
        }
        else{
            dp[n][W]= knapsack(val,wt,W,n-1,dp);
            return dp[n][W];
        }
    }
    //---------------->>>>>>> TABULATION METHOD ( BUTTOM UP)
    public static void print(int dp[][]){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static int knapsackTab(int val[],int wt[],int W){
        int n= val.length;
        int dp[][]=new int[n+1][W+1];

        for(int i=0;i<dp.length;i++){    // 0'th colom
            dp[i][0]=0;
        }
        for(int j=0;j<dp[0].length;j++){  // 0'th row
            dp[0][j]=0;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<W+1;j++){
                if(wt[i-1]<=j){    // valid
                    int incProfit= val[i-1]+dp[i-1][j-wt[i-1]];
                    int exProfit= dp[i-1][j];
                    dp[i][j]=Math.max(incProfit,exProfit);
                }
                else{   // invalid
                    dp[i][j]= dp[i-1][j];
                }
            }
        }
        print(dp);    // extra - we see the 2d table only
        return dp[n][W];
    }

    //-------------->>>>>>>>>>>>>>>>>>>>>>> TARGET SUM SET
    public static void print(boolean dp[][]){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static boolean targgetSubSets(int arr[],int sum){
        int n= arr.length;
        boolean dp[][]= new boolean[n+1][sum+1];
        // i= itens & j= target sum
        for(int i=0;i<n+1;i++){
            dp[i][0]=true;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                int v= arr[i-1];
                if(v<=j && dp[i-1][j-v]==true){
                    dp[i][j]=true;
                }
                else if(dp[i-1][j]==true){
                    dp[i][j]=true;
                }
            }
        }
        print(dp);
        return dp[n][sum];
    }

    //--------------------->>>>>>>>>>>>>>>>>>>> UNBOUNDED KNAPSACK
    public static int unbKnapSack(int val[],int wt[],int W){
        int n= val.length;
        int dp[][]= new int[n+1][W+1];
        // not neccesarry to fil the first row,column in 0 , by difault fill it with 0 in  java
        for(int i=0;i<n+1;i++){
            dp[i][0]=0;
        }
        for(int j=0;j<W+1;j++){
            dp[0][j]=0;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<W+1;j++){
                if(j>=wt[i-1]){
                    dp[i][j]= Math.max(val[i-1]+dp[i][j-wt[i-1]] ,dp[i-1][j]);
                }
                else{
                    dp[i][j]= dp[i-1][j];
                }
            }
        }
        print(dp);
        return dp[n][W];
    }

    public static void main(String[] args) {
        int val[]= {10,30,45,55};
        int wt[]= {1,2,3,4};
        int W= 4;
//        System.out.println(knapsack(val,wt,W,val.length));

//        int dp[][]= new int[val.length+1][W+1];
//        for(int i=0;i<dp.length;i++){
//            for(int j=0;j<dp[0].length;j++){
//                dp[i][j]=-1;
//            }
//        }
//        System.out.println(knapsack(val,wt,W,val.length,dp));

//        int dp[][]= new int[val.length+1][W+1];
//        System.out.println(knapsackTab(val,wt,W));

//        int arr[]= {4,2,7,1,3};
//        int sum= 14;
//        System.out.println(targgetSubSets(arr,sum));

        System.out.println(unbKnapSack(val,wt,W));
    }
}
