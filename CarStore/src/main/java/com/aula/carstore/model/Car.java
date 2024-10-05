package com.aula.carstore.model;


public class Car {

    private String name;
    private String cor;

    public Car(String name, String cor) {
        this.name = name;
        this.cor = cor;
    }

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;

    }

    public String getCor() {
        return cor;
    }


}


