package practice08;

public class Student extends Person{
    private Klass klass;

    public Student(int id, String name, int age) {
        super(id, name, age);
    }

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        if(klass.getLeader() != null) {
            return String.format(super.introduce() + " I am a Student. I am Leader of %s.", klass.getDisplayName());
        }
        return String.format(super.introduce() +" I am a Student. I am at %s.", klass.getDisplayName());
    }
}
