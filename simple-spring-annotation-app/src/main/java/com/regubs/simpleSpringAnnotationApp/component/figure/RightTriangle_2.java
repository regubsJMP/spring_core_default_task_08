package com.regubs.simpleSpringAnnotationApp.component.figure;

/**
 * Created by Renat_Gubaidullin on 10/2/2016.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
//using prototype scope type to provide different oblext instances for other different beans which use RightTriangle_2 objects.
@Component
@Scope("prototype")
public class RightTriangle_2 extends Figure {
    private int cathetus_1;
    private int cathetus_2;
    private String test;

    @Autowired
    public RightTriangle_2(@Value("RightTriangle") String name, @Value("5") int cathetus_1, @Value("6") int cathetus_2) {
        super(name);
        this.cathetus_1 = cathetus_1;
        this.cathetus_2 = cathetus_2;
    }

    public double square() {
        return this.cathetus_1*this.cathetus_2/2;
    }
}
