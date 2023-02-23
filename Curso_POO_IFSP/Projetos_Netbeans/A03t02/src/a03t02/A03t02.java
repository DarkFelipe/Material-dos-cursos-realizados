/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a03t02;

import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class A03t02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Projeto desenvolvido por Felipe Cordeiro César Rodrigues
        System.out.println("Este programa calcula o número de tijolos por m² de parede, sendo necessário 20 tijolos/m²");
        String valor1 = JOptionPane.showInputDialog("Digite a altura da parede em metros: ");
        float altura = Float.parseFloat(valor1);
        JOptionPane.showMessageDialog(null, "Altura digitada: "+altura, "Felipe Rodrigues", 3);
        String valor2 = JOptionPane.showInputDialog("Digite a largura da parede em metros: ");
        float largura = Float.parseFloat(valor2);
        JOptionPane.showMessageDialog(null, "Largura digitada: "+largura, "Felipe Rodrigues", 3);
        double resultado = largura * altura * 20;
        System.out.println("O número de tijolos necessários são: " +resultado+ " tijolos");
    }

}
