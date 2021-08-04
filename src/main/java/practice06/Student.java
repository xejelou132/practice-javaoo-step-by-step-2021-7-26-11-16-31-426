package practice06;

public class Student extends Person{
    private Klass klass;

    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public String introduce() {
        return String.format(super.introduce() +" I am a Student. I am at Class %d.", klass.getNumber());
    }

    public Klass getKlass() {
        return klass;
    }
}
