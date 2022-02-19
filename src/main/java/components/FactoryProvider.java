package components;

import components.colors.ColorFactory;
import components.figures.FigureFactory;
import interfaces.AbstractFactory;

public class FactoryProvider {

    public static final String figure = "Figure";
    public static final String color = "Color";

    public static AbstractFactory getFactory(String type) {
        if (type.equalsIgnoreCase(figure)) {
            return new FigureFactory();
        } else if (type.equalsIgnoreCase(color)){
            return new ColorFactory();
        }

        return null;
    }
}
