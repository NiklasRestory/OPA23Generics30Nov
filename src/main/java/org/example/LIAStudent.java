package org.example;

public class LIAStudent extends Student {
    private String company;


    public LIAStudent(int id, String name, int age, String gender, String company) {
        super(id, name, age, gender);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
