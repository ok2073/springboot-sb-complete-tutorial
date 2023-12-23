package com.keelient;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Scope(scopeName = "prototype")
public class Doctor implements Staff, BeanNameAware {

    private String qualification;
   /*
    private String qualification2;*/
    //private Nurse nurse;

   /* public Doctor(String qualification2) {
        this.qualification2 = qualification2;
    }
*/
    public void assist() {
        System.out.println("Doctor is assisting");
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

   /* public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }*/

    /*public String getQualification2() {
        return qualification2;
    }

    public void setQualification2(String qualification2) {
        this.qualification2 = qualification2;
    }*/

    @Override
    public String toString() {
        return "Doctor{" +
                "qualification='" + qualification + '\'' +
                '}';
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Set Bean name method is called: " + name);
    }
    @PostConstruct
    public void postConstuct() {
        System.out.println("Post Construct method is called");
    }
}
