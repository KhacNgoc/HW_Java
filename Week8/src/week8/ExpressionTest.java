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
public class ExpressionTest {
    public static void main(String[] args)
    {
        try{
        Square index1 = new Square(new Numeral(10));
        
        Multiplication index2 = new Multiplication(index1, new Numeral(10));//nhân
        
        Subtraction index3 = new Subtraction(index2, new Numeral(1));//10*10-1
        
        Multiplication index4 = new Multiplication(new Numeral(2), new Numeral(3));
        
        Addition index5 = new Addition(index3, index4);
        
        Multiplication index6 = new Multiplication(index5, index5);
        System.out.println(index6.evaluate());
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
    }

}
