package Composicion;

/**
 * Esta clase prueba la clase Circulo
 * @version 1.2/2020
 */
public class Prueba {
    /**
     * Metodo main que crea un circulo localizado en el punto (2,3) y
     * con un radio de 5. Luego, imprime los datos del circulo en
     * pantalla
     */
    public static void main(String args[]){
        Circulo circulo1 = new Circulo(2,3,5);
        circulo1.imprimir();
    }
}
