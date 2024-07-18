package test.java.model;
import ecz.model.Student1;
import org.junit.Test;
import static org.junit.Assert.*;

public class Student1Test {
    private Student1 createStudent(int id, String name, String city, int marks1, int marks2, int marks3, int fee, boolean eligible) {
        Student1 student = new Student1();
        student.setStudentId(id);
        student.setStudentName(name);
        student.setCity(city);
        student.setMarks1(marks1);
        student.setMarks2(marks2);
        student.setMarks3(marks3);
        student.setFeePerMonth(fee);
        student.setEligibleForScholarship(eligible);
        return student;
    }

    @Test
    public void testGetAnnualFee() {
        Student1 student = new Student1();
        student.setFeePerMonth(1000);
        int annualFee = student.getAnnualFee();
        assertEquals(12000, annualFee);
    }

    @Test
    public void testGetTotalMarks() {
        Student1 student = new Student1();
        student.setMarks1(70);
        student.setMarks2(80);
        student.setMarks3(90);
        int totalMarks = student.getTotalMarks();
        assertEquals(240, totalMarks);
    }

    @Test
    public void testGetAverage() {
        Student1 student = new Student1();
        student.setMarks1(70);
        student.setMarks2(80);
        student.setMarks3(90);
        float average = student.getAverage();
        assertEquals(80.0, average, 0.001);
    }

    @Test
    public void testGetResult_Pass() {
        Student1 student = new Student1();
        student.setMarks1(70);
        student.setMarks2(80);
        student.setMarks3(90);
        String result = student.getResult();
        assertEquals("pass", result);
    }

    @Test
    public void testGetResult_Fail() {
        Student1 student = new Student1();
        student.setMarks1(70);
        student.setMarks2(50);
        student.setMarks3(90);
        String result = student.getResult();
        assertEquals("fail", result);
    }
    @Test
    public void testHighestTotalMarks() {
        Student1 studenta = createStudent(1, "Varshi", "New York", 70, 80, 90, 500, true);
        Student1 studentb = createStudent(2, "Likhi", "London", 60, 70, 65, 400, false);
        Student1 studentc = createStudent(3, "Venkat", "Chicago", 85, 75, 95, 450, true);

        Student1[] students = {studenta, studentb, studentc};

        Student1 highestTotalMarksStudent = students[0];
        for (Student1 student : students) {
            if (student.getTotalMarks() > highestTotalMarksStudent.getTotalMarks()) {
                highestTotalMarksStudent = student;
            }
        }

        assertEquals(studentc, highestTotalMarksStudent);
    }

    @Test
    public void testLeastMonthlyFee() {
        Student1 studenta = createStudent(1, "Varshi", "New York", 70, 80, 90, 500, true);
        Student1 studentb = createStudent(2, "Likhi", "London", 60, 70, 65, 400, false);
        Student1 studentc = createStudent(3, "Venkat", "Chicago", 85, 75, 95, 450, true);

        Student1[] students = {studenta, studentb, studentc};

        Student1 leastMonthlyFeeStudent = students[0];
        for (Student1 student : students) {
            if (student.getFeePerMonth() < leastMonthlyFeeStudent.getFeePerMonth()) {
                leastMonthlyFeeStudent = student;
            }
        }

        assertEquals(studentb, leastMonthlyFeeStudent);

    }

    @Test
    public void testScholarshipEligibility() {
        Student1 studenta = createStudent(1, "Varshi", "New York", 70, 80, 90, 500, true);
        Student1 studentb = createStudent(2, "Likhi", "London", 60, 70, 65, 400, false);
        Student1 studentc = createStudent(3, "Venkat", "Chicago", 85, 75, 95, 450, true);

        Student1[] students = {studenta, studentb, studentc};

        assertTrue(studenta.isEligibleForScholarship());
        assertFalse(studentb.isEligibleForScholarship());
        assertTrue(studentc.isEligibleForScholarship());
    }

    @Test
    public void testDisplayStudentDetails() {
        Student1 studenta = createStudent(1, "Varshi", "New York", 70, 80, 90, 500, true);
        Student1 studentb = createStudent(2, "Likhi", "London", 60, 70, 65, 400, false);
        Student1 studentc = createStudent(3, "Venkat", "Chicago", 85, 75, 95, 450, true);

        Student1[] students = {studenta, studentb, studentc};

        for (Student1 student : students) {
            System.out.println(student);
        }
    }

}
