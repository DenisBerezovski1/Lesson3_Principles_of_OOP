import AbstractClasses.Figures;
import AbstractClasses.Polygon;

public class Triangle extends Polygon {
    private final String name;
    public Triangle(String name, double a, double b, double c) {
        // a + b > c && b + c > a && a + c > b
        super(new double[] {a, b, c});
        this.name = name;
    }
    @Override
    public Double getArea() {
        double p = super.getPerimeter() / 2;
        return Math.sqrt(p * (p - sides[0]) * (p - sides[1]) * (p - sides[1]));
    }
    @Override
    public Double getPerimeter() {
        return super.getPerimeter();
    }
    @Override
    public String toString() {
        return String.format("%s Имеет площадь %f; Периметр %f; Стороны %f; %f; %f", name, getArea(), getPerimeter(), super.sides[0], super.sides[1], super.sides[2]);
    }
    @Override
    public int compareTo(Figures o) {
        return this.getArea().compareTo(o.getArea());
    }
}
