package com.regubs.simpleSpringAnnotationApp.component;

import com.regubs.simpleSpringAnnotationApp.component.figure.Figure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by Renat_Gubaidullin on 10/3/2016.
 */
@Component
public class Print_3 {

   //dependency injection by name
    @Resource(name = "rightTriangle_1")
    private Figure figure;

    public Print_3() {System.out.println("Bean print_3 is being created");}

    public void showSquare() {
        System.out.println("Square of " + this.figure.getName() + " is " + this.figure.square());
    }
}