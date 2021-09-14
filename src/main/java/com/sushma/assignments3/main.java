package com.sushma.assignments3;
import com.sushma.assignments3.Student;
import com.sushma.assignments3.Person;
import com.sushma.assignments3.Staff;
public class main {
    public static void main(String[] args) {
        Person[] people = {
                new Student("Shyam", "Bangalore, Karnataka", "Java fundamentals", 2010, 4500.0),
                new Staff("Anand", "Bangalore, Karnataka", "Delhi Public school", 35000.0),
                new Staff("Umesh", "Bangalore, Karnataka", "National Public school", 42000.0),
                new Student("Suresh", "Hassan, Karnataka", "Java fundamentals", 2012, 4750.0),
                new Student("Kiran", "Vasco, Goa", "Reactjs", 2017, 12500.0)
        };
        System.out.println(((Student)people[0]).toString());
        System.out.println(((Staff)people[1]).toString());
        System.out.println(((Staff)people[2]).toString());
        System.out.println(((Student)people[3]).toString());
        System.out.println(((Student)people[4]).toString());
    }
}
