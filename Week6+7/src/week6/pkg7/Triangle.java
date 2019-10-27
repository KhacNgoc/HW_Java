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
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class Triangle extends Shape {
    Point a;
    Point b;
    Point c;
	
    @Override
    public void draw(Graphics g) {
	g.setColor(this.color);
	g.fillPolygon(new int[]{ a.x , b.x, c.x },new int[]{ a.y, b.y, c.y },3);
    }
	
    @Override
    public void move() {
	this.a.x += this.point.x;
	this.a.y += this.point.y;
		
	this.b.x += this.point.x;
	this.b.y += this.point.y;
		
	this.c.x += this.point.x;
	this.c.y += this.point.y;
		
	int minX = Math.min(Math.min(this.a.x, this.b.x), this.c.x);
	int minY = Math.min(Math.min(this.a.y, this.b.y), this.c.y);
		
	int maxX = Math.max(Math.max(this.a.x, this.b.x), this.c.x);
	int maxY = Math.max(Math.max(this.a.y, this.b.y), this.c.y);
		
	if (minX <= 0 || maxX >= Diagram.WIDTH) {
            this.point.x = -this.point.x;
	}
		
	if (minY <= 0 || maxY >= Diagram.HEIGHT) {
            this.point.y = -this.point.y;
	}
	}
}
