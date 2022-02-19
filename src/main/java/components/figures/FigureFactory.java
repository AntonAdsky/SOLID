package components.figures;

import interfaces.Figure;
import interfaces.AbstractFactory;

public class FigureFactory implements AbstractFactory<Figure> {

    public static final String rectangle = "Rectangle";
    public static final String square = "Square";

    @Override
    public Figure create(String type) {
        if (rectangle.equalsIgnoreCase(type)) {
            return new Rectangle();
        } else if (square.equalsIgnoreCase(type)) {
            return new Square();
        }

        return null;
    }

//    public Figure create(String figureType, int[] data) {
//        if (rectangle.equalsIgnoreCase(figureType)) {
//            if(data.length == 2)
//                return new Rectangle(data[0], data[1]);
//        } else if (square.equalsIgnoreCase(figureType)) {
//            if(data.length == 1)
//                return new Square(data[0]);
//        }
//
//        return null;
//    }


}
