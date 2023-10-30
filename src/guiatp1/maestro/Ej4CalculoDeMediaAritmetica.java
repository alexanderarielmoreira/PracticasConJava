package guiatp1.maestro;

import guiatp1.Separadores;

public class Ej4CalculoDeMediaAritmetica {

    public static void main(String[] args) {

        /* Resolver este ejercicio implementando un Array y un ArrayList;
           Consigna:
           Cálculo de la media aritmética:
           Escribir un programa en Java que calcule la media aritmética de un conjunto de
           números. Utilizar la fórmula: media = (n1 + n2 + ... + nk) / k, donde n1, n2, ..., nk son
           los números y k es el número total de elementos. Utilicen variables y constantes
           según corresponda. Muestre el resultado por pantalla.
        * */

        //         Solución con un Array;
        //         Posiciones:          0  1  2  3   4   5   6   7   8   9;
        int[] arrayDeNumerosEnteros = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };

        int acumulador = 0;
        double promedio;

        for (int i = 0; i < arrayDeNumerosEnteros.length ; i++) {

            acumulador += arrayDeNumerosEnteros[i];
            System.out.println("Posición: " + i + "; Elemento: " + arrayDeNumerosEnteros[i]);
        };
        Separadores.separadorCombinado();
        System.out.println("Valor del acumulador: " + acumulador);

        promedio = (double) acumulador / arrayDeNumerosEnteros.length;
        Separadores.separadorCombinado();
        System.out.println("El promedio resultante es de: " + promedio);

    };
};
