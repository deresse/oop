/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chapterthreeoop;

/**
 *
 * @author Deresse Demeke Shallo
 */
public class Animal {
    protected String name;
    public Animal(String name) {
        this.name = name;
    }
    public void eat() {
        System.out.println(name + " is eating");
    }
    public void sleep() {
        System.out.println(name + " is sleeping");
    }
}
// Child class (subclass) - Single inheritance
class Dog extends Animal {

    public Dog(String name) {
        super(name);  // Call parent constructor
    }

    public void bark() {
        System.out.println(name + " is barking");
    }

}


