/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a04ex04;

import java.util.Locale;

/**
 *
 * @author PC
 */
public class A04Ex04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       DecimalFormat cd = new DecimalFormat("#.###");
       DecimalFormat cd = (DecimalFormat)NumberFormat.getNumberInstance(Locale.getDefault());
       double n = (double)1/6;
        System.out.println(n);
        System.out.println(cd.format(n));
    }
    
}
