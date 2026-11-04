package models;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Comparators {

    private List<Estudiantes> estList;
    private Estudiantes[] estArray;

    public Comparators() {
        Estudiantes e1 = new Estudiantes("Juan", 10);
        estArray = new Estudiantes[] {
            e1,
            new Estudiantes("Maria", 7),
            new Estudiantes("Diego", 3.5),
            new Estudiantes("Pedro", 7),
            new Estudiantes("Pedro", 6.8),
        };
        estList = new ArrayList<>(List.of(estArray));
        ejemplo1();
        ejemplo2();
        ejemplo3();
        ejemplo4();
        ejemplo5();
        ejemplo6();
        ejemplo7();
        ejemplo8();
        ejemplo9();
        ejemplo10();
        ejemplo11();
    }

    public void ejemplo1 (){
        //cpiare el arreglo
        System.out.println("Ejemplo 1");
        List<Estudiantes> lista = new ArrayList<>(estList);
        //ordenar nota ascendente
        //Comparator-> Obj != (Envolvente de primitivo ni String)
        Comparator<Estudiantes> comparador = Comparator.comparingDouble(x -> x.getNota());
        lista.sort(comparador);
        // imprimir
        print(lista);
    }

    private void print(List<Estudiantes> list) {
        for(Estudiantes est : list){
            System.out.println(est);

        } 
    }

    // Nota ascendente
    public void ejemplo2(){
        System.out.println("Ejemplo 2");
        List<Estudiantes> lista = new ArrayList<>(estList);
        Comparator<Estudiantes> comparator = Comparator.comparingDouble(Estudiantes::getNota);
        lista.sort(comparator);
        print(lista); 
    }
    //Nota descendente

    public void ejemplo3(){
        System.out.println("Ejemplo 3");
        List<Estudiantes> lista = new ArrayList<>(estList);
        Comparator<Estudiantes> comparator = Comparator.comparingDouble(Estudiantes::getNota).reversed();
        lista.sort(comparator);
        print(lista);

    }
    
    public void ejemplo4(){
        System.out.println("Ejemplo 4");
        List<Estudiantes> lista = new ArrayList<>(estList);
        Comparator<Estudiantes> comparator = Comparator.comparing(Estudiantes:: getName);
        lista.sort(comparator);
        print(lista);
    }
    //comprar atrves de una lamdan
    public void ejemplo5(){
        System.out.println("Ejemplo 5");
        List<Estudiantes> lista = new ArrayList<>(estList);
        Comparator<Estudiantes> comparator = (e1, e2) -> Double.compare(e1.getNota(), e2.getNota());
        lista.sort(comparator);
        print(lista);
    }
    public void ejemplo6(){
        System.out.println("Ejemplo 6");
        List<Estudiantes> lista = new ArrayList<>(estList);
        Comparator<Estudiantes> comparator = (e1, e2) -> e1.getName().compareTo(e2.getName());
        lista.sort(comparator);
        print(lista);
    }

    //Nombre Descendente y nota adescendeyte
    //Dos items con lamndan

    public void ejemplo7(){
        System.out.println("Ejemplo 7");
        List<Estudiantes> lista = new ArrayList<>(estList);
        Comparator<Estudiantes> comparator = (e1, e2) -> {
            int comp = Double.compare(e2.getNota(), e1.getNota());
            if(comp != 0){
                return comp;
            }
            return e2.getName().compareTo(e1.getName());
        };
        lista.sort(comparator);
        print(lista);
    }
    //por nota ascenten y nombre ascendente
    //camparator -> por valot
    // refreencia con dso comparadores
    public void ejemplo8(){
        System.out.println("Ejemplo 8");
        List<Estudiantes> lista = new ArrayList<>(estList);
        Comparator<Estudiantes> comparator = Comparator
            .comparingDouble(Estudiantes::getNota)
            .thenComparing(Estudiantes::getName);
        lista.sort(comparator);
        print(lista);
    }

     //Ordernar por nota ASCENDENTE y NOMBRE ASCENDENTE
     //Comparator -> por valor
     // referencias 2 comparadores
    
    private void ejemplo9() {
        System.out.println("Ejemplo 9");
        List<Estudiantes> lista = new ArrayList<>(estList);
        Comparator<Estudiantes> comparator = Comparator
            .comparingDouble(Estudiantes::getNota)
            .thenComparing(Estudiantes::getName);
        lista.sort(comparator);
        print(lista);
    }

    //
    // Ordernar por nota DESCENDENTE y NOMBRE ASCENDENTE
    // Comparator -> por valor
    // 1 comparator lambda
    // 2 comparator referencia
     
    private void ejemplo10() {
        System.out.println("Ejemplo 10");
        List<Estudiantes> lista = new ArrayList<>(estList);
        Comparator<Estudiantes> comparator = Comparator
            .comparingDouble((Estudiantes e) -> e.getNota())
            .reversed()
            .thenComparing(Estudiantes::getName);
        lista.sort(comparator);
        print(lista);
    }
    
    private void ejemplo11() {
        System.out.println("Ejemplo 11");
        List<Estudiantes> lista = new ArrayList<>(estList);
        Comparator<Estudiantes> comparator = Comparator
            .comparingDouble((Estudiantes e) -> {
                if(e.getNota() < 7) return e.getNota() + 2;
                return e.getNota();
            })
            .thenComparing(Estudiantes::getName, Comparator.reverseOrder());
        lista.sort(comparator);
        print(lista);
    }

}