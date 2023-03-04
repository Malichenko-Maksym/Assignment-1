import java.util.ArrayList;
import java.util.Arrays;

public class Classes {

    private ArrayList<Student> students = new ArrayList<>();

    public Classes(ArrayList<Student> students) {
        this.students = students;
    }

    public Classes() {
    }

    public void enrollStudent(Student student) {
        if (students.size() < 10) {
            students.add(student);
        } else {
            System.out.println("There are 10 students already!");
        }
    }

    @Override
    public String toString() {
        String finalResult = "| ";
        for(Student student : students){
            finalResult+=student+" | ";
        }
        return finalResult;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Max", "Mal");
        Student s2 = new Student("Vlad", "Mur");
        Student s3 = new Student("Andriy", "Zub");
        Classes cl = new Classes(new ArrayList<>(Arrays.asList(s1,s2)));
        cl.enrollStudent(s3);
        System.out.println(cl);
    }

}
