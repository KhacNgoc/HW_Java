/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author Khac Ngoc
 */
public class Week10 {

    /**
     * @param args the command line arguments
     */
    public static List<String> getAllFunctions(File path) throws FileNotFoundException, IOException
    {
        FileReader fr= new FileReader(path);
        BufferedReader br= new BufferedReader(fr);
        List<String> functions= new ArrayList<String>();
        String line;
        while((line=br.readLine())!= null)
        {
            if(line.contains("static")== true)
            {
                functions.add(line);
            }
        }
        return functions;
    }
    public static String findFunctionByName(String name) throws FileNotFoundException, IOException
    {
        int x1= name.indexOf("(");
        int x2= name.indexOf(",");
        int x3= name.indexOf(")");
        String bh= name.substring(0, x1);
        String index1, index2;
        if(x2==-1)
        {
            index1= name.substring(x1+1, x3);
            index2= null;
        }
        else
        {
            index1= name.substring(x1+1, x2);
            index2= name.substring(x2+1, x3);
        }
        FileReader fr= new FileReader(new File("E:\\Java\\Week9\\src\\week9\\Week9.java"));
        BufferedReader br= new BufferedReader(fr);
        String line;
        while((line=br.readLine())!= null)
        {
            if(line.contains("//"))
            {
                line= line.substring(0, line.indexOf("//"));
            }
            
            int k= line.indexOf("(");
            String ss= line.substring(k+1, line.length());
            if(line.contains(bh) && ss.contains(index1)== true)
            {
                int x= line.indexOf(index1);
                String ss1= line.substring(x, line.length());
                if(ss1.contains(index2)== true)
                {
                    return line;
                }
            }
        }
        return "Not found!!!";
    }
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        File file= new File("E:\\Java\\Week9\\src\\week9\\Week9.java");
        List<String> result= new ArrayList<String>();
        result= getAllFunctions(file);
        System.out.println("Danh sach cac ham: "+"\n");
        for(String a: result)
        {
            System.out.println(a);
        }
        System.out.println("\n"+"Nhap ham can tim kiem: "+"\n");
        System.out.println(findFunctionByName("FilefindFileByName(String,String)"));
    }   
}
