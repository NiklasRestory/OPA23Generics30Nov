package org.example;

public class LIAStudent extends Student {
    private String company;
    private String something;


    public LIAStudent(int id, String name, int age, String gender, String company) {
        super(id, name, age, gender);
        this.company = company;
    }
    // This is a change done by someone else in my team.

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
