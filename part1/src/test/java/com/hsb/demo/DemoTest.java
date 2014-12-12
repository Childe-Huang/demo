package com.hsb.demo;

import com.hsb.demo.enums.JobEnums;
import com.hsb.demo.model.Person;
import org.junit.Test;

/**
 * Created by Bin on 2014/12/12.
 */
public class DemoTest {

    @Test
    public void print() {
        Person jack = new Person("Jack", 20);
        jack.setJob(JobEnums.TEACHER.getType());
        System.out.println(jack.getName() + " is a " + jack.getJob() + ", " + jack.getAge() + " years old.");
    }
}
