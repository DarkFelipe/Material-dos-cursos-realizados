/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a02t03;

/**
 *
 * @author PC
 */
public class A02t03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x = Double.parseDouble(args [0]); 
        double y = Double.parseDouble (args[1]);
        System.out.println("O resto da divisão é: " +(x%y));
        System.out.println("O produto é: " +(x*y));
        System.out.println("A média é: " +(x+y)/2);
    }
    
}
