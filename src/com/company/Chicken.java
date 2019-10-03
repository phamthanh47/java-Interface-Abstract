package com.company;

public class Chicken extends Animal implements Edible {
    public String howtoEat(){
        return "chicken";
    }
    public String makeSound(){
        return "cuctacuctac";
    }
}
