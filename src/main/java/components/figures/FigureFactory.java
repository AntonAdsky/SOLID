package components.figures;

import interfaces.Figure;
import interfaces.AbstractFactory;

import java.util.ArrayList;

public class FigureFactory implements AbstractFactory<Figure> {

    public static final String rectangle = new Rectangle().getTitle();
    public static final String square = new Square().getTitle();
    public static ArrayList<String> figures = new ArrayList<>();

    public FigureFactory() {
        figures.add(rectangle);
        figures.add(square);
    }

    @Override
    public Figure create(String type) {
        if (rectangle.equalsIgnoreCase(type)) {
            return new Rectangle();
        } else if (square.equalsIgnoreCase(type)) {
            return new Square();
        }

        return null;
    }

    @Override
    public Figure getRandom() {
        int rnd = (int) Math.round(Math.random() * (figures.size() - 1));
        String randomFigureType = figures.get(rnd);
        Figure randomFigure = create(randomFigureType);

        if (randomFigureType.equalsIgnoreCase(rectangle)) {
            randomFigure.setData(new int[]{(int) (Math.random() * 100), (int) (Math.random() * 100)});
        } else {
            randomFigure.setData(new int[]{(int) (Math.random() * 100)});
        }

        return randomFigure;
    }

}
