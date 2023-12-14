package org.example;

public class Student {
    private int Id;
    private String name;
    private int age;
    private String gender;

    public Student(int id, String name, int age, String gender) {
        Id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return  "Id=" + Id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
