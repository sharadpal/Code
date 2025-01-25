public class Test_2 {

    private static boolean helper(int piles[],int mid,int h){
        int minH=0;
        for(int p:piles){
            minH+=(p+mid-1)/mid;

        }
        return minH<=h;
    }
    public static int MinEatBa(int piles[],int h){
        int min=1;
        int max=0;
        for(int maxPiles:piles){
            max=Math.max(max,maxPiles);
        }
        while(min<max){
            int mid=(min+max)/2;
            if(helper(piles,mid,h)){
                max=mid;
            }else{
                min=mid+1;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int piles[]={3,6,7,11};
        int h=8;
        System.out.println(MinEatBa(piles,h));
    }

}
