package complejidades;

public class ComplejidadCuadratica {
    /*
        Complejidad: 0(n^2)
        Razon: Dos bucles anidados: cada elemento se compara con todos los demás
    */
    public void ejemplo(int[] datos) {
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos.length; j++) {
                System.out.println("Comparando " + datos[i] + " con " + datos[j]);
            }
        }
    }
    
}