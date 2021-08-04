package practice06;

public class Teacher extends Person{
    private Klass klass;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce(){
        if(klass == null){
            return buildString() + " No Class.";
        }
        return String.format(buildString() +" Class %d.", klass.getNumber());
    }

    private String buildString() {
        return super.introduce() + " " + "I am a Teacher. I teach";
    }

    public String introduceWith(Student student){
        if(student.getKlass().getNumber() == klass.getNumber()){
            return String.format(buildString() +" %s.", student.getName());
        }
        return String.format(super.introduce() +" I am a Teacher. I don't teach %s.", student.getName());
    }
}
