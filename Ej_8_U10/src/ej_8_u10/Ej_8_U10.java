

package ej_8_u10;


public class Ej_8_U10 {

    /**
     * @param args the command line arguments
     * Indique que se mostrará por pantalla cuando se ejecute cada una de estas clases:
     */
    public static void main(String[] args) {
       
       try {
        //System.out.println (Uno.metodo()) ;
        System.out.println (Dos.metodo()) ;
        //System.out.println (Tres.metodo()) ;
        }catch(Exception e) {
        
        System.out.println("Excepcion en metodo() ") ;
        e.printStackTrace();
        }
    }

}
