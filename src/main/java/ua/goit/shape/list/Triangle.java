package ua.goit.shape.list;

import ua.goit.shape.Shape;

public class Triangle extends Shape {
    private final double firstSide;
    private final double secondSide;
    private final  double thirdSide;

    public Triangle(double firstSide, double secondSize, double thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSize;
        this.thirdSide = thirdSide;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public double getThirdSide() {
        return thirdSide;
    }

    @Override
    public String shapeName() {
        return "Triangle";
    }

    @Override
    public double area() {
        double semiperimeter = (firstSide + secondSide + thirdSide) / 2;
        return Math.sqrt(semiperimeter * (semiperimeter - firstSide) * (semiperimeter - secondSide)
                * (semiperimeter - thirdSide));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "firstSize=" + firstSide +
                ", secondSize=" + secondSide +
                ", thirdSide=" + thirdSide +
                '}';
    }
}
