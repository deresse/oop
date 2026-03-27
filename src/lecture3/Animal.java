
package lecture3;

/**
 *
 * @author hp
 */
public sealed class Animal permits Dog, Cat{
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
    

