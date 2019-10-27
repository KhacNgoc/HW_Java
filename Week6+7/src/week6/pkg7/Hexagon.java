/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6.pkg7;

/**
 *
 * @author Khac Ngoc
 */
import java.awt.*;
public class Hexagon extends Shape{
    Point a;
    Point b;
    Point c;
    Point d;
    Point e;
    Point f;
	
    public void draw(Graphics g) {
	g.setColor(this.color);
	g.fillPolygon(new int[]{ a.x , b.x, c.x, d.x, e.x, f.x },new int[]{ a.y, b.y, c.y, d.y, e.y, f.y },6);
    }
	
    @Override
    public void move() {
	this.a.x += this.point.x;
	this.a.y += this.point.y;
		
	this.b.x += this.point.x;
	this.b.y += this.point.y;
		
	this.c.x += this.point.x;
	this.c.y += this.point.y;
        
        this.d.x+= this.point.x;
        this.d.y+= this.point.y;
        
        this.e.x+= this.point.x;
        this.e.y+= this.point.y;
        
        this.f.x+= this.point.x;
        this.f.y+= this.point.y;
	
        int index1= Math.min(Math.min(this.c.x, this.d.x), Math.min(this.e.x, this.f.x));
        int index2= Math.min(Math.min(this.c.y, this.d.y), Math.min(this.e.y, this.f.y));
        
	int minX = Math.min(Math.min(this.a.x, this.b.x), index1);
	int minY = Math.min(Math.min(this.a.y, this.b.y), index2);
	
        int index3= Math.max(Math.max(this.c.x, this.d.x), Math.max(this.e.x, this.f.x));
        int index4= Math.max(Math.max(this.c.y, this.d.y), Math.max(this.e.y, this.f.y));
	int maxX = Math.max(Math.max(this.a.x, this.b.x), index3);
	int maxY = Math.max(Math.max(this.a.y, this.b.y), index4);
		
	if (minX <= 0 || maxX >= Diagram.WIDTH) {
            this.point.x = -this.point.x;
	}
		
	if (minY <= 0 || maxY >= Diagram.HEIGHT) {
            this.point.y = -this.point.y;
	}
	}
}
