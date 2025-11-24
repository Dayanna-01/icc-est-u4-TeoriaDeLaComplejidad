package complejidades;

public class ComplejidadLogaritmica {
    /*
        Complejidad: O(log n)
        Razon: Búsqueda binaria: divide el problema a la mitad en cada paso
    */
    public void ejemplo(int[] datos, int objetivo) {
        int inicio = 0;
        int fin = datos.length - 1;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            if (datos[medio] == objetivo) {
                System.out.println("Encontrado en índice: " + medio);
                return;
            } else if (datos[medio] < objetivo) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }

        System.out.println("No encontrado");
    }

    
}
