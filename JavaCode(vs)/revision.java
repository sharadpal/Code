public class revision {
//    public static void evenOd(int n){
//        if((n &1)==0){
//            System.out.println("even num");
//        }
//        else{
//            System.out.println("odd Nu");
//        }
//    }
    public static int minCost(int cost[],int n,int dp[]){

        if(n==0|| n==1){
            return cost[n];
        }
        if(dp[n]!=0){
            return dp[n];
        }
        return dp[n]=minCost(cost,n-1,dp)+minCost(cost,n-2,dp);
    }
    public static void main(String[] args) {
//        evenOd(5);
//        evenOd(6);
        int cost[]= {10,15,30,25,1};
        int n= cost.length;
        int dp[]=new int[n+1];
        System.out.println(minCost(cost,n,dp));


    }
}
