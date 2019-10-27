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
public class Addition extends BinaryExpression{

    public Expression left;
    public Expression right;
    
    public Addition(Expression left, Expression right)
    {
        this.left= left;
        this.right= right;
    }
    
    @Override
    public Expression left() {
        return this.left;
    }

    @Override
    public Expression right() {
        return this.right;
    }

    @Override
    public String toString() {
        String kq= this.left.evaluate()+"+"+this.right.evaluate();
        return kq;
    }

    @Override
    public int evaluate() {
        return this.left.evaluate()+this.right.evaluate();
    }  
}
