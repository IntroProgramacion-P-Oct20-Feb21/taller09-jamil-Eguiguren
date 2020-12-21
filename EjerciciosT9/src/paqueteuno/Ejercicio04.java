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
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Se generan los arreglos
        double[] promedios = {10, 10, 9.1, 7, 6.1, 4, 8};
        String[] estudiantes = {"Kimberly Gonzalez", "Mark Hogan", 
            "Teresa Martinez", "Julia Johnson", "Mark Cook", "Jennifer Manning",
            "Juan Vasquez"};
        String[] promediosCualitativos = new String[7];
        double promediosestudiante = 0;
        // Se realizan condiciones de repeticion para poder realizar 
        // los rangos 
        for (int i = 0; i < estudiantes.length; i++){
            promediosestudiante = promedios[i];
            if (promediosestudiante >=0 && promediosestudiante <= 5.9){
                promediosCualitativos[i] = "Regular" ;                 
            }else{
                if (promediosestudiante >=6 && promediosestudiante <= 8.9){
                    promediosCualitativos[i] = "Bueno";
                }else{
                    if (promediosestudiante >=9 && promediosestudiante <= 10){
                        promediosCualitativos[i] = "Sobresaliente";
                    }
                }
            }
        }
        // se realiza un arreglo con una condicion de repeticion 
        // y tambien se realiza la salida para poder presentar todo en pantalla
        for (int i = 0; i < estudiantes.length; i++){
            System.out.printf("%s promedio: %.2f promedio culitativo: %s\n",
                    estudiantes[i],
                    promedios[i],
                    promediosCualitativos[i]);
        }
        
    }

}
