package fundamental.delegation.sample1;

import fundamental.delegation.sample1.Painter;
import fundamental.delegation.sample1.Square;
import fundamental.delegation.sample1.Triangle;

/**
 * Created by Dyvak on 19.11.2016.
 */

public class Main {

    public static void main(String [] args){

//  A a = new A();
//  a.f();

        Painter painter = new Painter();

        painter.setGraphics(new Square());
        painter.draw();

        painter.setGraphics(new Triangle());
        painter.draw();

    }
}

