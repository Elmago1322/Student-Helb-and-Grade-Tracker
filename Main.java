import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Helbloan myLoan=new Helbloan(50000,"13-06-2026","Pending Record Update");
        Student student1=new Student("James Ham","BSIT/024J/2025",myLoan);
        boolean isRunning=true;
        while(isRunning){
            System.out.print("\n===STUDENT GRADE & HELB TRACKERR===");
            System.out.print("\n1.Add a course and Grade."); 
            System.out.print("\n2.Make Helb Payments."); 
            System.out.print("\n3.View Full profile."); 
            System.out.print("\n4.Exit Tracker."); 
            System.out.print("\nChoose an option: "); 
            int choice=input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter unit name: ");
                    String name = input.nextLine();
                    System.out.print("Enter unit code: ");
                    String code = input.nextLine();
                    System.out.print("Enter score: ");
                    double score = input.nextDouble();
                    
                    // We package the input directly into a new Course and add it
                    student1.addCourse(new Course(name, code, score));
                    System.out.println("Course added successfully!");
                    break;

                case 2:
                    System.out.print("Enter payment amount: Ksh. ");
                    double payment = input.nextDouble();
                    myLoan.applyPayment(payment);
                    break;

                case 3:
                    student1.displayStudentProfile();
                    break;

                case 4:
                    System.out.println("Exiting Tracker. Goodbye!");
                    isRunning = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        
        input.close(); // Always close your scanner when done!
    }
}