import javax.swing.*;
//
//class Bank {
//    public String userName;
//    private String passWord;
//    public void setPassword(String pwd){
//        passWord= pwd;
//    }
//}
//public class OOPS{
//    public static void main(String[] args) {
//        Bank purvanchal= new Bank();
//        purvanchal.userName= "sharadpal";
//        purvanchal.setPassword("asshdhdc");
//
//
//    }
//}


//---->>>>>>>>>>>>>>  GETTER, SETTER METHOD

//class Bank{
//    private String color;
//    private String tip;
//    String getColor(){
//        return this.color;
//    }
//    String getTip(){
//        return this.tip;
//    }
//    void  setColor(String newColor ){
//        this.color= newColor;
//    }
//    void setTip(String tip){
//        this.tip= tip;
//    }
//}
//class OOPS {
//
//    public static void main(String[] args) {
//        Bank thor= new Bank();
//      thor.setColor("white");
//        System.out.println(thor.getColor());
//        thor.setTip("5");
//        System.out.println(thor.getTip());
//    }
//}

//--------------->>>>>>>>>>>>>>>>>>>>INHERITANCE


//class Animals{
//    String color;
//    void eat(){
//        System.out.println("eats");
//    }
//    void brethe(){
//        System.out.println("brethe");
//    }
//}
//class Fish extends Animals{
//    int fins;
//    void swim(){
//        System.out.println("swim in water");
//    }
//}
//class OOPS{
//    public static void main(String[] args) {
//        Fish shark= new Fish();
//        shark.swim();
//    }
//}


// -------->>>>>>>>>>>>>>>> MULTI LEVEL  INHERITANCE


//class Animals{
//    String color;
//    void eat(){
//        System.out.println("eats");
//    }
//    void brethe(){
//        System.out.println("brethe");
//    }
//
//}
//class mammal extends Animals{
//    int leg;
//}
//class monkey extends mammal{
//    String bread;
//}
//class OOPS{
//    public static void main(String[] args) {
//        monkey man= new monkey();
//        man.eat();
//        man.leg=4;
//        System.out.println(man.leg);
//    }
//}


///-------------------><>>>>>>>>>>>>>>>>>>> METHOD OVERLOADING


//class calculator{
//    int sum(int a, int b){
//        return  a+b;
//    }
//    int sum(int a,int b,int c){
//        return a+b+c;
//
//    }
//    float sum(float a, float b){
//        return  a+b;
//    }
//}
//class OOPS{
//    public static void main(String[] args) {
//        calculator cal= new calculator();
//        System.out.println(cal.sum(1,2));
//        System.out.println(cal.sum(1.4f,1.5f));
//    }
//}


// ---------------->>>>>>>>>>>>>>>>>>> OVERRIDING


//class Animal{
//    void eat(){
//        System.out.println("eat anything");
//    }
//}
//class Deer extends Animal{
//    void eat(){
//        System.out.println("eat grass");
//    }
//}
//class OOPS{
//    public static void main(String[] args) {
//        Deer d= new Deer();
//        d.eat();
//
//    }
//}


//------->>>>>>>>>>>>>>> ABSTRACT

// abstract class Animal{
////     void eat(){
//         System.out.println("animal eats");
//     }
//     abstract void walk();
// }
// class Horse extends Animal{
//     void walk(){
//         System.out.println("waks 4 legs");
//     }
// }
// class Chicken extends Animal{
//     void walk(){
//         System.out.println("walk of 2 legs");
//     }
// }
// class OOPS{
//     public static void main(String[] args) {
//         Horse h= new Horse();
//         h.eat();
//         h.walk();
//         Chicken c= new Chicken();
//         c.eat();
//         c.walk();
//     }
// }




//------------------------->>>>>>>>>>>>>>>>>>>>>>>> SUPER KEYWORD

// class Animal{
//     String color;
//     Animal(){
//         System.out.println("animal constructor is called");
//     }
// }
// class Horse extends Animal{
//     Horse(){
//         super.color= "brown";
//         System.out.println("Horse constructor is called");
//     }
// }
// class OOPS{
//     public static void main(String[] args) {
//        Horse h= new Horse();
//         System.out.println(h.color);
//     }
// }