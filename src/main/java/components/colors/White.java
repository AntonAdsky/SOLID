package components.colors;

import interfaces.Color;

public class White implements Color {
    String color = "White";

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void print() {
        System.out.println("Created color: " + getColor() + "!");
    }
}
