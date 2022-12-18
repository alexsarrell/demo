package com.example.demo;

public class Guitar {
    int stringCount;
    GuitarType type;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Guitar(int stringCount, GuitarType type, String name) {
        this.stringCount = stringCount;
        this.type = type;
        this.name = name;
    }

    public int getStringCount() {
        return stringCount;
    }

    public void setStringCount(int stringCount) {
        this.stringCount = stringCount;
    }

    public GuitarType getType() {
        return type;
    }

    public void setType(GuitarType type) {
        this.type = type;
    }
}
