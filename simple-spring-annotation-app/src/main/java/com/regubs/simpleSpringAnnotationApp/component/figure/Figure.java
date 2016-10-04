package com.regubs.simpleSpringAnnotationApp.component.figure;

/**
 * Created by Renat_Gubaidullin on 10/2/2016.
 */


public abstract class Figure {
    private String name;
    private String test = "DefaultValue";

    public void setTest(String test) {
        this.test = test;
    }
    public String getTest() {
        return this.test;
    }


    public void setName(String name) {
        this.name = name;
    }

    public Figure(String name) {
        this.name = name;
        System.out.println("Bean " + name + " has been created");
    }

    public String getName() {
        return this.name;
    }


    public abstract double square();
}