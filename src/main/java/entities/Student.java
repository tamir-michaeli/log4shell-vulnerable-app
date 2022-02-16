package entities;

import java.util.List;

public class Student {
    private String name;
    private String surename;
    private int age;
    private List<String> classes;

    public Student(String name, String surename, int age, List<String> classes) {
        this.name = name;
        this.surename = surename;
        this.age = age;
        this.classes = classes;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student:" + "name='" + name + '\'' +
                ", surename='" + surename + '\'' +
                ", age=" + age +
                ", classes=" + classes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getClasses() {
        return classes;
    }

    public void setClasses(List<String> classes) {
        this.classes = classes;
    }

    public String getFullName() {
        return name + " " + surename;
    }
}
