/*
 * "Evalucación 1 Practica 7 "Medir Tiempo"
 *  25/08/2022"
 */
package eva1_7_medir_tiempo;

/**
 *
 * @author Quintana Juarez Bryan Alexis
 */
public class EVA1_7_Medir_tiempo {

    public static void main(String[] args) {
        int[] datos = new int[1000000000];
        long ini = System.nanoTime();
        for (int i = 0; i < datos.length; i++) {
            datos[i] = 100;
        }
        long fin = System.nanoTime();
        long tiempo = fin - ini;
        System.out.println(tiempo);
    }
    
}
