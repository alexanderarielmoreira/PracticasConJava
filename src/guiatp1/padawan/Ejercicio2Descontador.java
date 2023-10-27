package guiatp1.padawan;

import guiatp1.Separadores;

public class Ejercicio2Descontador {

    // El método main es el principal punto de entrada del programa;
    // Java busca este nombre para ejecutar lo que contiene;
    public static void main(String[] args) {

        /*  Consigna:
        Descontador: Se le solicita que guarde un número en un espacio de memoria y
        discretamente dicho número 20 veces sin usar asignación. ¿Que operador podría
        usar para hacerlo?
        * */

        Separadores separador = new Separadores();
        Separadores.separadorCombinado();

        int descontador = 20;

        System.out.println("Valor inicial a decrementar: " + descontador);

        for (int i = 1; i <= 20 ; i++) {

            descontador --;
            System.out.println("Ciclo Nº " + i);
            System.out.println("Valor: " + descontador);
            separador.separadorLinealSimple();

        };

        Separadores.separadorCombinado();

    }

}
