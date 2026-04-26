/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1;

/**
 *
 * @author frankz
 */

import java.util.Scanner;
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int hora;
        int minuto;
        int segundo;
        
        System.out.println("ingrese hora: ");
        hora = lector.nextInt();
        System.out.println("Ingrese minuto");
        minuto = lector.nextInt();
        System.out.println("ingrese segubndo ");
        segundo = lector.nextInt();
        
        boolean condicion1 = (hora>=0 && hora<=23&&
                             minuto>= 0 && minuto<=59&&
                             segundo>=0 && segundo<=59);
        
        if(condicion1){
            String hora1 = String.format("%d : %d : %d",hora,minuto,segundo);
            
            segundo++;
            
            if(segundo >= 59){
                segundo = 0;
                minuto ++;
            }
            if(minuto>=59){
                minuto = 0;
                hora ++;
            }
            if(hora >= 23){
                hora = 0;
            }
            System.out.printf("Entrada->%s , SALIDA-> %d : %d : %d ",hora1,hora,minuto,segundo);
        }else{
            System.out.println("INGRESE UN DATO VALIDO");
        }
    }
}
