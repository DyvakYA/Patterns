package structural.adapter.sample2;

import structural.adapter.sample2.RasterGraphic;
import structural.adapter.sample2.VectorAdapterFromRaster1;
import structural.adapter.sample2.VectorAdapterFromRaster2;
import structural.adapter.sample2.VectorGraphicInterface;

import java.io.FileNotFoundException;

/**
 * Created by Dyvak on 19.11.2016.
 */

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        //1ый способ через наследование
        VectorGraphicInterface g1 = new VectorAdapterFromRaster1();
        g1.drawLine();
        g1.drawSquare();
        //2ой способ через композицию
        VectorGraphicInterface g2 = new VectorAdapterFromRaster2(new RasterGraphic());
        g2.drawLine();
        g2.drawSquare();
    }
}

