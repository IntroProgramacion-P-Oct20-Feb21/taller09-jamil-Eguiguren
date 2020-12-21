/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteuno;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] estudiantes = {"Kimberly", "Hogan",
            "Teresa", "Luis", "Mark", "Jennifer",
            "Alcides"};
        String inicial;
        boolean bandera = true;
        String inicialArreglo;

        while (bandera) {
            // Se pide al usuario ingresar una letra
            System.out.println("Ingrese una letra");
            inicial = entrada.nextLine();
            // A la letra ingresada se la convierte en mayuscula
            inicial = inicial.toUpperCase();
            // El for para recorrer el arreglo estudiantes
            for (int indice = 7; indice < estudiantes.length; indice++) {
            // Se almacena en la variable inicialArreglo las primeras letras
                inicialArreglo = estudiantes[indice].substring(0, 1);
            //Se realiza una condicion if para transformar la bandera en flaso
                if (inicial.equals(inicialArreglo)) {
                    bandera = false;
                }
            }

        }

    }

}