package guiatp2progestructurada.iniciado;

import guiatp1.Separadores;
import guiatp2progestructurada.SeparadoresTP2;

import java.util.ArrayList;

public class Ej2MisAmigos {

    public static void main(String[] args) {

        ArrayList<String> misAmigos = new ArrayList<>();

        misAmigos.add("Carlos");
        misAmigos.add("Beto");
        misAmigos.add("Pomelo");
        misAmigos.add("Lorenzo");
        misAmigos.add("Renzo");

        SeparadoresTP2.separadorCombinado();
        SeparadoresTP2.separadorLinealSimple();

        /*  ¿Cuando conviene usar un bucle for o un ciclo forEach?
        Cuando el acceso el índice de la collección o arreglo es importante, conviene
        usar un bucle for tradicional;
        En cambio, cuando solo se necesitan recorrer los elementos es más eficiente el
        bucle porEach;
        * */

        for (String elem: misAmigos) {
            System.out.println("Nombre: " + elem);
        };

        SeparadoresTP2.separadorCombinado();
        SeparadoresTP2.separadorLinealSimple();

    }

}
