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
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double pi = 3.14;
        double lado,radio,base,altura;
        double total = 0;
        System.out.println("MENU D OPCIONES");
        System.out.println("1. AREA D CIRCULO");
        System.out.println("2. AREA D CUADRADO");
        System.out.println("3. AREA D TRIANGULO ");
        System.out.println("4.AREA D RECTANGULO ");
        int opc = lector.nextInt();
        
        String resultado = switch(opc){
            case 1->{
                System.out.println("INGRESE RADIO: ");
                radio = lector.nextDouble();
                total = pi * (Math.pow(radio,2));
                yield String.format("EL AREA DEL CIRCULO ES : %.2f ",total);
            }
            case 2->{
                System.out.println("INGRESE LADO: ");
                lado = lector.nextDouble();
                total = Math.pow(lado,2);
                yield String.format("EL AREA DEL CUADRADO ES : %.2f ",total);
            }
            case 3->{
                System.out.println("INGRESE BASE: ");
                base = lector.nextDouble();
                System.out.println("INGRESE ALTURA: ");
                altura = lector.nextDouble();
                total = (base * altura) / 2;
                yield String.format("EL AREA DEL TRIANGULO ES: %.2f ",total);
            }
            case 4->{
                System.out.println("INGRESE BASE: ");
                base = lector.nextDouble();
                System.out.println("INGRESE ALTURA: ");
                altura = lector.nextDouble();
                total = (base * altura);
                yield String.format("EL AREA DEL RECTANGULO ES : %.2f ",total);          
            }
            default->
                "figura invalida";
        };
        System.out.printf(resultado);
    }
}
