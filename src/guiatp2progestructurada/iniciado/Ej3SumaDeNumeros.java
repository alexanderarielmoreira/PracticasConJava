package guiatp2progestructurada.iniciado;

import guiatp2progestructurada.SeparadoresTP2;

import java.util.Scanner;

public class Ej3SumaDeNumeros {

    public static void main(String[] args) {

        /* Consigna:
        Suma de números : Realizar un programa que guarde un número en memoria y
        determine si es par o impar;
        * */

        SeparadoresTP2.separadorCombinado();
        System.out.println("Bienvenido al Sistema para determinar si un número entero es par o impar\n" +
                            "Ingrese un número entero:");

        Scanner scanner = new Scanner(System.in);
        int dataEntryUser = scanner.nextInt();

        if(dataEntryUser % 2 == 0){
            System.out.println("El número ingresado por Ud. es par.");
        } else {
            System.out.println("El número ingresado por Ud. es impar.");
        }

        SeparadoresTP2.separadorCombinado();

    }
}