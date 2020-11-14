/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Operacion {
    int num1, num2, res;
    Scanner tecla = new Scanner(System.in);
    public void Resta (){
        System.out.println("Ingrese el primer número: ");
        num1 = Integer.valueOf(tecla.nextLine());
        System.out.println("Ingrese el segundo número: ");
        num2 = Integer.valueOf(tecla.nextLine());
        res = num1 - num2;
        System.out.print("Respuesta: " + res);
    }
}
