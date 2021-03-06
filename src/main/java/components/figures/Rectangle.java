package components.figures;

import interfaces.Figure;

public class Rectangle implements Figure {
    int height;
    int weight;

    @Override
    public void setData(int[] data) {
        height = data[0];
        weight = data[1];
    }

    @Override
    public int getAria() {
        return height * weight;
    }

    @Override
    public void print() {
        System.out.println("Rectangle area where height is " + height + " and weight is " + weight + " equal " + getAria() + ".");
    }
}
