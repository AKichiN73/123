package Shape;
import java.lang.*;
public class Circle extends Shape {
    protected double radius;
    public Circle(){
        this.filled=false;
        this.Color="red";
        radius=2;
    }

    public Circle(double radius){
        this.filled=false;
        this.Color="red";
        this.radius=radius;
    }
    public Circle(double radius, String Color, boolean filled){
        this.radius=radius;
        this.Color=Color;
        this.filled=filled;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPeriod() {
        return Math.PI*2*radius;
    }
    @Override
    public String toString(){
        return "Shape: circle, radius:"+this.radius+", color: "+this.Color;
    }
}
