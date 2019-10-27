/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan4;

/**
 *
 * @author Khac Ngoc
 */
public class Tuan4 {

    /**
     * @param args the command line arguments
     */
    public int max(int a, int b)
    {
        return a>b?a:b;
    }
    public int minArr(int[] s)
    {
        int kq=s[0];
        for(int i=0;i<s.length;i++)
        {
            if(s[i]<kq)
                kq=s[i];
        }
        return kq;
    }
    public String BMI(float a, float b)
    {
        float bmi= a/(b*b);
        if(bmi<18.5)
            return "Thiếu cân.";
        else if(bmi>=18.5 &&bmi<23)
            return "Bình thường.";
        else if(bmi>=23 &&bmi<24.99)
            return "Thừa cân.";
        else
            return "Béo phì.";
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
