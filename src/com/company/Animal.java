package com.company;

public class Animal {
    public String nombre;
    public String tipo;

    public void comer(){
        System.out.println("Animal: estoy comiendo");
    }

    public void comer(String comida){
        System.out.println(comida);
    }
}
