package org.example;

import org.example.RepetitionInterfaces.IEngine;

import java.util.ArrayList;

// Generic can be any type of class that implements the IEngine interface.
public class EngineList<E extends IEngine> {
    ArrayList<E> ourList = new ArrayList<>();

    public void add(E item) {
        ourList.add(item);
    }
    public E get(int index) {
        return ourList.get(index);
    }

    public ArrayList<E> getOurList() {
        return ourList;
    }
}
