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
public class Rectangle extends Shape{
    protected Point start;
    protected int length, width;
    public void draw(Graphics g) {
        //Graphics2D g2d= (Graphics2D) g;
        g.setColor(color);
        g.fillRect(start.x, start.y, width, length);
    }

    @Override
    public void move() {
        this.start.x+= this.point.x;
        this.start.y+= this.point.y;
        if(this.start.x<=0 || this.start.x+ this.width>=Diagram.WIDTH)
        {
            this.point.x= -this.point.x;
        }
        if(this.start.y<=0 || this.start.y+ this.length>=Diagram.HEIGHT)
        {
            this.point.y= -this.point.y;        }
    }
}
