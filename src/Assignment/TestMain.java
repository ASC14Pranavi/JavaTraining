package Assignment;

public class TestMain {
    public static void main(String[] args) {
        // Creating three Student objects
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        // Populating the objects using the setter methods
        student1.setStudentId(1);
        student1.setStudentName("Varshi");
        student1.setCity("New York");
        student1.setMarks1(70);
        student1.setMarks2(80);
        student1.setMarks3(90);
        student1.setFeePerMonth(500);
        student1.setEligibleForScholarship(true);

        student2.setStudentId(2);
        student2.setStudentName("Likhi");
        student2.setCity("London");
        student2.setMarks1(60);
        student2.setMarks2(70);
        student2.setMarks3(65);
        student2.setFeePerMonth(400);
        student2.setEligibleForScholarship(false);

        student3.setStudentId(3);
        student3.setStudentName("Venkat");
        student3.setCity("Chicago");
        student3.setMarks1(85);
        student3.setMarks2(75);
        student3.setMarks3(95);
        student3.setFeePerMonth(450);
        student3.setEligibleForScholarship(true);

        // Finding the Student with the highest total marks
        Student highestMarksStudent = student1;
        if (student2.getTotalmarks() > highestMarksStudent.getTotalmarks()) {
            highestMarksStudent = student2;
        }
        if (student3.getTotalmarks() > highestMarksStudent.getTotalmarks()) {
            highestMarksStudent = student3;
        }
        System.out.println("Student with the highest total marks: " + highestMarksStudent.getStudentName());
        //Finding least paid students
        Student leastpayee = student1;
        if(student1.getFeePerMonth()>leastpayee.getFeePerMonth()){
            leastpayee=student2;
        }
        if(student3.getFeePerMonth()> leastpayee.getFeePerMonth()){
            leastpayee=student3;
        }
        System.out.println(" Student who pays the least monthly fee:"+leastpayee.getStudentName()+leastpayee.getFeePerMonth());
        Student[] students = {student1, student2, student3};
        for(Student student:students){
            System.out.println("Name: " + student.getStudentName());
            System.out.println("Total Marks: " + student.getTotalmarks());
            System.out.println("Average Marks: " + student.getAverage());
            System.out.println("Result: " + student.getResult());
            if (student.isEligibleForScholarship()) {
                System.out.println("Scholarship: Scholarship available");
            } else {
                System.out.println("Scholarship: Scholarship not available");
            }

            System.out.println();


        }
    }
}
