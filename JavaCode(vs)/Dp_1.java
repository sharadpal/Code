import java.util.Arrays;

public class Dp_1 {
    // fabonacci number
    public static int fabTabular(int n,int dp[]){
        if(n==0 || n==1){
            return n;
        }
        while(dp[n]!=0){
            return dp[n];
        }
        dp[n]= fabTabular(n-1,dp)+fabTabular(n-2,dp);
        return dp[n];
    }

    //-------------->>>>>>>>>>>>>>>>>>  (recursive)CLIMBING STAIR TOTAL WAY (JUMP ONLY 1,2 STAIR AT A TIME )
    public static int findWay(int n){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        return findWay(n-1)+findWay(n-2);
    }

    /// ---------->>>>>>>>>>>>>> memorization using recursive
    public static int findWayM(int n, int []way){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(way[n]!=-1){     // already calculated
            return way[n];
        }
        way[n]=findWayM(n-1,way)+findWayM(n-2,way);
        return way[n];
    }
    public static void main(String[] args) {
//        int n=5;
//        int dp[]= new int[n+1];
//        System.out.println(fabTabular(n,dp));
//        int n=5;     // 3 way+ 4 way= 3+5=8 output
//        System.out.println(findWay(n));

        int n= 5;
        int way[]= new int[n+1];
        Arrays.fill(way,-1);
        System.out.println(findWayM(n,way));
    }
}
