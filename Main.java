import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        // Create objects of Student, Teacher, and College
        Student student1 = new Student("yonas", 123,new int[]{56,64,78});
        Teacher teacher1 = new Teacher("aster", "java");
        College college=new College("CCI");
        // Set values for attributes through the constructor
        Student student2 = new Student("abebe", 456,new int[]{76,98,90});
        Teacher teacher2 = new Teacher("alemayehu", "database");

        //Add Student and Teacher objects into the College object
        college.addStudent(student1);
        college.addStudent(student2);
        college.addTeacher(teacher1);
        college.addTeacher(teacher2);
        // Print some details to test;

        {
            System.out.println("CCI");
            System.out.println("Name:" + college.getName());
        }
        System.out.println("Students:");
        for (Student student : college.getStudents()) {

            System.out.print("Name: " + student.getName() + ", ID:" + student.getId());
            System.out.println(" Grade: " + Arrays.toString(student.getGrades()));
        }

        System.out.println("\nTeachers:");
        for (Teacher teacher : college.getTeachers()) {
            System.out.println("Name: " + teacher.getName() + ", Subject: " + teacher.getSubject());
        }
    }
}