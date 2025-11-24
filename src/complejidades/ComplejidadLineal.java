package complejidades;

public class ComplejidadLineal {
    /*
        Complejidad: 0(n)
        Razon: Recorre todos los elementos una vez 
    */
    public void ejemplo(int[] datos) {
        for (int i = 0; i < datos.length; i++) {
            System.out.println("Elemento: " + datos[i]);
        }
    }
    
}