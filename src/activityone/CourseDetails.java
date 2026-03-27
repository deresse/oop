
package activityone;

/**
 *
 * @author Deresse Demeke Shallo
 */
public class CourseDetails {
    public static void main(String[] args) 
    {
     Course oop=new Course("Object-oriented programming"
     ,"INSY3033","Deresse ",4);
        System.out.println(oop);
     Course os=new Course("Operating System",
     "INSY4321","Abdulimalik",3);
     oop.setinstructorName("Samuel");
        System.out.println(oop);
    }
    
}
