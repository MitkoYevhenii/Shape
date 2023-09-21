package ua.goit.shape;

import ua.goit.shape.list.RegularPolygon;

public class ShapeNamePrinter {

    public static void printShapeName(Shape shape) {
        System.out.println("Shape name: " + shape.shapeName() + "\nShape area: " + shape.area());
    }
}
