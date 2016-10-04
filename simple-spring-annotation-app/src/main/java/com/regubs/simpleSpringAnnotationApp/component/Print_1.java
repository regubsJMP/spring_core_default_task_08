package com.regubs.simpleSpringAnnotationApp.component;

import com.regubs.simpleSpringAnnotationApp.component.figure.Figure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by Renat_Gubaidullin on 10/2/2016.
 */

@Component
public class Print_1 {

    private Figure figure;

    //dependency injection by setter
    @Autowired
    @Qualifier("rightTriangle")
    public void setFigure(Figure figure) {
        this.figure = figure;
    }

    public Print_1() {
        System.out.println("Bean print_1 is being created");
    }

    public void showSquare() {
        System.out.println("Square of " + this.figure.getName() + " is " + this.figure.square());
    }
}