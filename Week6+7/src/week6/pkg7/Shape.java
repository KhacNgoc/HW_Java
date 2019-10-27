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
public abstract class Shape {
    protected Color color;
    protected Point point;
    
    public abstract void draw(Graphics g);
    public abstract void move();
}
