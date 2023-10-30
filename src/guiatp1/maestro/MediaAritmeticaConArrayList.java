package guiatp1.maestro;

import guiatp1.Separadores;

import java.util.ArrayList;

public class MediaAritmeticaConArrayList {

    public static void main(String[] args) {
        /* Resolver con ArrayList y ForEach;
        Consigna:
        Escribir un programa en Java que calcule la media aritmética de un conjunto de
        números. Utilizar la fórmula: media = (n1 + n2 + ... + nk) / k, donde n1, n2, ..., nk son
        los números y k es el número total de elementos. Utilicen variables y constantes
        según corresponda. Muestre el resultado por pantalla;
        * */

        // Se crea el ArrayList;
        ArrayList<Integer> listaNumerosEnteros = new ArrayList<>();
        listaNumerosEnteros.add(2);
        listaNumerosEnteros.add(4);
        listaNumerosEnteros.add(6);
        listaNumerosEnteros.add(8);
        listaNumerosEnteros.add(10);
        listaNumerosEnteros.add(12);
        listaNumerosEnteros.add(14);
        listaNumerosEnteros.add(16);
        listaNumerosEnteros.add(18);
        listaNumerosEnteros.add(20);

        Separadores.separadorCombinado();
        // Probando métodos;
        System.out.println("Test .get(): " + listaNumerosEnteros.get(0));
        System.out.println("Test .size(): " + listaNumerosEnteros.size());
        Separadores.separadorCombinado();

        // Se recorre el ArrayList con forEach;
        int acumulador = 0;

        for (Integer elemento: listaNumerosEnteros) {
            System.out.println("Elemento: " + elemento);
            acumulador += elemento;
        };

        Separadores.separadorCombinado();
        System.out.println("Acumulador: " + acumulador);

        Separadores.separadorCombinado();
        double promedio = (double) acumulador / listaNumerosEnteros.size();
        System.out.println("La media aritmética de los elementos contenidos en el ArrayList es: " + promedio);

    };

}
