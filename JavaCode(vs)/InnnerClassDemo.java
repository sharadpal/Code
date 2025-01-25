//class Outer{
//    public void show(){
//        System.out.println("inside outer class");
//    }
//    class Inner{
//        public void print(){
//            System.out.println("inside innner class");
//        }
//    }
//}
//public class InnnerClassDemo {
//    public static void main(String[] args) {
//        Outer obj= new Outer();
//        obj.show();
//        Outer.Inner obj1= new Outer().new Inner();
//        obj1.print();
//    }
//
//}
//
//class InnerClassDemo{
//    int sum(int a,int b){
//        return a+b;
//    }
//    int sum(int a, int b,int c){
//        return a+b+c;
//    }
//    float sum(float a, float b){
//        return a+b;
//    }
//}
//class Pollymorphism{
//    public static void main(String[] args) {
//        InnerClassDemo cal= new InnerClassDemo();
//        System.out.println(cal.sum(1,3));
//        System.out.println(cal.sum(1.3F,3.4F));
//    }
//}

// ------- >>>>>>>>>>>     FINAL KEY
// class InnerClassDemo{
//    public static void main(String[] args) {
//        int a= 5;
//        final int  b= 28;
//        System.out.println(a);
//        a=6;
//        b=43;
//        System.out.println(a);
//        System.out.println(b);
//    }
//}
///------------------>>>>>>>>>> FINAL METHOD


//class A{
////    final void display(){
//     void display(){
//        System.out.println("base class");
//    }
//}
//class B extends A{
//     void display(){
//        System.out.println("Derived class");
//    }
//}
//class Demo {
//    public static void main(String[] args) {
//        B a = new B();
//        a.display();
//    }
//}


//-------->>>>>>>>>>>>>>>>>>> ABSTRACT
//
//import java.util.concurrent.Callable;
//
//abstract class InnerClassDemo{
//    void eat(){
//        System.out.println("animal eat");
//
//
//    }
//}
//class Horses extends InnerClassDemo{
//    void walk(){
//        System.out.println("walks on 4 legs");
//    }
//}
//class Chicken extends InnerClassDemo{
//    void walk(){
//        System.out.println("walks on 2 legs");
//    }
//}
//class Opp{
//    public static void main(String[] args) {
//        Horses s= new Horses();
////        s.eat();
//        s.walk();
//        Chicken c= new Chicken();
//        c.eat();
//        c.walk();
//    }
//}





// ---------->>>>>>>>>>>>>>>> EXCEPTION HANDLNG;

import org.w3c.dom.ls.LSOutput;
//
//class InnnerClassDemo{
//    public static void main(String[] args) {
//        int a=3,b=0,c;
//        try{
//            c=a/b;
//            System.out.println(c);
//        }
//        catch(Throwable e){
//            System.out.println(e);
//        }
//        System.out.println("main method end");
//    }
//}


// ------------>>>>>>>>>>>>>> THROW AND THROWS
//
//class Demo{
//    void div(int a, int b) throws ArithmeticException{
//        if(b==0){
//            throw new ArithmeticException();
//        }
//        else{
//            int c= a/b;
//            System.out.println(c);
//        }
//    }
//    public static void main(String[] args){
//        Demo d= new Demo();
//        d.div(20,0 );
//    }
//}



// --------->>>>>>>>>> FINALLY


//class Main{
//    public static int greety(){
//        try{
//            int a=778;
//            int b= 0;
//            int c= a/b;
//            return c;
//        }
//        catch(java.lang.Exception e){
//            System.out.println(e);
//        }
//        finally {
//            System.out.println("final fun");
//        }
//        return -1;
//    }
//
//    public static void main(String[] args) {
//      int k= greety();
//        System.out.println(k);
//    }
//
//}