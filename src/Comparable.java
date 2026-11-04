import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import models.Estudiantes;

/**
 * Comparable
 */
public class Comparable {
    private List<Estudiantes> estList;
    private Estudiantes[] estArray;

    public Comparable() {
        Estudiantes e1 = new Estudiantes("Juan", 10);
        estArray = new Estudiantes[] {
            e1,
            new Estudiantes("Maria", 7),
            new Estudiantes("Diego", 3.5),
            new Estudiantes("Pedro", 7),
            new Estudiantes("Pedro", 6.8),
        };
        estList = new ArrayList<>(List.of(estArray));
        // ejemplo1();
        // ejemplo2();
        ejemplo3();
    }

    private void ejemplo1() {
        System.out.println("Ejemplo 1");
        int x = 10; int y = 20;
        int compInt = Integer.compare(x, y);
        String a = "Hola"; String b = "hola";
        int compStr = a.compareTo(b);

        Estudiantes e1 = estList.get(0);
        Estudiantes e2 = estList.get(1);
        int compEst = e1.compareTo(e2);
        estList.sort(null);
        System.out.println(estList);
    }

    private void ejemplo2() {
        System.out.println("Ejemplo 2");
        List<Estudiantes> list = new ArrayList<>(estList);
        list.sort(null);
        print(list);
    }

    private void print(List<Estudiantes> list) {
        for (Estudiantes est : list) {
            System.out.println(est);
        }
    }

    // mismo orden natural pero descendente
    // por Comparable -> orden natural invertido
    private void ejemplo3() {
        System.out.println("Ejemplo 3");
        List<Estudiantes> list = new ArrayList<>(estList);
        list.sort(Comparator.reverseOrder());
        print(list);
    }

    public static void main(String[] args) {
        new Comparable();
    }
}