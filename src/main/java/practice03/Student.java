package practice03;

public class Student extends Person {
    private int klass;
    public Student(String name, int age , int Klass) {
        super(name, age);
        this.klass = Klass;
    }

    public int getKlass() {
        return klass;
    }

    public String introduce() {
        return String.format("I am a Student. I am at Class %d.", klass);
    }
}
