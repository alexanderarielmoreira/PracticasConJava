package guiatp1.maestro;

import guiatp1.Separadores;

import java.util.Scanner;

public class Ejercicio2ConversionCelsiusToFahrenheit {

    public static void main(String[] args) {

        /*  Consigna:
        Conversión de grados Celsius a grados Fahrenheit : Escribir un programa en
        Java que convierta una temperatura en grados Celsius a grados Fahrenheit. Buscar
        la fórmula con la que se resuelve;

        Formula:
        ºF = (ºC · 1,8) + 32;
        * */

        Separadores.separadorCombinado();
        Separadores separador = new Separadores();
        separador.separadorLinealSimple();

        System.out.println("Bienvenido al sistema de conversión\n" +
                           "de grados grados Celsius a grados Fahrenheit\n" +
                           "INGRESE los datos: ");

        Scanner lectorDeCelsius = new Scanner(System.in);
        double gradosCelsius = lectorDeCelsius.nextDouble();

        double conversion = (gradosCelsius * 1.8) + 32;

        String impresionPorPantalla = """
                                      Ud. a ingresado %.2f ºC.
                                      Su conversión es equivalente a %.2f ºF.
                                      """.formatted(gradosCelsius, conversion);

        System.out.println(impresionPorPantalla);

        Separadores.separadorCombinado();
        separador.separadorLinealSimple();
    };

};
