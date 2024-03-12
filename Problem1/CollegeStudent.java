package Problem1;

public class CollegeStudent extends Student {

    protected String myMajor;
    protected int myYear;


    public CollegeStudent(String name, int age, String gender, String idNum, double gpa,  int year, String major) {
        super(name, age, gender, idNum, gpa);
        myMajor = major;
        myYear = year;
    }
    public void setMyMajor(String myMajor) {
        this.myMajor = myMajor;
    }

    public void setMyYear(int myYear) {
        this.myYear = myYear;
    }

    public String getMyMajor() {
        return myMajor;
    }

    public int getMyYear() {
        return myYear;
    }

    @Override
    public String toString() {
        return super.toString() + " Major: " + myMajor + " Year: " + myYear;
    }
}
