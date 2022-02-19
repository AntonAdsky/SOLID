import components.colors.ColorFactory;
import components.figures.FigureFactory;
import interfaces.AbstractFactory;
import interfaces.Color;
import interfaces.Figure;

import static components.FactoryProvider.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        AbstractFactory<Color> colorFactory = getFactory(color);
        assert colorFactory != null;

        AbstractFactory<Figure> figureFactory = getFactory(figure);
        assert figureFactory != null;

        String randomFigure;

        while(true) {
            // create random color
            colorFactory.create(Math.round(Math.random()) == 1 ? ColorFactory.black : ColorFactory.white).print();

            // create random figure
            randomFigure = Math.round(Math.random()) == 1 ? FigureFactory.square : FigureFactory.rectangle;
            Figure figure = figureFactory.create(randomFigure);
            if(randomFigure.equals(FigureFactory.rectangle)) {
                figure.setData(new int[]{(int) (Math.random() * 100), (int) (Math.random() * 100)});
            } else {
                figure.setData(new int[]{(int) (Math.random() * 100)});
            }
            figure.print();
            Thread.sleep(1000);
        }


    }
}
