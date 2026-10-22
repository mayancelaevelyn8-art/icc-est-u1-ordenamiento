package models;
//class Estudiantes
public class Estudiantes {
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

    @Override
    public String toString() {
        return "Estudiante [" + name + ", " + nota + "]";
    }
}