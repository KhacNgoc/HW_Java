/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5_2;

/**
 *
 * @author Khac Ngoc
 */
class Shape
{
    private String color= "red";
    private boolean filled= true;

    public Shape(){}
    public Shape(String color, boolean filled) {
        this.color= color;
        this.filled= filled;
    }
    String getColor()
    {
        return this.color;
    }
    void setColor(String color)
    {
        this.color=color;
    }
    
    boolean isFilled()
    {
        return this.filled;
    }
    void setFilled(boolean filled)
    {
        this.filled= filled;
    }
    public String toString()
    {
        String kq= "Color: "+this.color+"\nFilled: "+this.filled;
        return kq;
    }
}

class Circle extends Shape
{
    private double radius= 1.0;
    private double PI= 3.14;
    public Circle(){}
    public Circle(double radius){this.radius=radius;};
    public Circle(double radius, String color, boolean filled) {
       super(color, filled);
       this.radius= radius;
    }
    double getRadius()
    {
        return this.radius;
    }
    void setRadius(double radius)
    {
        this.radius= radius;
    }
    double getArea()
    {
        return PI*radius*radius;
    }
    double getPerimeter()
    {
        return 2*PI*radius;
    }
    public String toString()
    {
        String kq= "Radius: "+this.radius+"\nArea: "+this.getArea()+"\nPerimeter: "+this.getPerimeter();
        return kq;
    }
}

class Rectangle extends Shape
{
    private double width= 1.0, length= 1.0;
    public Rectangle(){}
    public Rectangle(double width, double length){
        this.width= width;
        this.length= length;
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width= width;
        this.length=length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }
    double getArea()
    {
        return this.width*this.length;
    }
    double getPerimeter()
    {
        return (this.width+ this.length)*2;
    }
    public String toString()
    {
        String kq= "Width: "+this.width+"\nLength: "+this.length+"\nArea: "+this.getArea()+"\nPerimeter: "+this.getPerimeter();
        return kq;
    }
}

class Square extends Rectangle
{
    public Square(){}
    public Square(double side)
    {
        super(side, side);
    }
    public Square(double side, String color, boolean filled)
    {
        super(side, side, color, filled);
    }
    public void setWidth(double side)
    {
    }
    public void setLeng(double side)
    {
    }
    public String toString()
    {
        String kq= "Side: "+this.getLength()+"\nArea: "+this.getArea()+"\nPerimeter: "+this.getPerimeter();
        return kq;
    }
}
public class Week5_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circle cc= new Circle(3);
        System.out.println(cc.toString());
        System.out.println("__________________");
        Rectangle rtg= new Rectangle(2, 3);
        System.out.println(rtg.toString());
        System.out.println("__________________");
        Square sq= new Square(9);
        System.out.println(sq.toString());
    }
    
}
