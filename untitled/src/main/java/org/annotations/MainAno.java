package org.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAno {
    public static void  main(String[] args )throws InterruptedException{
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(EtudConfig.class);
        Etudiant et=(Etudiant)app.getBean("etudiant", Etudiant.class);
        System.out.println(et);

        et=(Etudiant)app.getBean("etudiant");
        et.getNom();
        et.getAge();
        System.out.println(et);


        app.close();
    }

}
