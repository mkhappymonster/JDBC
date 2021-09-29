/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;




public class JavaApplication1 {
static Statement ss;
static String query;
static Connection Con;
    public static void main(String[] args) {
       NewClass C1 = new NewClass();
       try{
       Con=C1.connect();
       ss=Con.createStatement();
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter id : ");
       int  id =sc.nextInt() ;       
       System.out.println("Enter Fname : ");
       String Fname = sc.next();
       System.out.println("Enter Lname : ");
       String Lname = sc.next();
       System.out.println("Enter Salary : ");
       int  Salary =sc.nextInt() ;
       query=
               "INSERT INTO employees VALUES ('"+id+"','"+Fname+"' ,'"+ Lname+"' ,'"+ Salary+"');\n";
              
      
       ss.execute(query);
      System.out.println("MF");
       }catch(Exception ee){
       
       System.out.println(ee.getMessage());
       }
      finally {
       try{
       Con.close();
       ss.close();
       }catch(Exception ee){
       System.out.println(ee.getMessage());
       
       }
       
       }
    }
    }
    
