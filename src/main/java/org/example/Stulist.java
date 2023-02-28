package org.example;

import java.util.*;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Stulist {

    private String name;
    private int age;
    private double gpa;

    Stulist(String name, int age, double gpa)
    {
        setter(name,age,gpa);


    }

    public String getname()
    {
        return name;
    }
    public int getage()
    {
        return age;
    }
    public double getgpa()
    {
        return gpa;
    }

    void setter(String name,int age,double gpa)
    {
        this.name=name;
        this.age=age;
        this.gpa=gpa;

    }
}
