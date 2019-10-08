/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_4;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Boletin2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner bi= new Scanner(System.in);
        System.out.print("Teclea o diñeiro total que posee:" );
        int total = bi.nextInt();
        int w,x,y,z;
        w=total/100;
        x=total/20;
        y=total/5;
        z=total/1;
        System.out.println("En billetes de 100€ son: "+(w)+"\nEn billete de 20€ son: "+(x)+"\nEn billetes de 5€ son: "+(y)+"\nEn moedas de 1€ son: "+(z));
    }
    
}
