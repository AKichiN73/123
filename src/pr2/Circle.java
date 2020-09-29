package pr2;
import java.lang.*;
public class Circle extends Shape{
    protected double radius;
    public Circle(){}
    public Circle(double radius, String color, boolean filled){
        this.radius=radius;
        this.color=color;
        this.filled=filled;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }

    @Override
    public double getArea() {
        return Math.PI*this.radius*this.radius;
    }

    @Override
    public double getPerimetr() {
        return 2*Math.PI*this.radius;
    }
    @Override
    public String toString(){
        return"area of circle is "+getArea()+", perimetr is "+getPerimetr();
    }
}
