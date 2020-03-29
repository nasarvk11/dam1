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
        
        int resu=0;
        int cont=-1;
        int num;
        Scanner sc= new Scanner(System.in);
        do {
            System.out.println("intoduce los numeros que quieras");
            num=sc.nextInt();

        resu=resu+num;
            cont++;
            
        } while (num!=0);
        System.out.println("la suma es " + resu + "y la media es " + resu/cont);
        
       
        }
    }
    

