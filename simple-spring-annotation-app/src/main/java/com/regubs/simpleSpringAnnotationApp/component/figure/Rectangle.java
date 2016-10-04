package com.regubs.simpleSpringAnnotationApp.component.figure;

/**
 * Created by Renat_Gubaidullin on 10/2/2016.
 */

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

//@Component
public class Rectangle extends Figure {
    private int length;
    private int width;

    //@Autowired
    //public Rectangle(@Value("rectangle") String name, @Value("5") int length, @Value("5") int width) {
    public Rectangle(String name, int length, int width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    public double square() {
        return this.length*this.width;
    }
}