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
public class carro {
    public static void main(String[] args) {
        Encendido encendido = new Encendido();
        Marcha marcha = new Marcha();
        encendido.encendido();
        if("si".equals(encendido.encendido)){
            marcha.marcha();
        }
    }
}

