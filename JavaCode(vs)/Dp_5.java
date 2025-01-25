import java.util.*;
public class Dp_5 {
    //----------->>>>>>>>>>>>>> WILDCARD MATCHING
    public static boolean isMatch(String s,String p){
        int n= s.length();
        int m=p.length();
        boolean dp[][]=new boolean[n+1][m+1];
        dp[0][0]=true;
        for(int i=1;i<n+1;i++){
            dp[i][0]=false;
        }
        for(int j=1;j<m+1;j++){
            if(p.charAt(j-1)=='*'){
                dp[0][j]=dp[0][j-1];
            }
        }
        //bottom uup
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                // case- ith char==jth char || jth char==?
                if(s.charAt(i-1)==p.charAt(j-1) || p.charAt(j-1)=='?'){
                    dp[i][j]=dp[i-1][j-1];
                }else if(p.charAt(j-1)=='*'){
                    dp[i][j]=dp[i-1][j]|| dp[i][j-1];
                }
                else{
                    dp[i][j]=false;
                }
            }
        }
        return dp[n][m];
    }

    //----------->>>>>>>>>>>>>>>>>>>>>> CATALAN  using reecursion
    public static int catalanRec(int n){
        if(n==0 || n==1){
            return 1;
        }
        int ans=0;
        for(int i=0;i<n;i++){
            ans+=catalanRec(i)*catalanRec(n-1-i);
        }
        return ans;
    }
    //-------->>>>>>>>>>>>>>> CATALAN using memorieszation
    public static int catalanMem(int n,int dp[]){
        if(n==0|| n==1){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int ans=0;
        for(int i=0;i<n;i++){
            ans+=catalanMem(i,dp)*catalanMem(n-i-1,dp);
        }
        return ans;
    }

    //---------->>>>>>>>>>>>>>>>>>>>>>>>> CATALAN NU USING TABULATION APPROACH
    public static int catalanTab(int n){
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<n+1;i++){
            for(int j=0;j<i;j++){
                dp[i] +=dp[j]*dp[i-j-1];
            }
        }
        return dp[n];
    }

    //---------->>>>>>>>>>>>>>>>>>>>> MAOUNTAIN RANGE( same as catlan num)
    public static int mountainRange(int n){
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<n+1;i++){
            for(int j=0;j<i;j++){
                // dp[i]+=dp[j]*dp[i-j-1];
                int left=dp[j];
                int right=dp[i-j-1];

                dp[i]+=left*right;
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
//        String s= "baaabab";
//        String p= "*****ba*****b";
//        System.out.println(isMatch(s,p));

//        int n=5;
//        System.out.println(catalanRec(n));

//        int n=5;
//        int dp[]=new int[n+1];
//        Arrays.fill(dp,-1);
//        System.out.println(catalanMem(n,dp));

//        int n=5;
//        System.out.println(catalanTab(n));

        int n=5;
        System.out.println(mountainRange(n));
    }
}
