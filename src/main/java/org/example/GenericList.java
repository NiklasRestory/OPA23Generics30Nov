package org.example;

import com.google.gson.Gson;
import org.example.RepetitionInterfaces.Engine;

import java.util.ArrayList;

// A potential use of a Generic is to expand on the functionality
// of an existing class that takes a Generic.
public class GenericList<E> {
    // For instance, say there's an ArrayList function we want but it doesn't exist.
    ArrayList<E> ourList = new ArrayList<>();

    // We can use this GenericList as a replacement. We make sure
    // to implement all the functions that we want to use with the
    // ArrayList normally.
    public void add(E item) {
        ourList.add(item);
    }
    public E get(int index) {
        return ourList.get(index);
    }

    public ArrayList<E> getOurList() {
        return ourList;
    }

    // Then we can implement the additional functionality
    // we wish an ArrayList had. Like, returning the whole
    // ArrayList as a JSon. That's pretty cool.
    public String getJson() {
        Gson gson = new Gson();
        return gson.toJson(ourList);
    }

    public void fromJson(String json) {
        Gson gson = new Gson();
        Engine something = gson.fromJson(json, Engine.class);
    }

    public ArrayList<Painting> getAllPaintings() {
        ArrayList<Painting> paintings = new ArrayList<>();
        for (E e: ourList) {
            if (e instanceof Painting) {
                paintings.add((Painting) e);
            }
        }
        return paintings;
    }
}
