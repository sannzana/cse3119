package com.example.labtestpractice;

public class Color {
    protected String name;

    public Color(String name) {
        this.name = name;
    }

    public void showColor() {
        System.out.println("The color is: " + name);
    }
}

class Red extends Color {
    public Red() {
        super("Red");
    }
}

class Blue extends Color {
    public Blue() {
        super("Blue");
    }
}

class Green extends Color {
    public Green() {
        super("Green");
    }
}

