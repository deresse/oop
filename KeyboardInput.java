/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package keyboardinput;

import java.util.Scanner;

/**
 *
 * @author Deresse Demeke Shallo
 */
public class KeyboardInput {

    /**
     * @param args the command line arguments
     */
    public static double Area(int radius)
    {
        return Math.PI*radius;
    }
    public static void main(String[] args) {
        int age, rad;
        String name;
        Scanner input=new Scanner(System.in);
        System.out.println("how old are you?");
        age=input.nextInt();
        System.out.println("I'M "+age+ "years old!");
        System.out.println("What is your name ?");
        name=input.next();
        System.out.println("My name is "+name);
        System.out.println("Please Enter the radius of the circle");
        rad=input.nextInt();
        System.out.println("The area of the circle is: "+Area(rad));
    }
    
}
