package com.company;

public class Main {

    public static void main(String[] args) {
//     Animal chicken= new Chicken();
//     Animal tiger= new Tiger();
//     Fruit orange=new Orange();
//     Fruit apple = new Apple();
//     Chicken chicken1=(Chicken) chicken;
//        System.out.println(chicken1.howtoEat());
//        System.out.println(chicken1.makeSound());

        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howtoEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howtoEat());
        }
    }
}