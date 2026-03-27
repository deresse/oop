package lecture3;
/**
 *
 * @author Deresse Demeke Shallo
 */
public interface Flyable {
    void fly();
    default void land()
    {
        System.out.println("Landing");
    }
    static void describeAbility() {
        System.out.println("This creature can fly high in the sky! ");
    }
} // end of interface Flyable

interface Swimmable {

    void swim();

    default void dive() {
        System.out.println("Diving underwater...");
    }
} // end of Interface Swimmable

class Duck implements Flyable, Swimmable {
    private String name;
    public Duck(String name) {
        this.name = name;
    }
    @Override
    public void fly() {
        System.out.println(name + " is flying low over the pond!");
    }
    @Override
    public void swim() {
        System.out.println(name + " is paddling with orange feet!");
    }
    public void makeSound() {
        System.out.println(name + " says: Quack quack!");
    }
    @Override
    public void land() {
        System.out.println(name + " is landing on the water");
    }
} //end of class Duck

class Airplane implements Flyable {
    @Override
    public void fly() {
        System.out.println("Airplaneis soaring at 35,000 feet!");
    }
}
class InterfaceTest {
    public static void main(String[] args) {
        Duck donald = new Duck("Donald");
        donald.makeSound();
        donald.fly();
        donald.swim();
        donald.land();
        donald.dive();
        System.out.println("-----------------------------");
        Flyable plane = new Airplane();
        plane.fly();
        plane.land();
    }
}
