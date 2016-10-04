package com.regubs.simpleSpringAnnotationApp.component;
import com.regubs.simpleSpringAnnotationApp.component.figure.RightTriangle_3;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
/**
 * Created by Renat_Gubaidullin on 10/3/2016.
 */

@Configuration
public class AnnotationConfigurationClass {
    @Bean
    public RightTriangle_3 rightTriangle_3() {
        return new RightTriangle_3("rightTriangle_3", 4, 8);
    }

    @Bean
    public Print_6 print_6(){
        return new Print_6(rightTriangle_3());
    }

}
