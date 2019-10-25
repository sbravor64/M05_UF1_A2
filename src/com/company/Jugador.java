package com.company;

// Para declarar la herencia en Java usamos la palabra clave extends
public class Jugador extends Equipo {
    protected String nom;

    //añadimos un nuevo método en jugador y veremos que tiene
    // preferencia sobre el método de su superclase
    public void entrenar(){
        System.out.println("el jugador está entrenando");
    }
}
