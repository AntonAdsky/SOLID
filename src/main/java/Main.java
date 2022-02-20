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


        while(true) {
            // create random color
            colorFactory.getRandom().print();

            // create random figure
            figureFactory.getRandom().print();

            // timeout
            Thread.sleep(1000);
        }


    }
}
