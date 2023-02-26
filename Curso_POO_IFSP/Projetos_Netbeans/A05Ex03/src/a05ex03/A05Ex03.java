/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a05ex03;

/**
 *
 * @author frfis
 */
public class A05Ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [][] times = new String[5][2];
        
        times [0][0] = "Pedro";
        times [0][1] = "Bahia";
        times [1][0] = "Ricardo";
        times [1][1] = "Vitória";
        times [2][0] = "João";
        times [2][1] = "São Paulo";
        times [3][0] = "Ronald";
        times [3][1] = "Cruzeiro";
        times [4][0] = "Albert";
        times [4][1] = "Palmeiras";
        
        for (String [] a : times)
            System.out.println("Nome: " +a[0]+ ", seu time é: "+a[1]);
        
            
    }
    
}
