import models.Estudiantes;

public class Bubble {
    public int[] sort(int[] arreglo){
        int cambios = 0;
        int comparaciones = 0;
        for(int i = 0; i < arreglo.length; i++){
            System.out.println("Pasada: " + i);
            boolean combinaciones = false;
            for(int j = 1; j < arreglo.length -i; j++){
                comparaciones ++;
                // Comparacion if
                if(arreglo[j-1] > arreglo[j]){
                    // Intercambio
                    int aux = arreglo[j-1];
                    arreglo[j-1] = arreglo[j];
                    arreglo[j] = aux;
                    cambios++;
                    combinaciones = true;
                }
            }
            if(!combinaciones){
                break;
            }
            System.out.println("Cambios: " + cambios);
            System.out.println("Comparaciones: " + comparaciones);
        }
        System.out.println("Cambios: " + cambios);
        System.out.println("Comparaciones: " + comparaciones);
        return null;
    }
    public void sortEstudinateName(Estudiantes[] estudiantes){
        for (int i = 0; i < estudiantes.length; i++){
            boolean cambio = false;
            for(int j = 0; j < estudiantes.length - 1 - i; j++){
                if(estudiantes[j].getName().compareTo(estudiantes[j+1].getName()) > 0){
                    Estudiantes aux = estudiantes[j];
                    estudiantes[j] = estudiantes[j+1];
                    estudiantes[j+1] = aux;
                    cambio = true;
                }
            }
            if(!cambio){
                break;
            }
        }

    }

    public void sortEstudinateNota(Estudiantes[] estudiantes){
        for (int i = 0; i < estudiantes.length; i++){
            boolean cambio = false;
            for(int j = 0; j < estudiantes.length - 1 - i; j++){
                if(estudiantes[j].getNota() > estudiantes[j+1].getNota()){
                    Estudiantes aux = estudiantes[j];
                    estudiantes[j] = estudiantes[j+1];
                    estudiantes[j+1] = aux;
                    cambio = true;
                }
            }
            if(!cambio){
                break;
            }
        }
    }
}