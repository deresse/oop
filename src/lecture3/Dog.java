
package lecture3;

/**
 *
 * @author Deresse Demeke
 */
public non-sealed class Dog extends Animal { //Dog is a child of Animal class

    public Dog(String name) {
        super(name);  // Call parent constructor
        //this.genetics=gene;
    }

    public void bark() {
        System.out.println(name + " is barking");
    }
    //Method overriding
    @Override
    public void eat() {
        //super.eat();
        System.out.println(name + " is eating meat!");
    }
    
}
