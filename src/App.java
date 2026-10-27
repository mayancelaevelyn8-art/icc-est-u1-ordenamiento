import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import models.Estudiantes;

public class App {

    public static void main(String[] args) throws Exception {
        //runEjemplosPrimitivos();
        //runEjemploObjetos();
        //runComparators();
        runComparatorsObj1();
        runComparatorsObj2();
    }

    private static void runComparatorsObj2() {
        Estudiantes e1 = new Estudiantes("Juan", 10);
        Estudiantes[] estudiantes = {e1,
            new Estudiantes("Maria", 7),
            new Estudiantes("Diego", 3.5),
            new Estudiantes("Pedro", 6.8),
        };
        Comparator.naturalOrder();
        Comparator.reverseOrder();
        Comparator<Estudiantes> compNota = Comparator.comparingDouble(e-> e.getNota ());
        Arrays.sort(estudiantes, compNota);
        for(int i = 0; i < estudiantes.length; i++)
            System.out.print(estudiantes[i] + " - ");
        System.out.println();

        estudinatesLista.sort(compNota);
        System.out.println(estudinatesLista);
    }

    private static void runComparatorsObj1() {
        List<Integer> numeros = new ArrayList<>(List.of(5, 6, 4, 1, 2, 3));

        //Ordenenra de menor a mayor
        numeros.sort(Comparator.naturalOrder());
        numeros.sort(null);
        System.out.println(numeros);
        //Ordenar de mayor a menor
        numeros.sort(Comparator.reverseOrder());
        System.out.println(numeros);

    }

    static List<Estudiantes> estudinatesLista = new ArrayList<>(List.of(
        new Estudiantes("Juan", 10),
        new Estudiantes("Maria", 7),
        new Estudiantes("Diego", 3.5),
        new Estudiantes("Pedro", 6.8)
    ));

    private static void runComparators() {
        Integer[] original = {5, 6, 4, 1, 2, 3};
        Arrays.sort(original);
        for(int i = 0; i < original.length; i++)
            System.out.print(original[i] + " - ");
        System.out.println();
        System.out.println("---");
        Arrays.sort(original, Comparator.reverseOrder());
        for(int i = 0; i < original.length; i++)
            System.out.print(original[i] + " - ");
        System.out.println();
    }

    public static void runEjemploObjetos(){
        Estudiantes e1 = new Estudiantes("Juan", 10);
        Estudiantes[] estudiantes = {
            e1,
            new Estudiantes("Maria", 7),
            new Estudiantes("Diego", 3.5),
            new Estudiantes("Pedro", 6.8),
        };

        Bubble bubble = new Bubble();
        System.out.println("original");
        printArreglo(estudiantes);
        bubble.sortEstudinateNota(estudiantes);
        System.out.println("ordenado");
        printArreglo(estudiantes);
    }
    public static void runEjemplosPrimitivos(){
        int[] original = {5, 6, 4, 1, 2, 3};
        int[] b = original.clone();
        int[] c = original.clone();
        int[] d = original.clone();

        // usar el metodo del archivo(clase) Bubble
        // instaciar el archivo Bubble
        // instanciar la clase Bubble
        Bubble bubble = new Bubble();
        //Ejecutar codigo al archivo burbuja bubble uso la instancia
        printArreglo(b);
        bubble.sort(b);
        printArreglo(b);

        // instanciar la clase Selection
        System.out.println("--- Selection Sort ---");
        System.out.println("Original: ");
        Selection selection = new Selection();
        printArreglo(c);
        selection.sort(c);
        System.out.println("Ordenado Asc: ");
        printArreglo(c);

        //Metodo de InstertionSort
        System.out.println("--- Selection Insertion ---");
        InsertionSort insertionSort = new InsertionSort();
        System.out.println("Original:");
        printArreglo(d);
        insertionSort.sort(d);
        System.out.println("Ordenado Des:");
        printArreglo(d);
    }

    public static void printArreglo(int[] arr){
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " - ");
        System.out.println();
    }

    public static void printArreglo(Estudiantes[] arr){
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " - ");
        System.out.println();
    }
}