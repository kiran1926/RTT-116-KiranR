package org.perscholas.Module_303_9;

public class Student {
    private int studentID;
    private String firstname;
    private String lastName;
    private String studentEmail;
    private int studentPhone;

    public Student (int studentID, String firstname, String lastName, String studentEmail, int studentPhone){
        this.studentID =studentID;
        this.firstname = firstname;
        this.lastName = lastName;
        this.studentEmail =studentEmail;
        this. studentPhone =studentPhone;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public int getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(int studentPhone) {
        this.studentPhone = studentPhone;
    }
//
//    public static void main( String args[]){
//        Student s1 = new Student();
//        s1.setStudentID(1);
//        s1.setFirstname("Michael");
//        s1.setLastName("Gabriel");
//        s1.setStudentEmail("mgabriel@perscholas.org");
//        s1.setStudentPhone(6689852324);
//    }
}
