import complejidades.ComplejidadConstante;
import complejidades.ComplejidadCuadratica;
import complejidades.ComplejidadLineal;
import complejidades.ComplejidadLogaritmica;
import complejidades.ComplejidadNlogN;

public class App {
    public static void main(String[] args) throws Exception {
       // O(1) - Constante
        ComplejidadConstante constante = new ComplejidadConstante();
        constante.ejemplo();

        // O(n) - Lineal
        int[] datosLineales = {1, 2, 3, 4, 5};
        ComplejidadLineal lineal = new ComplejidadLineal();
        lineal.ejemplo(datosLineales);

        // O(n²) - Cuadrática
        int[] datosCuadraticos = {1, 2, 3};
        ComplejidadCuadratica cuadratica = new ComplejidadCuadratica();
        cuadratica.ejemplo(datosCuadraticos);

        // O(log n) - Logarítmica
        int[] datosOrdenados = {2, 4, 6, 8, 10, 12, 14};
        int objetivo = 10;
        ComplejidadLogaritmica logaritmica = new ComplejidadLogaritmica();
        logaritmica.ejemplo(datosOrdenados, objetivo);

        // O(n log n) - Lineal-logarítmica
        int[] datosDesordenados = {9, 3, 7, 1, 5};
        ComplejidadNlogN nlogn = new ComplejidadNlogN();
        nlogn.ejemplo(datosDesordenados);
    }
}
