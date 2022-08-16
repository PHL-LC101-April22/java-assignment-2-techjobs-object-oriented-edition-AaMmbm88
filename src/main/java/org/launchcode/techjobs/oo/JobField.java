package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {
    private int id;
    private static int nextId = 1;
    private String aValue = "OOPS! This job does not seem to exist.";

    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField(String aValue) {
        this();
        this.aValue = aValue;
    }
    public int getId() {
        return id;
    }

    public String getAValue() {
        return aValue;
    }

    public void setAValue(String aValue) {
        this.aValue = aValue;
    }

    @Override
    public String toString() {
        return aValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobField)) return false;
        JobField that = (JobField) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
