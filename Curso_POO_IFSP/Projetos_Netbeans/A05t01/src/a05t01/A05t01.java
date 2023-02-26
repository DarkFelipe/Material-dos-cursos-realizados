/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a05t01;

import java.util.Scanner;

/**
 *
 * @author frfis
 */
public class A05t01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ATIVIDADE DE FELIPE CORDEIRO CÉSAR RODRIGUES
        
        int [][] tabuleiro = new int[8][8];
        
        Scanner linha1= new Scanner(System.in);
        System.out.println("Digite a linha que a peça se encontra: ");
        int l1 = linha1.nextInt();
        Scanner coluna1 = new Scanner(System.in);
        System.out.println("Digite a coluna que a peçça se encontra ");
        int c1 = coluna1.nextInt();
      
        
        
        Scanner linha2 = new Scanner (System.in);
        System.out.println("Digite a linha que deseja mover: ");
        int l2 = linha2.nextInt();
        Scanner coluna2 = new Scanner(System.in);
        System.out.println("Digite a coluna que deseja mover");
        int c2 = coluna2.nextInt();
        
        
        System.out.println("A posição inicial é: ["+l1+"]["+c1+"]" );
        System.out.println("A posição final é: ["+l2+"]["+c2+"]");
        
    }
    
}
