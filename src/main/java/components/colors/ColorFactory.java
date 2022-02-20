package components.colors;

import interfaces.AbstractFactory;
import interfaces.Color;

import java.util.ArrayList;

public class ColorFactory implements AbstractFactory<Color> {

    public static final String black = new Black().getColor();
    public static final String white = new White().getColor();
    public static final String brown = new Brown().getColor();
    public static ArrayList<String> colors = new ArrayList<>();

    public ColorFactory() {
        colors.add(black);
        colors.add(white);
        colors.add(brown);
    }

    private ArrayList<String> getColors() {
        return colors;
    }

    public Color getRandom() {
        int rnd = (int) Math.round(Math.random() * (getColors().size() - 1));
        return create(colors.get(rnd));
    }

    @Override
    public Color create(String type) {
        if (black.equalsIgnoreCase(type)) {
            return new Black();
        } else if (white.equalsIgnoreCase(type)) {
            return new White();
        } else if (brown.equalsIgnoreCase(type)) {
            return new Brown();
        }
        return null;
    }
}
