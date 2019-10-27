/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Khac Ngoc
 */
public class Week9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Scanner in= new Scanner(System.in);
        String path;
        System.out.println("Enter the file path: ");
        path= in.nextLine();
        onlyAdd(path);
        readFile(path);
    }
    public static void readFile(String path)
    {
        try {
            File file= new File(path);
            FileReader fr= new FileReader(file);
            BufferedReader br= new BufferedReader(fr);
            String line;
            while((line= br.readLine())!= null)
            {
                System.out.println(line);
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }  
    }
    public static void DeleteAndAddString(String path)
    {
        try {
            Scanner in= new Scanner(System.in);
            File file= new File(path);
            FileWriter fw= new FileWriter(file);
            BufferedWriter pw= new BufferedWriter(fw);
            String add;
            add= in.nextLine();
            pw.write(add);
            pw.close();
            fw.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }          
    }
    public static void onlyAdd(String path)
    {
        //Luu file cu vao arrayList;
        ArrayList<String> oldFile= new ArrayList<>();
        File file= new File(path);
        try {
            FileReader fr= new FileReader(file);
            BufferedReader br= new BufferedReader(fr);
            String line;
            while((line= br.readLine())!= null)
            {
                oldFile.add(line);
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
        //Ghi vao file moi;
        try {
            Scanner in= new Scanner(System.in);
            FileWriter fw= new FileWriter(file);
            BufferedWriter bw= new BufferedWriter(fw);
            PrintWriter pw= new PrintWriter(bw);
            String add;
            System.out.println("Add Words: ");
            add= in.nextLine();
            oldFile.add(add);
            for(String a: oldFile)
            {
                pw.println(a);
            }
            pw.close();
            bw.close();
            fw.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }      
    }
    public static File FilefindFileByName(String folderPath, String FileName)
    {
        File file= new File("folderPath");
        File[] list= file.listFiles();
        if(list== null)
            return null;
        else{
        for(File file1: list)
        {
            if(FileName.equalsIgnoreCase(file1.getName()))
            {
                return file1;
            }
            else
                return FilefindFileByName(file1.getName(), FileName);
        }
        }
        return null;
    }
}
