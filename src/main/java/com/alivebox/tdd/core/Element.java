package com.alivebox.tdd.core;

/**
 * Represents an expression element.
 */
public class Element {

    private String value;

    public Element(String argValue) {
        this.value = argValue;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
