package day20statickeywordconstructors;

public class Teacher {
    String name;
    int age;
    String address;

    public Teacher(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;

    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public Teacher(int age, String address) {
        this.age = age;
        this.address = address;
    }
}