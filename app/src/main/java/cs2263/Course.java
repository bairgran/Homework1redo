package cs2263;

public class Course {
    String deptName;
    int courseNumber;
    String courseName;
    int numberOfCredits;

    public Course(String deptName, int courseNumber, String courseName, int numberOfCredits) {
        this.deptName = deptName;
        this.courseNumber = courseNumber;
        this.courseName = courseName;
        this.numberOfCredits = numberOfCredits;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    @Override
    public String toString() {
        return String.format("%s %s, %s:%s", deptName, courseNumber, courseName, numberOfCredits);
    }
}
