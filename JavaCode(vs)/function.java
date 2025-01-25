public class function {
    public static void invarte_routated_half_primid(int n){
        for(int i=1;i<=n;i++){
            // space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void invarte_half_primid_withnumber(int n){
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }


    public static void floyds_Triangle(int n){
        int counter=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }

    }

    public static void zero_one_triange(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void buttor_fly(int n){
        // first half
        for(int i=1;i<=n;i++){
            //star i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //space 2*(n-i)
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //star i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // second half buttor fly
        for(int i=n; i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // space
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void solid_rhombus(int n){
        for(int i=1;i<=n;i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void hollow_rhombus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print("*");
            }
            for(int j=1;j<=n;j++) {
//                if(i == 1 || i == n || j == 1 || j = n) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
            }
        }
            System.out.println();
    }
    public static void diamond(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void numberPyramid(int n){

        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");

            }
            System.out.println();
        }

    }
    public static void pelindromicPetternWithNum(int n){
        // outer loop
        for(int i=1;i<=n;i++){
            // space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // decending
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            // ascending
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }




    public static void main(String[] args) {
//        invarte_routated_half_primid(4);
//        invarte_half_primid_withnumber(5);
//        floyds_Triangle(5);
//        zero_one_triange(5)
//        buttor_fly(5);
//        solid_rhombus(5);
//        hollow_rhombus(5);
//        diamond(5);
//        numberPyramid(5);
        pelindromicPetternWithNum(5);
    }
}
