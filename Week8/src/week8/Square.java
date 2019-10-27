/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;

import com.sun.javafx.applet.ExperimentalExtensions;

/**
 *
 * @author Khac Ngoc
 */
public class Square extends Expression{
    private Expression expression;
    public Square(Expression expression)
    {
        this.expression= expression;
    }

    @Override
    public String toString() {
        return this.expression.toString();
    }

    @Override
    public int evaluate() {
        return this.expression.evaluate();
    }
}
