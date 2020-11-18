package designpattern.structural.facade;

public class DrawingFacade {
    final ShapeLibrary shapeLibrary;
    final DrawingDevice drawingDevice;

    public DrawingFacade(ShapeLibrary shapeLibrary, DrawingDevice drawingDevice) {
        this.shapeLibrary = shapeLibrary;
        this.drawingDevice = drawingDevice;
    }

    void drawCircle() {
        drawingDevice.drawOvalObject(shapeLibrary.getCircle());
    }

    void drawRectangle() {
        drawingDevice.drawPerpendicularLineObject(shapeLibrary.getRectangle());
    }
}
