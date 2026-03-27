
package activityone;

/**
 *
 * @author Deresse Demeke Shallo
 */
public class Course {

    private String courseTitle, courseCode, courseInstructorname;
    private int credits;
public Course(String title, String code, 
        String instructor, int credit)
{
    this.courseTitle=title;
    this.courseCode=code;
    this.courseInstructorname=instructor;
    this.credits=credit;  
}
public String getcourseTitle()
{
    return this.courseTitle;
}
public void setcourseTitle(String title)
{
    this.courseTitle=title;
}
public String getcourseCode()
{
    return this.courseCode;
}
public void setcourseCode(String code)
{
    this.courseCode=code;
}
public String getInstructorname()
{
    return this.courseInstructorname;
}
public void setinstructorName(String name)
{
    this.courseInstructorname=name;
}
public int getcreditHours()
{
    return this.credits;
}
public void setcreditHours(int credit)
{
    this.credits=credit;
}
public String toString()
{
    return "course title "+courseTitle+" "
            +"Course code "+courseCode+ " "
            +"Course Instructor name "+courseInstructorname+" "
            +"Credit Hour "+credits;
}
}// the end of class Course
