package com.hsb.demo.enums;

/**
 * Created by Bin on 2014/12/12.
 */
public enum JobEnums {

    TEACHER("TEACHER"),STUDENT("STUDENT");

    private String type;
    public String getType() {
        return type;
    }

    JobEnums(String type) {
        this.type = type;
    }

}

