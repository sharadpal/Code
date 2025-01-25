import java.util.*;
public class Strings {
    public static void main(String[] args) {
        String r= "Tony";
        String r1= "Tony";
        String r2=new String("Tony");
        System.out.println(r2);
    }
//
//    //-------->>>>>>>>>>>>> STRING BUILDER
//
//    public static void main(String[] args) {
//       StringBuilder sb= new StringBuilder("");
//       for(char ch='a';ch<'z';ch++){
//           sb.append(ch);
//       }
//        System.out.println(sb);
//    }


//----------------->>>>>>>>>>>>>>>>>>>>  LARGEST STRING

//    public static void main(String[] args) {
//        String fruits[]= {"apple","mango","banana"};
//        String largest= fruits[0];
//        for(int i=1;i<fruits.length;i++){
//            if(largest.compareTo(fruits[i])<0){
//                largest=fruits[i];
//            }
//        }
//        System.out.println(largest);
//    }
    // ------>>>>>>>>>>>>>>>>>>>>PALINDROM;
//    public static boolean isPalindrom(String str){
//        for(int i=0;i<str.length()/2;i++){
//            int n= str.length();
//            if(str.charAt(i)!=str.charAt(n-i-1)){
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//        String str= "noon";
//        System.out.println(isPalindrom(str));
//    }
//     public static void printMethod(String str1){
//        for(int i=0;i<str1.length();i++){
//            System.out.print(str1.charAt(i)+ " ");
//        }
//         System.out.println();
//    }
//    public static void main(String[] args) {

//        String a= "abcdef";
//        String b= new String("xyz");
//        Scanner sc= new Scanner(System.in);
//        String name= sc.nextLine();
//        System.out.println(name);

//        String firstName= "sharad";
//        String lastName= "Kumar";
//        String fullName=firstName+" "+ lastName;

//        System.out.println(fullName.charAt(1));
//        String str1= "sharad";
//        printMethod(str1);
//    }

}
