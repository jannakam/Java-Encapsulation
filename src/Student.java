public class Student {
    private String name;
    private int age;
    private double gpa;

    //for testing purposes
    Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return this.name + " is " + this.age + " years old, and has a gpa of " + this.gpa;
    }

    //gpa status getter
    public String getGpaStatus() {
        String status = "";
        if (gpa > 3 && gpa <= 4) {
            status =  "Excellent!";
        }
        else if (gpa >= 2 && gpa <= 3) {
            status = "Good.";
        }
        else if (gpa < 2 && gpa >= 0) {
            status = "Needs Improvement.";
        }
        else {
            status = "Error: GPA is out of range";
        }
        return status;
    }
    //gpa setter checking range
    //decided to set gpa to -1 so that we can allow gpas of 0 in the status check, and the error message can be handled there
    public void setGpa(double gpa) {
        if (!(gpa >= 0 && gpa <= 4)) {
            this.gpa = -1;
        }
    }

    //remaining setters and getters

    //getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
