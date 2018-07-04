package com.bs.rest.model;

public class ContentMatch {

    private String pattern;

    private String value;

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ContentMatch [pattern=" + pattern + ", value=" + value + "]";
    }

}
