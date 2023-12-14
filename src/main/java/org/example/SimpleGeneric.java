package org.example;

// To specify that a class needs a Generic,
// write <> after the name of the class and
// then write the name of the Generic within
// the <>
public class SimpleGeneric<Type> {
    // Every time we uses the name of the Generic as a variable-type
    // in the code of the class will then be replaced with said
    // variable-type.
    // For instance, is someone creates a SimpleGeneric<String>,
    // then it will save a String item here.
    Type item;

    // This function takes a different kind of parameter depending
    // on. For instance, in a SimpleGeneric<String> this function
    // takes a String as a parameter.
    public void setItem(Type item) {
        this.item = item;
    }

    // This function returns a different type depending on.
    // For instance, in a SimpleGeneric<String> this function
    // returns a String.
    public Type getItem() {
        return item;
    }
}
