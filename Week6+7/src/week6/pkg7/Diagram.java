/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6.pkg7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

/**
 *
 * @author Khac Ngoc
 */
public class Diagram extends JFrame implements KeyListener{
    static int WIDTH= 600;
    static int HEIGHT= 600;
    private JLayeredPane layeredPane= new JLayeredPane();
    ArrayList<Layer> layers= new ArrayList<>();
    public Diagram(int w, int h)
    {
        this.setPreferredSize(new Dimension(h ,w));
        this.setLayout(new BorderLayout());
        this.add(layeredPane, BorderLayout.CENTER);
        this.layeredPane.setBounds(0, 0, w, h);
        this.addKeyListener(this);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        if(ke.getKeyChar()=='r')
        {
            this.removeCircles();
        }
    }
    public void removeCircles()
    {
        for(Layer layer: layers)
        {
            layer.removeCircle();
        }
    }
    public void moveShapes() throws InterruptedException
    {
        while(true)
        {
            for(Layer layer: layers)
            {
                layer.moveShapes();
            }
            Thread.sleep(20);
            }
     }

    @Override
    public void keyPressed(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private static int layerIndex= 0;
    public void addLayer(Layer layer)
    {
        this.layers.add(layer);
        this.layeredPane.add(layer, layerIndex++, 0);
    }
}
