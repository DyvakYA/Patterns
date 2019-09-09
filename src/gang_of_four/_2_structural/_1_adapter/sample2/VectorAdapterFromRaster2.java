package structural.adapter.sample2;

//2ой способ через композицию
class VectorAdapterFromRaster2 implements VectorGraphicInterface {
    RasterGraphic raster = null;//new RasterGraphic();

    public VectorAdapterFromRaster2(RasterGraphic raster) {
        this.raster = raster;
    }

    public void drawLine() {
        raster.drawRasterLine();
    }

    public void drawSquare() {
        raster.drawRasterSquare();
    }
}
