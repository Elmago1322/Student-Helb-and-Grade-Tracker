import java.util.ArrayList;

public class Student{
    String name;
    String registrationNumber;
    private Finance helbAccount;
    private ArrayList<Course> registeredCourses;
    public Student(String name,String registrationNumber,Finance AccountContext){
        this.name=name;
        this.registrationNumber=registrationNumber;
        this.helbAccount=AccountContext;
        this.registeredCourses=new ArrayList<>();
    }
    public void addCourse(Course newCourse){
        registeredCourses.add(newCourse);
    }
    public void displayStudentProfile() {
        System.out.println("=== Student Profile ===");
        System.out.println("Name: " + name);
        System.out.println("Reg No: " + registrationNumber);
        
        System.out.println("\n--- HELB Details ---");
        if (this.helbAccount instanceof Helbloan) {
            ((Helbloan) this.helbAccount).displayLoan();
        } else {
            this.helbAccount.displayDetails();
        }

        System.out.println("\n--- Academic Record ---");
        for (Course c : registeredCourses) {
            c.displayGrade(); // Uses the method you wrote in Course.java
        }
    }
}