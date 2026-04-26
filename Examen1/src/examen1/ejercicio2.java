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
public class ejercicio2 {
    public static void main(String[] args) {
        //variables
        int hora;
        double tarifa;
        double Sueldo;
        double SueldoExtra;
        double total = 0;
        int bono;
       
        Scanner lector = new Scanner(System.in);
        
        System.out.println("INGRESE HORAS : ");
        hora = lector.nextInt();
        System.out.println("INGRESE TARIFA POR HORAS: ");
        tarifa = lector.nextDouble();
        
        if(hora<=40){
            Sueldo = hora * tarifa;
            SueldoExtra = 0;
        }else{
            Sueldo = 40 * tarifa;
            SueldoExtra = (hora - 40) * (tarifa * 1.5);
        }
        
        total = Sueldo + SueldoExtra;
        
        //operador TERNARIO
        
        bono = (Sueldo>1500)?100:0;
        total+=bono;
        
        if(hora>40){
            System.out.printf("SUELDO POR HORAS NORMALES (40h) : S/%.2f\n",Sueldo);
            System.out.printf("SUELDO POR HORAS EXTRAS (%d) :S/%.2f\n",(hora-40),SueldoExtra);
        }else{
            System.out.printf("SUELDO POR HORAS NORMALES (%dh) : S/%.2f\n",hora,Sueldo);
            System.out.printf("SUELDO POR HORAS EXTRAS (0h) :S/%.2f\n",SueldoExtra);
        }
        System.out.printf("BONO D MOVILIDAD APLICADO: S/ %d\n",bono);
        System.out.printf("TOTAL A PAGAR: S/%.2f\n",total);
        
        
        
    }
}
