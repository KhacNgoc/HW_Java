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
public class Circle extends Shape{
    protected Point p;
    protected int radius;
    public void draw(Graphics g) {
	g.setColor(this.color);
	g.fillOval(this.p.x, this.p.y, this.radius, this.radius);
    }
	
    @Override
    public void move() {		
	this.p.x += this.point.x;
	this.p.y += this.point.y;
		
	if (this.p.x <= 0 || (this.p.x + this.radius) >= Diagram.WIDTH) { // out of horizontal range 
            this.point.x = -this.point.x;
        }
        
        if (this.p.y <= 0 || (this.p.y + this.radius) >= Diagram.HEIGHT) { // out of vertical range
            this.point.y = -this.point.y;
        }
    }
}
