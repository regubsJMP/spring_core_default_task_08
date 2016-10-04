package com.regubs.simpleSpringAnnotationApp.component.figure;

/**
 * Created by Renat_Gubaidullin on 10/2/2016.
 */

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.io.FileInputStream;

@Component
public class Circle extends Figure {
    private int radius;
    public static double PI = 3.1415;

    //dependency injection by constructor
    @Autowired
    //using Property file to get values (property-placeholder file location is set in beans.xml)
    public Circle(@Value("${circleName}") String name, @Value("${circleRadius}") int radius) {
        super(name);
        this.radius = radius;
    }

    public double square() {
        return PI*this.radius*this.radius;
    }
}
