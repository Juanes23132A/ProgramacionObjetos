/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author B16-1-0506-06
 */
import java.util.Scanner;
public class Encendido {
    Scanner teclado = new Scanner (System.in);
    String puertas, cinturon, marcha, encendido = "no";
    public void encendido(){
        Scanner teclado = new Scanner (System.in);
        System.out.println("Responder si o no");
        while("no".equals(encendido)){
            System.out.println("¿Estan todas la puertas cerradas?");
            puertas = teclado.next();
            System.out.println("¿Estan todos los cinturones abrochados?");
            cinturon = teclado.next();
            System.out.println("¿El carro esta en la marcha parking?");
            marcha = teclado.next();
            if("si".equals(puertas)){
                if("si".equals(cinturon)){
                    if("si".equals(marcha)){
                        System.out.println("Puede encender el vehiculo");
                        System.out.println("El vehiculo esta listo para encender \n¿Descea encender el vehiculo?");
                        encendido = teclado.next();
                    }
                    else{
                        System.out.println("No se puede encender el vehiculo, poner la marcha en Parking");
                        encendido = "no";
                    }
                }
                else{
                    System.out.println("No se puede encender el vehiculo, abrochar todos los cinturoines");
                    encendido = "no";
                }
            }
            else{
                System.out.println("No se puede encender el vehiculo, cerrar todas las puertas");
                encendido = "no";
            }  
        }
    }
}
