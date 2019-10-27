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
public class Layer extends JPanel{
    ArrayList<Shape> shapes= new ArrayList<>();
    ArrayList<Shape> triangles= new ArrayList<>();
    ArrayList<Shape> circles= new ArrayList<>();
    public Layer(int w, int h)
    {
        this.setBounds(0, 0, w, h);
    }
    public void moveShapes()
    {
        for(Shape shape: shapes)
        {
            shape.move();
        }
        this.repaint();
    }
    public void removeTriangles()
    {
        for(int i=shapes.size()-1;i>=0;i--)
        {
            if(shapes.get(i) instanceof Rectangle)
            {
                triangles.add(shapes.get(i));
                shapes.remove(i);
            }
        }
    }
    public void removeCircle()
    {
        for(int i=shapes.size()-1;i>=0;i--)
        {
            if(shapes.get(i) instanceof Circle)
            {
//                circles.add(shapes.get(i));
                shapes.remove(i);
            }
        }
    }
    //vẽ từng hình trong arrayList ra ngoài màn hình
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        for(Shape s: shapes)
        {
            s.draw(g);
        }
    }
    // phương thức thêm hình vào arrayList
    public void addShape(Shape s)
    {
        this.shapes.add(s);
    }
}
