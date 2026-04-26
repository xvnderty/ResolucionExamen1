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
        int hora;
        int minuto;
        int segundo;
        
        Scanner lector = new Scanner(System.in);
        
        System.out.println("INGRESE HORAS: ");
        hora = lector.nextInt();
        System.out.println("INGRESE MINUTOS : ");
        minuto = lector.nextInt();
        System.out.println("INGRESE SEGUNDOS:");
        segundo = lector.nextInt();
        
        boolean condicion1 = (hora>=0 && hora<=24 && minuto>=0&&minuto<=59&&segundo>=0&&segundo<=59);
        
        if(condicion1){
            String horaInicial = String.format("ENTRADA: %d : %d : %d",hora,minuto,segundo);
            
            segundo++;
            if(segundo>=59){
                segundo = 0;
                minuto ++;
            }
            if (minuto >= 59){
                minuto = 0;
                hora++;
            }
            if(hora >=23){
                hora =0;
            }
            
            System.out.printf("%s -> Salida : %d:%d:%d",horaInicial,hora,minuto,segundo);
        }else{
            System.out.println("INGRESE UN DATO VALIDO");
        }
        
    }
}
