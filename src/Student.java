import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int ID = 1000;

    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.println("1 - Freshman\n" +
                "2 - Sophmore \n" +
                "3 - Junior\n" +
                "4 - Senior \n" +
                "Enter student grade level ");
        this.gradeYear = in.nextInt();

        setStudentID();


    }

    private void setStudentID(){
        ID++;
        this.studentID = gradeYear + "" + ID;
    }

    public void enrol() {
        do {
            System.out.print("Enter course to enrol (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses += "\n" + " " +  course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }else {
            break;
            }
        } while (1 != 0);


    }

    public void viewBalance() {
        System.out.println("Your balance is: $" + tuitionBalance);
    }

    public void payTuition() {
        viewBalance();
        System.out.print("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance -= payment;
        System.out.println("Thank you for your payment of: " + payment);
        viewBalance();
    }


    public void showInfo(){
        System.out.println("Name: " + firstName + " " + lastName +
                "\nCourses Enrolled: " + courses +
                "\nBalance: $" + tuitionBalance +
                "\nGrade Level: " + gradeYear +
                "\nStudent ID: " + studentID);

    }


}
