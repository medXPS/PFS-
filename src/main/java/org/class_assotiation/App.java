package org.class_assotiation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args)   {
//        org.class_assotiation.csv.outputhelper outputGenerator = new org.class_assotiation.csv.outputhelper();
//        outputGenerator.generateOutput();

//        Scanner scanner = new Scanner(new File("src/main/java/org/class_assotiation/config.txt"));
//        String outPutClassName = scanner.next();
//        Class outputGenerator = Class.forName(outPutClassName);
//        IOutputGenerator output = (IOutputGenerator) outputGenerator.newInstance();
//        outputhelper outputhelper = new outputhelper();
//        outputhelper.setOutputGenerator(output);
//        outputhelper.generateOutput();

        ApplicationContext context =
                new ClassPathXmlApplicationContext( "spring-Common.xml");
        outputhelper output = (outputhelper) context.getBean("outputhelper");
        output.generateOutput();




    }
}
