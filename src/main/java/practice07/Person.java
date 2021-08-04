package practice07;

import java.util.Objects;

public class Person {
    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && age == person.age && Objects.equals(name, person.name);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() { return id; }

    public String introduce() {
        return String.format("My name is %s. I am %d years old.", name, age);
    }


}
