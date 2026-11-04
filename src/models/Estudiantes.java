package models;
//class Estudiantes
import java.util.Comparator;

public class Estudiantes implements Comparable<Estudiantes> {
    private String name;
    private double nota;

    //Constructor

    public Estudiantes(String name, double nota) {
        this.name = name;
        this.nota = nota;
    }
    

    public Estudiantes() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    // Version 1 (comentada): nota ascendente y, si son iguales, nombre ascendente
    // @Override
    // public int compareTo(Estudiantes e2) {
    //     int compNota  = Double.compare(this.getNota(), e2.getNota());
    //     if (compNota != 0) {
    //         return compNota;
    //     }
    //     return this.getName().compareTo(e2.getName());
    // }

    // Version 2: mismo resultado con Comparator

    @Override
    public int compareTo(Estudiantes e2) {
        return Comparator
                .comparingDouble(Estudiantes::getNota)
                .thenComparing(Estudiantes::getName)
                .compare(this, e2);
    }

    // compareTo devuelve: negativo si this < e2, 0 si son iguales, positivo si this > e2

    @Override
    public String toString() {
        return "Estudiante [" + name + ", " + nota + "]";
    }
}