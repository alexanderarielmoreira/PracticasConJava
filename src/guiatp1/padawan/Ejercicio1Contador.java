package guiatp1.padawan;

import guiatp1.iniciado.Ejercicio10;

public class Ejercicio1Contador {

    public static void main(String[] args) {

        /*   Consigna:
        Contador: Se le solicita que guarde un número en un espacio de memoria e
        incremente dicho número 20 veces sin usar asignación. ¿Que operador podría usar
        para hacerlo?
        * */

        Ejercicio10 separadorInstanciable = new Ejercicio10();

        int unNumero = 1;

        for (int i = 1; i <= 20 ; i++) {

            unNumero ++;
            System.out.println("Ciclo Nº " + i);
            System.out.println("Valor: " + unNumero);
            separadorInstanciable.separadorLineal();
            Ejercicio10.separadorSinInstanciacion();

        };

    }

}
