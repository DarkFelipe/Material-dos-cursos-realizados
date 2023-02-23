/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a03ex02;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class A03Ex02 {


    public static void main(String[] args) {
        try {
            System.out.println("Digite a nota: ");
            Scanner x = new Scanner(System.in);
            float nota = x.nextFloat();
            System.out.println("nota digitada: " +nota);
        }
        catch (Exception e){
            System.out.println("houve um erro. Digite apenas números!");
        }      
    } 
}
