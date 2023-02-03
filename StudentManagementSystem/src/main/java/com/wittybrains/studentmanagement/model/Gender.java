
package com.wittybrains.studentmanagement.model;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;


public enum Gender {
    MALE("male"),
    FEMALE("female"),
    OTHER("other");

    private final String value;

    Gender(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}


