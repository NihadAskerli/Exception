/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.exception;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Exceptionlesson {

    public static void main(String[] args) {
        Nihadname n= new Nihadname();
        if(n.name==null){
            try{
                throw new MyExceptionNullName("error");
            }catch(Exception ex){
              ex.printStackTrace();
            }
        }
    }
        

    public static void foo() {
        try {
//            Scanner sc = new Scanner(System.in);
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            System.out.println(a / b);
//            int arr[] = {};
//            System.out.println(arr[3]);
//String s= null;
//            System.out.println(s.toString());
        } catch (Exception ex) {
//            ex.printStackTrace();
//            StackTraceElement[] st = ex.getStackTrace();
//            System.out.println(ex.getClass().getName()+":"+ex.getMessage());
//            for(int i=0;i<st.length;i++){
//                StackTraceElement stE=st[i];
//                System.err.println("	at "+stE.getClassName()+"."+stE.getMethodName()+"("+stE.getFileName()+":"+stE.getLineNumber()+")");
//           
//     bu printstacktrace arxada ne edir onu gosterdik   }
//            System.out.println(ex.getClass().getName());
//            System.out.println("xeta bas verdi");
//            xeta bas versede davam edir kod 
        }
    }
}
