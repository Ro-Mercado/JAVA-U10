

package ej_2_u10;


public class Ej_2_U10 {

    /**
     * @param args the command line arguments
     * Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).
     */
    public static void main(String[] args) {
     int[] array= new int[6];
        try {
            for (int i = 0; i < 7; i++) {
                array[i]=i+1;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Arrgelo fuera de rango.\n");
            e.printStackTrace();
        }
    }

}
