package guiatp3poo.iniciado.domain;

import guiatp2progestructurada.SeparadoresTP2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AlumnoInstanciado {

    public static void main(String[] args) {

        Alumno alexanderArielMoreira = new Alumno("Alexander Ariel", "Moreira",
                                                  "1987-11-07",36);
        SeparadoresTP2.separadorCombinado();
        System.out.println(alexanderArielMoreira.getNombre());
        System.out.println(alexanderArielMoreira.getApellido());
        SeparadoresTP2.separadorCombinado();

        String fechaNacimiento = alexanderArielMoreira.getFechaDeNacimiento();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate fechaNacFormateada = LocalDate.parse(fechaNacimiento, formatter);
        System.out.println("Fecha de nacimiento formateda: " + fechaNacFormateada);
        SeparadoresTP2.separadorLinealSimple();

        Alumno mariaNuriaVallejos = new Alumno();
        mariaNuriaVallejos.setNombre("Maria Nuria");
        mariaNuriaVallejos.setApellido("Vallejos");
        mariaNuriaVallejos.setFechaDeNacimiento("1989-03-28");
        mariaNuriaVallejos.setEdad(34);

        System.out.println("Nombre: " + mariaNuriaVallejos.getNombre() + " | Apellido: "
                            + mariaNuriaVallejos.getApellido());
        System.out.println("Edad: " + mariaNuriaVallejos.getEdad());
        SeparadoresTP2.separadorCombinado();

        Alumno angelesDaianaMoreira = new Alumno("Angeles Daiana", "Moreira",
                                                "04/01/1998", 25);
        System.out.println("Nombre: " + angelesDaianaMoreira.getNombre() +
                           "\nApellido: " + angelesDaianaMoreira.getApellido() +
                           "\nEdad: " + angelesDaianaMoreira.getEdad() +
                           "\nFecha de nacimiento: " + angelesDaianaMoreira.getFechaDeNacimiento());

    }

}
