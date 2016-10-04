package com.regubs.simpleSpringAnnotationApp.component.figure;

/**
 * Created by Renat_Gubaidullin on 10/2/2016.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class RightTriangle_3 extends Figure {
    private int cathetus_1;
    private int cathetus_2;



    public RightTriangle_3(String name, int cathetus_1,int cathetus_2) {
        super(name);
        this.cathetus_1 = cathetus_1;
        this.cathetus_2 = cathetus_2;
    }

    public double square() {
        return this.cathetus_1*this.cathetus_2/2;
    }
}
