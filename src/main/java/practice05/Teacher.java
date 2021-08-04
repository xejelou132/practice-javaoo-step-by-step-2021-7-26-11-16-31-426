package practice05;

public class Teacher extends Person{
    private int klass;

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public int getKlass() {
        return klass;
    }

    public String introduce() {
        if(klass == 0){
            return buildString() + ". I teach No Class.";
        }
        return String.format(buildString()+". I teach Class %d.", klass);
    }

    private String buildString() {
        return super.introduce() + " I am a Teacher";
    }

}

