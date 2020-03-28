/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejerciciosjava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
           Scanner sc= new Scanner(System.in);
        System.out.println("introduce su numero");
        int num= sc.nextInt();
        int i;
        do {
            for ( i = num; i > 1; i--) {
                num=num*(i-1);
            }
             System.out.println(num);
        } while (i!=1);
          
    }
    
}
