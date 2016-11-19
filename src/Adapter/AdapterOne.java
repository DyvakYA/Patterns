package Adapter;

import java.io.FileNotFoundException;

/**
 * Created by Dyvak on 19.11.2016.
 */

public class AdapterOne {

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

interface VectorGraphicInterface{
    void drawLine();
    void drawSquare();
}

class RasterGraphic{
    void drawRasterLine(){
        System.out.println("Line");
    }

    void drawRasterSquare(){
        System.out.println("Square");
    }
}

//1ый способ через наследование
class VectorAdapterFromRaster1 extends RasterGraphic implements VectorGraphicInterface{
    public void drawLine(){
        drawRasterLine();
    }

    public void drawSquare(){
        drawRasterSquare();
    }
}

//2ой способ через композицию
class VectorAdapterFromRaster2 implements VectorGraphicInterface{
    RasterGraphic raster = null;//new RasterGraphic();

    public VectorAdapterFromRaster2(RasterGraphic raster){
        this.raster = raster;
    }

    public void drawLine(){
        raster.drawRasterLine();
    }

    public void drawSquare(){
        raster.drawRasterSquare();
    }
}
