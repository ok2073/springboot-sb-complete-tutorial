package com.keelient;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        Doctor doctor = context.getBean(Doctor.class);
        doctor.assist();
        doctor.setQualification("MBBS");
        System.out.println(doctor);
        Doctor doctor1 = context.getBean(Doctor.class);
        System.out.println(doctor1);
       /* System.out.println(doctor.getQualification());
        System.out.println(doctor.getQualification2());*/
        //doctor.getNurse().assist();
        //Nurse nurse = context.getBean(Nurse.class);
        Nurse nurse = (Nurse)context.getBean("nurse");
        nurse.assist();

        System.out.println("\n");
        Staff staff = context.getBean(Doctor.class);
        staff.assist();
        staff = context.getBean(Nurse.class);
        staff.assist();
    }
}