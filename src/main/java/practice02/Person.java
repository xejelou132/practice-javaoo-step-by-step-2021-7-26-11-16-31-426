package practice02;

public class Person {

    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String introduce() {
        return "My name is " +name+ ". I am " +age+" years old.";
    }
}
