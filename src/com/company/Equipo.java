package com.company;

public class Equipo {
    public String nomEquipo;

    //al poner el atributo de la superclase en privado no
    // tendremos acceso a ella más que en
    //su clase, de esta forma la herencia no funciona.
    private String descripcion;

    public static void main(String[] args) {

        Jugador jugador = new Jugador();

        jugador.entrenar();

        // podemos poseer varias formas distintas y que un
        // mismo identificador posea o comparta varios significados diferentes
        jugador.entrenar();
        jugador.entrenar(22);
    }

    // creamos un método entrenar para el equipo y sus subclases
    public void entrenar(int totalJugadores){
        System.out.println("los " + totalJugadores + " jugadores están entrenado");
    }

}
