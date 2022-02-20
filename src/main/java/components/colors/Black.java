package components.colors;

import interfaces.Color;

public class Black implements Color {
    private final String color = "Black";

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void print() {
        System.out.println("Created color: " + getColor() + "!");
    }
}
