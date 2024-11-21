package Composicion;
/**
 * Esta clase denominada Circulo este de figura geometrica
 * que se caracteriza por tener un centro y un radio como atributos
 * @version 1.2/2020
 */
public class Circulo {
    /* Atributo que identifica el punto central donde se encuentra
    * localizado en un circulo*/
    Punto centro;
    int radio; // Atributo que identifica el radio de un circulo
    /**
     * Constructor de la clase Circulo
     * @param x Parametro que define la coordenada x de un punto que
     * establece el centro del circulo
     * @param y Parametro que define la coordenada x de un punto que
     * establece el centro del circulo
     * Parametro que define la coordenada x de un punto que
     * @param radio Parametro que define el radio del circulo
     */
    public Circulo(int x, int y, int radio) {
        centro = new Punto(x,y); /* Crea un circulo con los valores
            pasados como parametros */
        this.radio = radio; // Inicializa el atributo radio
    }
    /**
     * Metodo que devuelve el radio de un circulo
     * @return El radio de un circulo
     */
    int getRadio(){
        return radio;
    }
    /**
     * Metodo que establece el radio de un circulo
     * @param Parametro que define el radio de un circulo
     */
    void setRadio(int radio) {
        this.radio = radio;
    }
    /**
     * Metodo que muestra en pantalla en los datos de un circulo
     */
    void imprimir(){
        System.out.println("El centro del circulo es la coordenada(" +
                centro.getX() + "," + centro.getY() + ") y tiene un radio = " +
                radio);
    }
}
