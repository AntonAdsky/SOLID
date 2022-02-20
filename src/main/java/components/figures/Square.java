package components.figures;

import interfaces.Figure;

public class Square implements Figure {
    private final String title = "Square";
    private int side;

    public String getTitle() {
        return title;
    }

    @Override
    public void setData(int[] data) {
        side = data[0];
    }

    @Override
    public int getAria() {
        return side * side;
    }

    @Override
    public void print() {
        System.out.println("Square area with side: " + side + " is " + getAria() + ".");
    }
}
