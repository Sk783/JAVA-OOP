package com.sharad.properties;

/*Write a Java program to create a class called Animal with a method called makeSound().
  Create a subclass called Cat that overrides the makeSound() method to quarrel.*/

public class Animal {
    void makeSound(){
        System.out.println("The Animal Makes Sound");
    }
    static class Cat extends Animal{
        @Override
        void makeSound(){
            System.out.println("The cat quarrels");
        }

        public static void main(String[] args){
            Animal animal = new Animal();
            Cat cat = new Cat();
            animal.makeSound();
            cat.makeSound();
        }
    }
}
