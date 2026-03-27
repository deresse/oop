/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lecture3;

/**
 *
 * @author Deresse Demeke Shallo
 */
public non-sealed class Cat extends Animal {
    public Cat(String name)
    {
        super(name);
    }
    public void jump()
    {
        System.out.println(name+" can jump!");
    }
    @Override
    public void eat() {
        System.out.println("Cat "+name + " sometimes eat meat");
    }
}
