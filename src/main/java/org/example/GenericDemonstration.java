package org.example;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.HashMap;

public class GenericDemonstration {

    public void run() {
        // Generics is a variable in a class that will be replaced with
        // whatever we specify when we create an object in that class.
        // An example of something that uses a Generic is ArrayList and
        // all other collections. When we specify what the Generic is,
        // we specify what type is contained within the list.
        ArrayList<Integer> intArrayList = new ArrayList<>();
        intArrayList.add(3);
        intArrayList.add(7);
        intArrayList.add(1);
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("fgr4");
        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(new Student(1,"",32,""));

        // HashMap uses two generics, separated by comma.
        HashMap<String, String> hashMap = new HashMap<>();

        SimpleGeneric<Integer> integerSimpleGeneric = new SimpleGeneric<>();
        integerSimpleGeneric.setItem(5);
        int resultInt = integerSimpleGeneric.getItem();
        System.out.println("We got " + resultInt);

        SimpleGeneric<String> stringSimpleGeneric = new SimpleGeneric<>();
        stringSimpleGeneric.setItem("a string");
        String resultString = stringSimpleGeneric.getItem();
        System.out.println("We got " + resultString);

        SimpleGeneric<Student> studentSimpleGeneric = new SimpleGeneric<>();
        studentSimpleGeneric.setItem(new Student(4, "Jim", 34, "Male"));
        Student resultStudent = studentSimpleGeneric.getItem();
        System.out.println("We got " + resultStudent);

        GenericList<Student> studentList = new GenericList<>();
        studentList.add(new Student(2, "Jim", 23, "Male"));
        studentList.add(new Student(4, "Luna", 43, "Female"));
        studentList.add(new Student(6, "Ford", 4, "Car"));

        String studentListJson = studentList.getJson();
        System.out.println("Got " + studentListJson);

        String studentJson = toJson(studentList.get(1));
        System.out.println("A student: " + studentJson);

        StudentList<Student> studentStudentList = new StudentList<>();
        studentStudentList.add(new Student(1, "", 1, ""));
        StudentList<LIAStudent> liaStudentStudentList = new StudentList<>();
        liaStudentStudentList.add(new LIAStudent(2, "", 3, "", ""));

        //StudentList<String> stringStudentList = new StudentList<>();

        print(intArrayList);
    }

    public void print(ArrayList<?> tList) {
        for(int i = 0; i < tList.size(); i++) {
            System.out.println(tList.get(i));
        }
    }

    public <T> String toJson(T item) {
        Gson gson = new Gson();
        return gson.toJson(item);
    }

    /*public <T> T fromJson(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, T);
    }*/
}
