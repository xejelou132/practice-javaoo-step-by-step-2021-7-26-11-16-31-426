package practice04;

public class Student  extends Person{
    private int klass;
    public Student(String name, int age , int Klass) {
        super(name, age);
        this.klass = Klass;
    }

    public int getKlass() {
        return klass;
    }

    public String introduce() {
      return String.format(super.introduce() +" I am a Student. I am at Class %d.", klass);
    }
}
