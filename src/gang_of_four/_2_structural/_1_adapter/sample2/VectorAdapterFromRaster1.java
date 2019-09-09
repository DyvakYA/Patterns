package structural.adapter.sample2;

//1ый способ через наследование
class VectorAdapterFromRaster1 extends RasterGraphic implements VectorGraphicInterface {
    public void drawLine() {
        drawRasterLine();
    }

    public void drawSquare() {
        drawRasterSquare();
    }
}
