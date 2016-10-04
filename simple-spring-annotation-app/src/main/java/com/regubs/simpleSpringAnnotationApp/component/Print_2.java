package com.regubs.simpleSpringAnnotationApp.component;

import com.regubs.simpleSpringAnnotationApp.component.figure.Figure;
import com.regubs.simpleSpringAnnotationApp.component.figure.Rectangle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Renat_Gubaidullin on 10/2/2016.
 */

@Component
public class Print_2 {

    private Figure figure;

    //dependency injection by constructor
    @Autowired(required=true)
    public Print_2( @Qualifier("rectangle") Figure figure) {
        System.out.println("Bean print_2 is being created");
        this.figure = figure;
    }

    public void showSquare() {
        System.out.println("Square of " + this.figure.getName() + " is " + this.figure.square());
    }
}