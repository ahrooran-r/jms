package jms._2_anatomy.util;

import java.io.Serializable;

public class School implements Serializable {
    String name;
    int peopleStudy;
    short teachers;

    public School(String name, int peopleStudy, short teachers) {
        this.name = name;
        this.peopleStudy = peopleStudy;
        this.teachers = teachers;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", peopleStudy=" + peopleStudy +
                ", teachers=" + teachers +
                '}';
    }
}
