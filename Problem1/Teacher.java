package Problem1;

public class Teacher extends Person {
    protected String mySubject; 
    protected double mySalary;

    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);
        mySubject = subject;
        mySalary = salary;
    }

    public double getMySalary() {
        return mySalary;
    }

    public String getMySubject() {
        return mySubject;
    }

    public void setMySalary(double mySalary) {
        this.mySalary = mySalary;
    }

    public void setMySubject(String mySubject) {
        this.mySubject = mySubject;
    }
    public String toString()
    {
        return super.toString() + "Subject: " + mySubject + "Annual Salary: " + mySalary;
     }

    
    
}
