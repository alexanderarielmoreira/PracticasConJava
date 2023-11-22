package guiatp3poo.iniciado.domain;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        // Alumnos:
        Alumno alumno1 = new Alumno("Carlos","Meza","05/07/1995",28);
        Alumno alumno2 = new Alumno("Pedro", "Baez", "01/02/1990", 33);
        Alumno alumno3 = new Alumno("Lara", "Bernasconi", "02/03/1987",36);
        Alumno alumno4 = new Alumno("Claudio", "vallejos", "02/03/1989",34);
        Alumno alumno5 = new Alumno("Omar", "Norniella", "02/05/1985",38);
        Alumno alumno6 = new Alumno("Juan", "Medina", "01/10/58",65);
        Alumno alumno7 = new Alumno("Nuria", "Robertson", "06/10/1940",83);
        Alumno alumno8 = new Alumno("Beatriz", "Gomez", "02/09/1990",33);
        Alumno alumno9 = new Alumno("Erica", "Acosta", "18/08/1970",53);
        Alumno alumno10 = new Alumno("Eduardo", "Nuñez", "29/04/1987",36);

        // Lista de Alumnos;
            // Se instancia la clase;
        Alumno listaDeAlumnos = new Alumno();
        listaDeAlumnos.agregarAlumno(alumno1,alumno2,alumno3,alumno4,alumno5,alumno6,alumno7,alumno8,alumno9,alumno10);


        // Curso:

        // Arreglar el 'type of';
        Curso cursoDeJavaScript = new Curso("JavaScript", true,
                                           "Curso avanzado de JS con MongoDB", listaDeAlumnos);

        System.out.println(cursoDeJavaScript.getNombre());
        System.out.println(cursoDeJavaScript.getDescripcion());
        System.out.println(cursoDeJavaScript.isEstaHabilitado());
    }

}
