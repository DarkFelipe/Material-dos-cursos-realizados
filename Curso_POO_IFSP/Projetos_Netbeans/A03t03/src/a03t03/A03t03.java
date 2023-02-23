/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a03t03;

import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class A03t03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Projeto desenvolvido por Felipe Cordeiro César Rodrigues
        String valor1 = JOptionPane.showInputDialog("Digite a altura da parede em metros: ");
        float altura = Float.parseFloat(valor1);
                
        if (altura < 3){
            JOptionPane.showMessageDialog(null,"A altura de " +altura+ " metros da parede é baixa", "Felipe Rodrigues",3);
        }
        else if (altura>=3 && altura<=3.5){
            JOptionPane.showMessageDialog(null,"A altura de " +altura+ " metros da parede é média", "Felipe Rodrigues",3);
        }
        else {
            JOptionPane.showMessageDialog(null, "A altura de " +altura+ " metros da parede é alta", "Felipe Rodrigues",3);
        }
    }
}





 