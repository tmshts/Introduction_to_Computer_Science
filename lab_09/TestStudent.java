import java.util.Scanner;

public class TestStudent {
    
    public static void main(String[] args) {

        int number = 3;
        Student[] student_array = new Student[number];

        Scanner scan = new Scanner(System.in);

        String name_student_1 = scan.nextLine();
        String course_student_1 = scan.nextLine();
        String name_student_2 = scan.nextLine();
        String course_student_2 = scan.nextLine();
        String name_student_3 = scan.nextLine();
        String course_student_3 = scan.nextLine();

        student_array[0] = new Student(name_student_1, course_student_1);
        student_array[1] = new Student(name_student_2, course_student_2);
        student_array[2] = new Student(name_student_3, course_student_3);

        for(int i = 0; i < number; i++) {
            student_array[i].showStudent();
        }

        student_array[0].setCourse("CSSE");
        student_array[0].showStudent();

        student_array[2].setName("Louise Johnson");
        System.out.println(student_array[2].getName());

    }

}
