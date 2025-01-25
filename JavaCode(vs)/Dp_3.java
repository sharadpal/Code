public class Dp_3 {
    // total number of way to coins change compare to target usng unbounded ( repeate allow of coins)
    public static int coinChainge(int coin[],int sum){
        int n= coin.length;
        int dp[][]= new int[n+1][sum+1];
        // i= coin, j= sum/change
        for(int i=0;i<n+1;i++){
            dp[i][0]=1;
        }
        for(int j=1;j<sum+1;j++){
            dp[0][j]=0;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                if(j>=coin[i-1]){
                    dp[i][j]= dp[i][j-coin[i-1]]+dp[i-1][j];
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][sum];
    }

    public static void print(int dp[][]){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static int rodCutting(int length[],int price[],int totRod){
        int n= price.length;
        int dp[][]= new int[n+1][totRod+1];
        // not compulsarry to use
        for(int i=0;i<n+1;i++){
            for(int j=0;j<totRod+1;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
            }
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<totRod+1;j++){
                if(j>=length[i-1]){
                    dp[i][i]=Math.max(price[i-1]+dp[i][j-length[i-1]],dp[i-1][j]);
                }
                else{
                    dp[i][j]= dp[i-1][j];
                }
            }
        }
        print(dp);
        return dp[n][totRod];
    }

    //------------>>>>>>>>>>>>>>>>>> logest comman subsequence(LCS)
    public static int lcs(String str1,String str2,int n,int m){
        if(n==0 || m==0){
            return 0;
        }
        if (str1.charAt(n - 1) == str2.charAt(m - 1)) {
            return 1+ lcs(str1,str2,n-1,m-1);
        }
        else{
            int ans1= lcs(str1,str2,n-1,m);
            int ans2= lcs(str1,str2,n,m-1);
            return Math.max(ans1,ans2);
        }
    }

    //------>>>>>>>>>>>>> LCS WITH MEMORISEION
    public static int lcsM(String str1,String str2,int n,int m,int dp[][]){
        if(n==0 || m==0){
            return 0;
        }
        if(dp[n][m]!=-1){
            return dp[n][m];
        }
        if (str1.charAt(n - 1) == str2.charAt(m - 1)) {
            return 1+ lcsM(str1,str2,n-1,m-1,dp);
        }
        else{
            int ans1= lcsM(str1,str2,n-1,m,dp);
            int ans2= lcsM(str1,str2,n,m-1,dp);
            return Math.max(ans1,ans2);
        }
    }

    //------>>>>>>>>>>>>> LCS WITH TABULATION KNAPSACK
    public static int lcsTab(String str1,String str2){
        int n= str1.length();
        int m=str2.length();
        int dp[][]=new int[n+1][m+1];
        // not compulsary bydifaut fill all ele with 0;
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
            }
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    int ans1= dp[i-1][j];
                    int ans2= dp[i][j-1];
                    dp[i][j]= Math.max(ans1,ans2);
                }
            }
        }
        return dp[n][m];
    }

    public static void main(String[] args) {
//        int coin[]= {2,5,3,6};
//        int sum=10;
//        System.out.println(coinChainge(coin,sum));

//        int length[]={1,2,3,4,5,6,7,8};
//        int prince[]={1,5,8,9,10,17,17,20};
//        int totRod= 8;
//        System.out.println(rodCutting(length,prince,totRod));

//        String str1= "abcdge";
//        String str2= "abedg";
//        System.out.println(lcs(str1,str2,str1.length(),str2.length()));

//        String str1= "abcdge";
//        String str2= "abedg";
//        int n= str1.length();
//        int m= str2.length();
//        int dp[][]= new int[n+1][m+1];
//        for(int i=0;i<n+1;i++){
//            for(int j=0;j<m+1;j++){
//                dp[i][j]=-1;
//            }
//        }
//        System.out.println(lcsM(str1,str2,str1.length(),str2.length(),dp));

        String str1= "abcdge";
        String str2= "abedg";
        System.out.println(lcsTab(str1,str2));
    }
}
