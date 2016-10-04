package com.regubs.simpleSpringAnnotationApp.execute;

import com.regubs.simpleSpringAnnotationApp.component.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Execute {
    public static void main(String [] args) {
        //ApplicationContext javaContext = new JavaConfi
        //ApplicationContext context_1 = new AnnotationConfigApplicationContext(AnnotationConfigurationClass.class);
        ApplicationContext javaContext = new AnnotationConfigApplicationContext(AnnotationConfigurationClass.class);

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Print print = (Print) context.getBean("print");
        print.showSquare();

        Print_1 print_1 = (Print_1) context.getBean("print_1");
        print_1.showSquare();

        Print_2 print_2 = (Print_2) context.getBean("print_2");
        print_2.showSquare();

        Print_3 print_3 = (Print_3) context.getBean("print_3");
        print_3.showSquare();

        //using different RightTriangle_2 bean scope for beans print_4 and print_5
        Print_4 print_4 = (Print_4) context.getBean("print_4");
        print_4.showSquare();

        Print_5 print_5 = (Print_5) context.getBean("print_5");
        print_5.showSquare();

        //using java configuration class
        Print_6 print_6 = (Print_6) javaContext.getBean("print_6");
        print_6.showSquare();
    }
}