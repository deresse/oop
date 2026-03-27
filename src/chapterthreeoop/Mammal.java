package chapterthreeoop;

/**
 *
 * @author Deresse Demeke Shallo
 */
class Mammal extends Animal {

    public Mammal(String name) {
        super(name);
    }

    public void breatheAir() {
        System.out.println(name + " is breathing air");
    }
}

class Dog extends Mammal {

    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println(name + " is barking");
    }
}
    class test {

        public static void main(String[] args) {
            Dog dog1 = new Dog("Mechal");
            dog1.bark();
            dog1.breatheAir();
            dog1.eat();
            dog1.sleep();
        }
    }


// Dog inherits from Mammal, which inherits from Animal
