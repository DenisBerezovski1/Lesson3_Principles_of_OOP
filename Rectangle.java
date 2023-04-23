import AbstractClasses.Figures;
import AbstractClasses.Polygon;

public class Rectangle extends Polygon {
    private final String name;
    public Rectangle(String name, double a, double b) {
        super(new double [] {a, b});
        this.name = name;
    }
    @Override
    public Double getArea() {
        return sides[0] * sides[1];
    }
    @Override
    public Double getPerimeter() {
        return super.getPerimeter();
    }
    @Override
    public String toString() {
        return String.format("%s Имеет Площадь %f; Периметр %f; Стороны %f; %f", name, getArea(), getPerimeter(), sides[0], sides[1]);
    }
    @Override
    public int compareTo(Figures o) {
        return this.getArea().compareTo(o.getArea());
    }
}

