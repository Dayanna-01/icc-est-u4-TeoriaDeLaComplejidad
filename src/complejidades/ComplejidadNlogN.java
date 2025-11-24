package complejidades;

import java.util.Arrays;

public class ComplejidadNlogN {
     /*
        Complejidad: O(log n)
        Razon: Ordenamiento eficiente como MergeSort o QuickSort.
         Implementación interna es O(n log n)
    */
   public void ejemplo(int[] datos) {
        Arrays.sort(datos); 
        for (int num : datos) {
            System.out.println("Ordenado: " + num);
        }
    }
    
}