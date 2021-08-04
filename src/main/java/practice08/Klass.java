package practice08;


import java.util.Collections;

public class Klass {
    private int number;
    private School school;
    public Student student;

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName(){
        return "Class " + number;
    }

    public Klass assignLeader(Student student) {
        if(isStudentNotFromSchool()){
            System.out.print("It is not one of us.\n");
        }
        else {
            this.student = student;
        }
        return this;
    }

    private boolean isStudentNotFromSchool() {
        return school == null;
    }

    public Student getLeader() { return student; }

    public void appendMember(Student student) {
        school = new School(Collections.singletonList(student));
    }
}
