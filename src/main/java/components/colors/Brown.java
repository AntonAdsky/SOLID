package components.colors;

import interfaces.Color;

public class Brown implements Color {
    private final String color = "Brown";

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void print() {
        System.out.println("Created color: " + getColor() + "!");
    }
}
