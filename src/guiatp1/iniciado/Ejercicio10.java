package guiatp1.iniciado;

public class Ejercicio10 {

    public void separadorLineal() {
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-++-+-+-+-+");
    };

    public static void separadorSinInstanciacion() {
        System.out.println("---------------------------------------------------");
    }

    public static void main(String[] args) {

        Ejercicio10 separador = new Ejercicio10();

        /* Consigna:
        Acumulador: Se le solicita que guarde en un espacio de memoria la acumulación
        de quince multiplicaciones entre dos números enteros divididos por el número de la
        multiplicación. Por ejemplo: Numero1*Numero2/1 + Numero1*Numero2/2 + … + Numero1*Numero2/15
        El resultado mostrarlo por pantalla.
        * */

        int numeroUno = 5;

        int numeroDos = 6;

        double acumulador = (numeroUno * numeroDos / 1) + (numeroUno * numeroDos / 2) +
                         (numeroUno * numeroDos / 3) + (numeroUno * numeroDos / 4) +
                         (numeroUno * numeroDos / 5) + (numeroUno * numeroDos / 6) +
                         (numeroUno * numeroDos / 7) + (numeroUno * numeroDos / 8) +
                         (numeroUno * numeroDos / 9) + (numeroUno * numeroDos / 10) +
                         (numeroUno * numeroDos / 11) + (numeroUno * numeroDos / 12) +
                         (numeroUno * numeroDos / 13) + (numeroUno * numeroDos / 14) +
                         (numeroUno * numeroDos / 15);

        System.out.println("Acumulador creado manualmente:");
        System.out.println("El resultado del acumulador es: " + acumulador);
        separador.separadorLineal();
        Ejercicio10.separadorSinInstanciacion();

        // Acumulador implementando un ciclo for:

        double acumuladorConCicloFor = 0.0;

        for(int i = 1; i <= 15; i++) {

            double resultado = (double) (numeroUno * numeroDos) / i;

            acumuladorConCicloFor += resultado;

        };

        System.out.println("Acumulador implementado con un ciclo 'for': ");
        System.out.println("El resultado de la acumulación implementando un ciclo 'For' es: "
                + acumuladorConCicloFor);
        separador.separadorLineal();
        Ejercicio10.separadorSinInstanciacion();
    }

}
