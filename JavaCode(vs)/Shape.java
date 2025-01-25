 interface Shape {
    int a=4;
    int b=4;
    void getArea();
}
class Rectangle implements Shape {
    @Override
    public void getArea(){
        System.out.println("Rectangle area"+ a*b);
    }
}
class triangle implements Shape{
    @Override
    public void getArea(){
        System.out.println("Triangle area"+(a*b)/2);
    }
}
class Circle implements Shape{
    double redious;
    Circle (double r){
        redious = r;
    }
    @Override
    public void getArea(){
        System.out.println(" Circle area"+ Math.PI*redious*redious);
    }
}