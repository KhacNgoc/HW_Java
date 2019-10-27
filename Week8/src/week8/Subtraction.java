/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;

/**
 *
 * @author Khac Ngoc
 */
public class Subtraction extends BinaryExpression{
    public Expression left;
    public Expression right;
    public Subtraction(Expression left, Expression right)
    {
        this.left= left;
        this.right= right;
    }

    @Override
    public Expression left() {
        return left;
    }

    @Override
    public Expression right() {
        return this.right;
    }

    @Override
    public String toString() {
        return this.left.evaluate()+"-"+this.right.evaluate();
    }

    @Override
    public int evaluate() {
        return this.left.evaluate()-this.right.evaluate();
    }
    
}
