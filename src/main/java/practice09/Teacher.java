package practice09;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import static practice09.Klass.isIn;

public class Teacher extends Person {
    private Klass klass;
    private List<Klass> classes = new ArrayList<>();

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> linkedList) {
        super(id, name, age);
        this.classes = linkedList;
    }

    public Klass getKlass() {
        return klass;
    }

    public List<Klass> getClasses() {
        return classes;
    }


        public String introduce(){
            if(classes.isEmpty()){
                return buildString() + " No Class.";
            }
            return String.format(buildString() +" Class "+getClassNumbers()+".");
        }

    private String buildString() {
        return super.introduce() + " " + "I am a Teacher. I teach";
    }

    public String introduceWith(Student student) {
        String teachStudent = isIn(classes, student)
                ? "I teach"
                : "I don't teach";

        return super.introduce()
                + " I am a Teacher. "
                + teachStudent
                + " "
                + student.getName()
                + ".";
    }

    private String getClassNumbers() {
        return classes.stream()
                .map(Klass::getNumber)
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
    }

    public boolean isTeaching(Student student) {
        return isIn(classes, student);
    }
}