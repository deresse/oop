package lecture3;
import javax.swing.JOptionPane;
/**
 *
 * @author Deresse Demeke Shallo
 */
public class Student {
    static int totalStudents=0;
    String name;
    public Student(String name) {
        this.name = name;
        totalStudents++;
    }
    static void showInfo()  {
        JOptionPane.showMessageDialog(null," Total students: "+totalStudents);
    }
    public static void main(String[] args) {
        String name1, name2;
        name1=JOptionPane.showInputDialog(null,"Please Enter the first student name");
        name2=JOptionPane.showInputDialog(null, "Please enter the second student name");
        Student st1=new Student(name1);
        Student st2=new Student(name2);
        String details="The first student detail :"+st1.name+"\n"
                +"The second student detail :"+st2.name;
        JOptionPane.showMessageDialog(null, details);
        Student.showInfo();// static method.
    }
}
