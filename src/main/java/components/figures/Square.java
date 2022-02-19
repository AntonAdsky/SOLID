package components.figures;

import interfaces.Figure;

public class Square implements Figure {
    private int side;

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
