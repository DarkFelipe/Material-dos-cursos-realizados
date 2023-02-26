/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a05ex04;

import java.util.Arrays;

/**
 *
 * @author frfis
 */
public class A05Ex04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [] a = new String[]{"Cruz das Almes", "Pojuca", "Catu", "Castro Alves", "Muritiba"};
        
        for (String t : a){
            System.out.println(t);
        
        }
        
        String[] b = Arrays.copyOf(a, a.length);
        
        System.out.println("São iguais? "+Arrays.equals(a, b));
        
        Arrays.sort(a);
        for (String b1 : a){
            System.out.println(b1);
        }
        
       String[] c = Arrays.copyOfRange(a,1, 5);
        for (String r : c){
            System.out.println(r);
            
         
        }
            
            
        
    }
    
}
