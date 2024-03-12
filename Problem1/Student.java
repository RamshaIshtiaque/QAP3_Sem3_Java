package Problem1;

public class Student extends Person {
    protected String myIdNum; // Student Id Number 
    protected double myGPA; // grade point average

    public Student(String name, int age, String gender, String idNum, double gpa) {
        super(name, age, gender);
    
        myIdNum = idNum;
        myGPA = gpa;
    }

    public double getMyGPA() {
        return myGPA;
    }

    public String getMyIdNum() {
        return myIdNum;
    }

    public void setMyGPA(double myGPA) {
        this.myGPA = myGPA;
    }

    public void setMyIdNum(String myIdNum) {
        this.myIdNum = myIdNum;
    }

    public String toString()
     {
        return super.toString() + " ID: " + myIdNum + " GPA: " + myGPA;
     }
}

