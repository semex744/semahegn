import java.util.ArrayList;
import java.util.List;

public class College {
    private String name;
   private List<Student> students;
    private List<Teacher> teachers;

    // Constructor
    public College(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
    }
    // Method to add a Student object to the students list
    public void addStudent(Student student) {
        students.add(student);
    }

    // Method to add a Teacher object to the teachers list
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    // Method to get the list of students
    public String getName() {

        return name;
    }
    public List<Student> getStudents() {
        return students;
    }

    // Method to get the list of teachers
    public List<Teacher> getTeachers() {
        return teachers;
    }
}