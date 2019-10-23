package com.company;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Ave ave = new Ave();

        animal.comer();
        ave.comer();
        ave.comer("estoy comiendo grillos");
    }
}
