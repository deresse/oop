/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lecture3.Inheritance;

import lecture3.Animal;
import lecture3.Cat;
import lecture3.Dog;

/**
 *
 * @author Deresse Demeke Shallo
 */
public class TestInheritance {

    public static void main(String[] args) {
        Animal [] animal = new Animal[2];
        animal[0] = new Dog("Boby");
        animal[1] = new Cat("Woro");
        Animal an2=new Animal("Dimet");
        
        if(animal[0] instanceof Dog)
        {
            Dog dog=(Dog)animal[0];// downcasting
             dog.bark();
             dog.eat();
        }
        animal[0].eat();
        animal[1].eat();
        for(Animal an:animal)
        {
            an.eat();
        }

    }

}
