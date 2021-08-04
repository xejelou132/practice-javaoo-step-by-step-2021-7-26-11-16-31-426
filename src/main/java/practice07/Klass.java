package practice07;

public class Klass {
    private int number;
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
        this.student = student;
        return this;
    }

    public Student getLeader() { return student; }

}
