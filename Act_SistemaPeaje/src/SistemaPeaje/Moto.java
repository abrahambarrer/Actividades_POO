package SistemaPeaje;

/**
 * Esta clase denominada Moto modela un tipo especifico de Vehiculo
 * que llega a un peaje. Tiene un atributo estatico que representa su
 * valor del peaje en $5000
 * @version 1.2/2020
 */
public class Moto extends Vehiculo{
    // Atributo estatico que identifica el valor de peaje a pagar por una moto
    static int valorPeaje = 5000;

    /**
     * Constructor de la clase Moto
     * @param placa Parametro que define la placa de una moto
     */

    Moto(String placa){
        super(placa);
    } // Invoca el constructor de la clase padre
    /**
     * Metodo que devuelve el valor del peaje para una moto
     * @return El valor del peaje para una moto
     */
    public int getValorPeaje(){
        return valorPeaje;
    }
    /**
     * Metodo que establece el valor del peaje para una moto
     * @param Parametro que define el valor del peaje para una moto
     */
    static void setValorPeaje(int valorPeaje){
        valorPeaje = valorPeaje;
    }
    /**
     * Metodo que muestra en pantalla la placa y el valor del peaje de
     * una moto
     */
    void imprimir(){
        System.out.println("Placa = " + placa);
        System.out.println("Valor del peaje = " + valorPeaje);
    }
}
