/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteuno;

/**
 *
 * @author reroes
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        int elementosArribaMedia = 0;
        int elementosAbajoMedia = 0;
        double media;
        double suma = 0;
        int contador;
        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + arreglo[i]; // se sumara todas las variables del arreglo
        }
        media = suma / arreglo.length; // luego de sumar todas las variables se dividiran para el numero de las mismas
        for (int i = 0; i < arreglo.length; i++) { //
            contador = arreglo[i];
            if (contador > media) {
                elementosArribaMedia = elementosArribaMedia + 1;

            } else {
                if (contador < media) {
                    elementosAbajoMedia = elementosAbajoMedia + 1;
                }
            }

        }
        System.out.printf("La media es %.2f\nLos elementos arriba de la media "
                + "son: %d\nLos elementos abajo de la media son: %d\n", media,
                 elementosArribaMedia,
                 elementosAbajoMedia);
    }

}
