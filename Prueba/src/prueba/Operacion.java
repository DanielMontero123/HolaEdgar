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

    public void Suma() {
        Scanner tecla = new Scanner(System.in);
        int num1, num2, resp;
        System.out.println("Ingresar numero 1 : ");
        num1 = tecla.nextInt();
        System.out.println("Ingrse numero 2 : ");
        num2 = tecla.nextInt();
        resp = num1 + num2;
        System.out.println("Resulatdo : " + resp);

    }
}
