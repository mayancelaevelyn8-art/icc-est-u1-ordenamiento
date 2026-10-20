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
}