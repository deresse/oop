/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labclasstwo;

/**
 *
 * @author hp
 */
public class Student {
 private String Fullname;
 private String ID;
 private String Dept;
 private int age;
 public Student(String name,String id,String dept, int age)
 {
     this.Fullname=name;
     this.ID=id;
     this.Dept=dept;
     this.age=age;
 }

    public String getFullname() {
        return Fullname;
    }

    public void setFullname(String Fullname) {
        this.Fullname = Fullname;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String Dept) {
        this.Dept = Dept;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
 
 public void StudentInfo()
 {
     System.out.println("Student Information");
     System.out.println("Student Full name : "+ Fullname);
     System.out.println("Student ID:"+ID);
     System.out.println("Department of the student: "+Dept);
     System.out.println("Age of the student: "+age);
 }
 @Override
    public String toString()
    {
        return "My full name is "+ Fullname+"I'm a student of "+ID+" My ID number is "+Dept+" and I'M %d years old!";
    }
}
