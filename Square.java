import AbstractClasses.Figures;
import AbstractClasses.Polygon;

public class Square extends Polygon {
    private final String name;
    public Square(String name, double a) {
        super(new double [] {a, a, a, a});
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
        return String.format("%s Имеет площадь %f; Периметр %f; Равные стороны %f", name, getArea(), getPerimeter(), sides[0]);
    }
    @Override
    public int compareTo(Figures o) {
        return this.getArea().compareTo(o.getArea());
    }
}
