import model.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Joanna Carla Rada", 23, "Female", 2014100504);

        student.setStudentName(student.studentName);
        student.setStudentAge(student.studentAge);
        student.setStudentGender(student.studentGender);
        student.setStudentIdNo(student.studentIdNo);

        System.out.println("Name: " +student.studentName);
        System.out.println("Age: " +student.studentAge);
        System.out.println("Gender: " +student.studentGender);
        System.out.println("ID NO: " +student.studentIdNo);
    }
}
