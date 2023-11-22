package guiatp3poo.iniciado.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Curso {
    private String nombre;
    private boolean estaHabilitado;
    private String descripcion;

    // Debería ser un atributo de tipo lista: private List<Alumno> alumnos; ()=> ver como solucionar
    // su implementación en el programa principal;
    // Porque la idea es que el Curso cuente con una lista de Alumnos;
    private Alumno alumnos;

    public Curso(){};
    public Curso(String nombre, boolean estaHabilitado, String descripcion, Alumno alumnos){
        this.nombre = nombre;
        this.estaHabilitado = estaHabilitado;
        this.descripcion = descripcion;
        this.alumnos = alumnos;
    };

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstaHabilitado() {
        return estaHabilitado;
    }

    public void setEstaHabilitado(boolean estaHabilitado) {
        this.estaHabilitado = estaHabilitado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Alumno getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Alumno alumnos) {
        this.alumnos = alumnos;
    }

}
