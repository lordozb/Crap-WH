/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package intelfix;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author Sanatt Abrol
 */
public class IntelFix {

    /**
     * @param args the command line arguments
     */
    public static boolean check(){
        boolean dekh = false;
        try{
            char c = '"';
            Process p=Runtime.getRuntime().exec("cmd /c cd C:\\ \n devcon64.exe status "+c+"PCI\\VEN_8086&DEV_0A16&SUBSYS_2212103C&REV_0B"+c); 
             
            BufferedReader reader=new BufferedReader(new InputStreamReader(p.getInputStream()));
            String s,a="";  
            while((s=reader.readLine())!=null)
                  a+=s+"\n";
            System.out.println(a);
            if(a.contains("Driver is Running"))
                dekh = true;
            }
        catch(HeadlessException | IOException e){ }
        return dekh;
    }
    public static void main(String[] args) {
        // TODO code application logic here
    if(check())
        System.out.println("\n yes!!");
    try{
            char c = '"';
            Process p=Runtime.getRuntime().exec("cmd /c cd C:\\ \n devcon64.exe status "+c+"PCI\\VEN_8086&DEV_0A16&SUBSYS_2212103C&REV_0B"+c); 
             
            BufferedReader reader=new BufferedReader(new InputStreamReader(p.getInputStream()));
            String s,a="";  
            while((s=reader.readLine())!=null)
                  a+=s+"\n";
            System.out.println(a);
            //if(a.contains("Driver is Running"))
               // dekh = true;
            }
        catch(HeadlessException | IOException e){ }
        
    }
    
}

