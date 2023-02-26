/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a05ex02;

/**
 *
 * @author frfis
 */
public class A05Ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          int[] num = new int[3];
        double[] doub = new double[5];
        String[] str = new String[8];
        
        num[0] = 10;
        num[1] = 20;
        num [2] = 30;
        
        doub[0] = 2.5;
        doub[1] = 3.5;
        doub [2] = 4.5;
        doub [3] = 5.5;
        doub [4] = 6.5;
        
        str[0] = "Pedro";
        str[1] = "João";
        str[2] = "Mércia";
        str[3] = "Laize";
        str [4] = "Felipe";
        str [5] = "Danilo";
        str [6] = "Tomaz";
        str [7] = "Luciana";
        
        for (int i : num) {
            System.out.println("Número inteiro: "+i);
        }
        for (double i: doub){
            System.out.println("Número decimal: "+i);
        }
        for (String i: str){
            System.out.println("Nome: "+i);
        }
    }
    
}
