package com.sushma.assignments3;

public class Staff extends Person {
    private String school;
    private double pay;
    Person p2=new Person();
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Staff{" + p2.toString() +
                "school='" + school + '\'' +
                ", pay=" + pay +
                '}';
    }
}
