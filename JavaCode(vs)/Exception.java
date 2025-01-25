public class Exception {
    void checkAge(int age){
        if(age<18){
            throw new ArithmeticException(("not eligible for vote"));
        }
        else{
            System.out.println("elligible for vote ");
        }

    }

    public static void main(String[] args) {
        Exception obj= new Exception();
        obj.checkAge(20);
        System.out.println("end the program");
    }





}
