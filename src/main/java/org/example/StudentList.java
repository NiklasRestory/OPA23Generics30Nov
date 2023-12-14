package org.example;

import java.util.ArrayList;

// T must be or inherit from Student.
public class StudentList<T extends Student> {
    ArrayList<T> studentList = new ArrayList<>();

    public void add(T item) {
        studentList.add(item);
    }
    public T get(int index) {
        return studentList.get(index);
    }

    public ArrayList<T> getOurList() {
        return studentList;
    }
}
