package com.regubs.simpleSpringAnnotationApp.component;

import com.regubs.simpleSpringAnnotationApp.component.figure.Figure;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by Renat_Gubaidullin on 10/3/2016.
 */
@Component
public class Print_4 {

    //dependency injection by name of bean with prototype scope type
    @Resource(name = "rightTriangle_2")
    private Figure figure;

    public Print_4() {System.out.println("Bean print_4 is being created");}

    public void showSquare()  {
        this.figure.setTest("fromPrint_4");
        System.out.println("4. Square of " + this.figure.getName() + " is " + this.figure.square() + "  Test is " + this.figure.getTest());
    }

}