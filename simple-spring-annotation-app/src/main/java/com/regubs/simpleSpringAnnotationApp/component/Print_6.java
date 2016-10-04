package com.regubs.simpleSpringAnnotationApp.component;

import com.regubs.simpleSpringAnnotationApp.component.figure.Figure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by Renat_Gubaidullin on 10/2/2016.
 */

// bean of this class is being created in AnnotationConfigurationClass (javaconfig)
public class Print_6 {

    private Figure figure;

    public Print_6(Figure figure) {
        this.figure = figure;
        System.out.println("Bean print is being created");
    }

    public void showSquare() {
        System.out.println("Square of " + this.figure.getName() + " is " + this.figure.square());
    }
}