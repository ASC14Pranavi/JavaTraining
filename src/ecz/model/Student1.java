package ecz.model;

public class Student1 {
    int studentId;
    String studentName;
    String city;
    int marks1;
    int marks2;
    int marks3;
    float feePerMonth;
    boolean isEligibleForScholarship;
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getMarks1() {
        return marks1;
    }

    public void setMarks1(int marks1) {
        this.marks1 = marks1;
    }

    public int getMarks2() {
        return marks2;
    }

    public void setMarks2(int marks2) {
        this.marks2 = marks2;
    }

    public int getMarks3() {
        return marks3;
    }

    public void setMarks3(int marks3) {
        this.marks3 = marks3;
    }

    public float getFeePerMonth() {
        return feePerMonth;
    }

    public void setFeePerMonth(float feePerMonth) {
        this.feePerMonth = feePerMonth;
    }
    //for boolean field we can use is instead of get and setter method
    public boolean isEligibleForScholarship() {
        return isEligibleForScholarship;
    }
    //here isEligibleForScholarship is used as eligibleForScholarship to avoid explicitly
    //declaring this
    public void setEligibleForScholarship(boolean eligibleForScholarship) {
        isEligibleForScholarship = eligibleForScholarship;
    }
    public int getAnnualFee(){
        return (int)feePerMonth*12;
    }
    public int getTotalMarks(){
        return (int)marks1+marks2+marks3;
    }
    public float getAverage(){
        return (float)(marks1+marks2+marks3/3.0f);
    }
    public String getResult(){
        if (marks1>60 && marks2>60 && marks3>60){
            return "pass";
        }else{
            return "fail";
        }

    }

}
