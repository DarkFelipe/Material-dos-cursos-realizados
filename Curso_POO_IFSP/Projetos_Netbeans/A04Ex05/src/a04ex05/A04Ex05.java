/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a04ex05;

/**
 *
 * @author PC
 */
public class A04Ex05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase = "eu gosto de banana";
        System.out.println(frase.length());
        System.out.println(frase.charAt(3));
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
        System.out.println(frase.substring(3,8 ));
        
        String novaFrase = "  " + frase+ " ";
        System.out.println(novaFrase);
        System.out.println(novaFrase.trim());
        System.out.println(frase.replace("banana", "abacaxi"));
        System.out.println(frase.indexOf("b"));

    }

}
