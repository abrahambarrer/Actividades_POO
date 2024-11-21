package Composicion;

/**
 * Esta clase denominada Punto que esta confirmado por una pareja de
 * valores, un valor para la coordenada x y otro para la coordenada y.
 * @version 1.2/2020
 */
public class Punto {
    int x, y; /* Atributos que identifican el valor de las coordenadas (x,y)
        del circulo */
    /**
     * Constructor de la clase Punto
     * @param x Parametro que define la coordenada x de un punto
     * @param y Parametro que define la coordenada y de un punto
     */
    Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    /**
     * Metodo que devuelve el valor de la coordenada x de un punto
     * @return El valor de la coordenada x de un punto
     */
    int getX(){
        return x;
    }
    /**
     * Metodo que establece el valor de la coordenada x de un punto
     * @param Parametro que define el valor de la coordenada x de un punto
     */
    void setX(int x){
        this.x = x;
    }
    /**
     * Metodo que devuelve el valor de la coordenada y de un punto
     * @return El valor de la coordenada y de un punto
     */
    int getY(){
        return y;
    }
    /**
     * Metodo que establece el valor de la coordenada y de un punto
     * @param Parametro que define el valor de la coordenada y de un
     * punto
     */
    void setY(int y){
        this.y = y;
    }
}
