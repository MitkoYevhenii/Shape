package ua.goit.shape;

import ua.goit.shape.list.RegularPolygon;

public class Test {
    public static void main(String[] args) {
        RegularPolygon regularPolygon = new RegularPolygon(5, 100);
        ShapeNamePrinter.printShapeName(regularPolygon);
    }
}
