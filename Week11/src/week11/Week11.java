/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Khac Ngoc
 */
public class Week11 {

    /**
     * @param args the command line arguments
     */
    public static <T extends Comparable<T>> void sort(ArrayList<T> a)
    {
        int x= a.size();
        Collections.sort(a);
    }
    public static <T extends Comparable<T>> T max(ArrayList<T> a)
    {
        T result=a.get(0);
        for(int i=0;i<a.size();i++)
        {
            if(a.get(i).compareTo(result)>0)
            {
                result= a.get(i);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> a= new ArrayList<Integer>();
        a.add(new Integer(1));
        a.add(new Integer(3));
        a.add(new Integer(2));
        a.add(new Integer(5));
        sort(a);
        System.out.println("Chuoi sau khi sap xep: ");
        for(Integer x: a)
        {
            System.out.println(x+" ");
        }
        System.out.println("\n"+"So lon nhat: ");
        System.out.println(max(a));
    }
    
}
