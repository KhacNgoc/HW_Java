/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6.pkg7;

import java.awt.Color;

/**
 *
 * @author Khac Ngoc
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class Week67 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        Diagram diagram= new Diagram(Diagram.WIDTH, Diagram.HEIGHT);
        Layer circleLayer= new Layer(Diagram.WIDTH, Diagram.HEIGHT);
        circleLayer.setBackground(Color.yellow);
        Layer rectangleLayer= new Layer(Diagram.WIDTH, Diagram.HEIGHT);
        rectangleLayer.setOpaque(false);
        
        diagram.addLayer(circleLayer);
        diagram.addLayer(rectangleLayer);
        
        Rectangle r= new Rectangle();
        r.start= new Point(50, 50);
        r.color= Color.red;
        r.length= 50;
        r.width= 30;
        r.point= new Point(ranPoint(), ranPoint());
        
        Circle c= new Circle();
        c.color= Color.LIGHT_GRAY;
        c.radius = 50;
	c.p = new Point(100, 100);
	c.point = new Point(ranPoint(), ranPoint());
        
        Hexagon lg= new Hexagon();
        lg.color= Color.BLACK;
        lg.a= new Point(0, 0);
        lg.b= new Point(50, 0);
        lg.c= new Point(65, 15 );
        lg.d= new Point(80, 30);
        lg.e= new Point(50, 65);
        lg.f= new Point(0, 50);
        lg.point= new Point(ranPoint(), ranPoint());
		
	Circle circle2 = new Circle();
	circle2.color = Color.RED;
	circle2.radius = 50;
	circle2.p = new Point(100, 100);
	circle2.point = new Point(ranPoint(), ranPoint());
	
	Triangle t = new Triangle();
	t.color = Color.pink;
	t.a = new Point(200, 200);
	t.b = new Point(250, 200);
	t.c = new Point(200, 250);
	t.point = new Point(ranPoint(), ranPoint());
		
	rectangleLayer.addShape(r);
	circleLayer.addShape(c);
		
	rectangleLayer.addShape(circle2);
        rectangleLayer.addShape(lg);
        rectangleLayer.setVisible(true);//các hình rectangle không được vẽ trên diagram;
	rectangleLayer.addShape(t);
		
	diagram.moveShapes();
	}
    static Random random= new Random();
    public static int ranPoint()
    {
        return random.nextInt(5);
    }
    
}
class Point {
	int x;
	int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}

