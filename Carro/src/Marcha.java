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
public class Marcha {
    int kminicial, kmfinal, kmrecorridos, vel;
    public void marcha(){
        Scanner teclado = new Scanner(System.in);
        String marcha = "Drive", fin = "no", apagar;
        int kmtotal=0, consumo1 = 0, salir = 1;
        double consumo2 = 0, contador = 0, consumo3 = 0;
        System.out.println("Digitar el Kilometro inicial: ");
        kminicial = teclado.nextInt();
        while("no".equals(fin)){
            System.out.println("¿En que cambio esta el vehiculo? \n Reversa \n Neutra \n Drive");
            marcha = teclado.next();
            if("Drive".equals(marcha)){
                while("no".equals(fin)){
                    System.out.println("¿A que velocidad va?");
                    vel = teclado.nextInt();
                    System.out.println("Cuantos Kilometros a recorrido a esa velocidad");
                    kmrecorridos = teclado.nextInt();
                    if(vel<=60){
                        consumo1 = ((kmrecorridos /60) *15000);
                        
                    }
                    else if (vel>60){
                        consumo2 = (kmrecorridos/60) *(15000*1.15);
                    }
                    System.out.println("¿finalizo el recorrido?");
                    fin = teclado.next();
                    contador = consumo1+consumo2;
                    consumo3 = consumo3 + contador;
                }
            }
            else{
                System.out.println("Poner el carro en Drive para poder avanzar");
            }
        }
        System.out.println("Digitar el Kilometro final");
        kmfinal = teclado.nextInt();
        kmtotal = kmfinal - kminicial;
        System.out.println("Los Kilometros recorridos en total fueron: " + kmtotal);
        System.out.print("El consumo de el viaje fue de: $" + consumo3);
        System.out.println("\n¿Descea apagar el vehiculo?");
        apagar = teclado.next();
        while("si".equals(apagar)){
            System.out.println("¿A que velocidad va?");
            vel = teclado.nextInt();
            if(vel==0){
                System.out.println("¿El vehiculo esta en Parking?");
                marcha= teclado.next();
                if("si".equals(marcha)){
                    System.out.println("Puede apagar el vehiculo");
                    break;
                }
                else{
                    System.out.println("Pära poder apagar el vehiculo debe poner la marcha en Parking");
                }
            }
            else{
                System.out.println("Para poder apagar el vehiculo debe detenerse por completo");
            }
        }
    }
}
