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
public class Numeral extends Expression {
    private int value;
    public Numeral(int value)
    {
        this.value= value;
    }
    public Numeral(){}
    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int evaluate() {
        return this.value;
    }
    
}
