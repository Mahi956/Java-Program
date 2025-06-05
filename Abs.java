/* Create an abstract class 'Shape' with an abstract method 'area()'. Implement two subclasses
 'Circle' and 'Rectangle'. */

abstract class Shape{
    abstract double Area();
    
}

class Circle extends Shape {
    private double radius;

    public Circle (double radius){
        this.radius=radius;
    }
    double Area(){
        return 3.14 *radius*radius;

    }

}

class Rectangle extends Shape{
    private double length,width;

    public Rectangle(double length,double  width){
        this.length= length;
        this.width=width;
    }
    double Area(){
        return length* width;
       
        
    }

}

public class  Abs {
    public static void main(String[] args) {
        Circle cir =new Circle(5);
        Rectangle rec=new Rectangle(4, 5);
        
        
        cir.Area();
        rec.Area();

        System.out.println("Area of Circle:" +cir.Area());
        System.out.println("Area of Rectangle:"+rec.Area());
    }
    
}
