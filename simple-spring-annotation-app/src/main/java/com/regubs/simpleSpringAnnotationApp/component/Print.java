package com.regubs.simpleSpringAnnotationApp.component;

import com.regubs.simpleSpringAnnotationApp.component.figure.Figure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Created by Renat_Gubaidullin on 10/2/2016.
 */

@Component
public class Print {

    //dependency injection by field
    @Autowired
    @Qualifier("circle")
    private Figure figure;

    public Print() {
        System.out.println("Bean print is being created");
    }

    public void showSquare() {
        System.out.println("Square of " + this.figure.getName() + " is " + this.figure.square());
    }
}