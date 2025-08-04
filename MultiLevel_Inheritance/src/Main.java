import person.UniversityStudent;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
         //Input from user
        System.out.print("Enter name: ");
        String name = input.nextLine();

        System.out.print("Enter age: ");
        int age = input.nextInt();

        System.out.print("Enter roll number: ");
        int rollNo = input.nextInt();
        input.nextLine(); // Consume newline

        System.out.print("Enter class name: ");
        String ClassName = input.nextLine();

        System.out.print("Enter major: ");
        String major = input.nextLine();

        System.out.print("Enter GPA: ");
        float GPA = input.nextFloat();

        //create object with user input
        UniversityStudent student1=new UniversityStudent(name,age,rollNo,ClassName,major,GPA);
        //call method
        student1.Introduce();             //Overridden from Person-> Student
        student1.attendClass();           //Overridden from Student ->UniversityStudent
        student1.ShowGPA();               //Own method
        student1.SubmitAssignment();      //Own method

    }
}
