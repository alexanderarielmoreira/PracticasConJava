package guiatp3poo.iniciado.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String nombre;
    private String apellido;
    private String fechaDeNacimiento;
    private int edad;

    public Alumno(){};

    public Alumno(String nombre, String apellido, String fechaDeNacimiento, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Método para agregar alumnos;

        // Se crea una lista DE 'TIPO OBJETO':
    private List<Alumno> listaDeAlumnos = new ArrayList<>();

        // Método para agregar (varios Objetos) 'alumno' a la lista:
    public void agregarAlumno(Alumno... alumnos){
        for (Alumno alumno : alumnos) {
            listaDeAlumnos.add(alumno);
        }
    }

}
