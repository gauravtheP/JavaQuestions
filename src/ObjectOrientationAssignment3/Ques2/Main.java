package ObjectOrientationAssignment3.Ques2;

/*
 * Created by gaurav on 15/6/17.
 */
/********************************************************************************
 * Q2. (The Person, Student, Employee, Faculty, and Staff classes)                *
 * Design a class named Person and its two subclasses named Student and Employee. *
 * Make Faculty and Staff subclasses of Employee. A person has a name,            *
 * address, phone number, and email address. A student has a class status         *
 * (freshman, sophomore, junior, or senior). Define the status as a constant. An  *
 * employee has an office, salary, and date hired. Use the MyDate class defined   *
 * in Programming Exercise 10.14 to create an object for date hired. A faculty    *
 * member has office hours and a rank. A staff member has a title. Override the   *
 * toString method in each class to display the class name and the person’s name  *
 *********************************************************************************/

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Person", "Eric", "6, Hagenvillagasse, Hamburg", "89654712", "eric@hotmail.com");
        Student student = new Student("Student", "Helena", "67, Carabilliegasse, Colonge", "87965412", "helena@yahoo.com", 4);
        Employee employee = new Employee("Employee", "Zlatan", "73, liechtensteinstrasse, Wien", "98745632", "zlatan@hmail.com", "Front Department", 30000, new MyDate());
        Faculty faculty = new Faculty("Faculty", "Prof Schmidt", "98, Hagenvillagasse, Munich", "54783214", "schmidt@gmail.com", "Backend", 85000,new MyDate(2, 10, 2010), 9, "Professor");
        Staff staff = new Staff("Staff", "Klaus", "45, Hornergasse, Zurich", "87456321","klaus@tmail.com","Front", 20000, new MyDate(23,4,2017), "Janitor");

        System.out.println(person.toString());
        System.out.println();
        System.out.println(student.toString());
        System.out.println();
        System.out.println(employee.toString());
        System.out.println();
        System.out.println(faculty.toString());
        System.out.println();
        System.out.println(staff.toString());
    }
}