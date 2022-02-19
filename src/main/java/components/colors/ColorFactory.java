package components.colors;

import interfaces.AbstractFactory;
import interfaces.Color;

public class ColorFactory implements AbstractFactory<Color> {

    public static final String black = "Black";
    public static final String white = "White";

    @Override
    public Color create(String type) {
        if(black.equalsIgnoreCase(type)) {
            return new Black();
        } else if(white.equalsIgnoreCase(type)) {
            return new White();
        }
        return null;
    }
}
