import javax.management.MBeanAttributeInfo;
import javax.swing.*;
import java.util.*;

//--->>>>>>>>>>>>> ACTIVITY SELSCTION
public class GreedyApproach {
//    public static void main(String[] args) {
//        int start[]={1,3,0,5,8,5};
//        int end[]={2,4,6,7,9,9};
//        int maxAct=0;
//        ArrayList<Integer> ans= new ArrayList<>();
//        maxAct=1;
//        ans.add(0);
//        int lastEld=end[0];
//        for(int i=1;i<end.length;i++){
//            if(start[i]>=lastEld){
//                maxAct++;
//                ans.add(i);
//                lastEld=end[i];
//            }
//        }
//        System.out.println("max activities=" +maxAct);
//        for(int i=0;i<ans.size();i++){
//            System.out.print("A" + ans.get(i)+" ");
//        }
//        System.out.println();
//    }

    //---------->>>>>>>>>>>>>>> FRACTION KNAPSACK

//    public static void main(String[] args) {
//        int val[]={60,100,120};
//        int weight[]={10,20,30};
//        int w=50;
//
//        double ratio[][]=new double[val.length][2];
//        //   0th col=> idx; 1st col=>ratio
//        for(int i=0;i<val.length;i++){
//            ratio[i][0]=i;
//            ratio[i][1]=val[i]/(double)weight[i];
//        }
//        //Ascending order(lambda functoin)
//        Arrays.sort(ratio,Comparator.comparingDouble(o -> o[1]));
//        int capacity=w;
//        int finalVal=0;
//        for(int i=ratio.length-1;i>=0;i--){
//            int idx=(int)ratio[i][0];
//            if(capacity>=weight[idx]){
//                finalVal+=val[idx];
//                capacity-=weight[idx];
//            }else{
//                //include fractional item
//                finalVal+=(ratio[i][1]* capacity);
//                capacity=0;
//                break;
//            }
//        }
//        System.out.println("final value= " + finalVal);
//    }

    //------->>>>>>>>> MIN SUM ABSOLUTE DIFF
//
//    public static void main(String[] args) {
//        int A[]={1,2,3};
//        int B[]={2,1,3};
//        Arrays.sort(A);
//        Arrays.sort(B);
//        int minDiff=0;
//        for(int i=0;i<A.length;i++){
//            minDiff+=Math.abs(A[i]-B[i]);
//        }
//        System.out.println("min abs diff of pairs ="+minDiff);
//    }

    //--->>>>>>>>> CHOCOLA PROBLEM(SQUARE PEACE)
    public static void main(String[] args) {
        int n=4,m=6;
        Integer costVer[]={2,1,3,1,4};
        Integer costHor[]={4,1,2};

        Arrays.sort(costVer,Collections.reverseOrder());
        Arrays.sort(costHor,Collections.reverseOrder());

        int h=0,v=0;
        int hp=1,vp=1;
        int cost=0;

        while(h<costHor.length && v<costVer.length){
            if(costVer[v]<=costHor[h]){
                cost+=(costHor[h] * vp);
                hp++;
                h++;
            }else{
                cost+=(costVer[v] * hp);
                vp++;
                v++;
            }

        }
        while(h<costHor.length){
            cost+=(costHor[h]*vp);
            hp++;
            h++;
        }
        while(v<costVer.length){
            cost+=(costVer[v] * hp);
            vp++;
            v++;
        }
        System.out.println("min cost of cuts=" + cost);

    }

}