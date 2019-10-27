package Week82;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;

/**
 *
 * @author Khac Ngoc
 */
public class Week82 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        try {
            Ex1();
        } catch (Exception e) {
            System.out.println("Lỗi Exception 1.");
        }
        try {
            Ex2();
        } catch (Exception e) {
            System.out.println("Lỗi Exception 2.");
        }
        try {
            Ex3();
        } catch (Exception e) {
            System.out.println("Lỗi Exception 3.");
        }
        try {
            Ex4();
        } catch (Exception e) {
            System.out.println("Lỗi Exception 4.");
        }
        try {
            Ex5();
        } catch (Exception e) {
            System.out.println("Lỗi Exception 5.");
        }
        try {
            Ex6();
        } catch (Exception e) {
            System.out.println("Lỗi Exception 6.");
        }
    }
    public static void Ex1() throws NullPointerException
    {
        String x= null;
        System.out.println(x.length());
    }
    public static void Ex2() throws ArrayIndexOutOfBoundsException
    {
        int[] arr= new int[3];
        arr[5]= 10;
    }
    public static void Ex3() throws ArithmeticException
    {
        System.out.println(5/0);
    }
    public static void Ex4() throws ClassCastException
    {
        Object index= "OK";
        int x= (int)index;
        System.out.println(x);
    }
    public static void Ex5() throws IOException 
    {
        try {
            BufferedReader b = new BufferedReader(new FileReader("week8.txt"));
            String Line;
            while ((Line = b.readLine()) != null) {
                System.out.println(Line);
            }
        }catch (IOException e){
            throw new IOException(e.getMessage());
        }
    }

    public static void Ex6() throws FileNotFoundException 
    {
        try {
            BufferedReader b = new BufferedReader(new FileReader("week9.txt"));
        }catch (Exception e){
            throw new FileNotFoundException(e.getMessage());
        }
    }
}
