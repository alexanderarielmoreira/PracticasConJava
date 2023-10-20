package guiatp1.iniciado;

public class Ejercicio10 {

    public static void main(String[] args) {

        /* Consigna:
        Acumulador: Se le solicita que guarde en un espacio de memoria la acumulación
        de quince multiplicaciones entre dos números enteros divididos por el número de la
        multiplicación. Por ejemplo: Numero1*Numero2/1 + Numero1*Numero2/2 + … + Numero1*Numero2/15
        El resultado mostrarlo por pantalla.
        * */

        int numeroUno = 5;

        int numeroDos = 6;

        int acumulador = (numeroUno * numeroDos / 1) + (numeroUno * numeroDos / 2) +
                         (numeroUno * numeroDos / 3) + (numeroUno * numeroDos / 4) +
                         (numeroUno * numeroDos / 5) + (numeroUno * numeroDos / 6) +
                         (numeroUno * numeroDos / 7) + (numeroUno * numeroDos / 8) +
                         (numeroUno * numeroDos / 9) + (numeroUno * numeroDos / 10) +
                         (numeroUno * numeroDos / 11) + (numeroUno * numeroDos / 12) +
                         (numeroUno * numeroDos / 13) + (numeroUno * numeroDos / 14) +
                         (numeroUno * numeroDos / 15);

        System.out.println("El resultado del acumulador es: " + acumulador);

        //Buscar la forma de simplificar con un bucle for;
    }


}
