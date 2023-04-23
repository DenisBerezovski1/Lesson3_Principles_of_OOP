import AbstractClasses.Figures;
import Interfaces.GetCircle;
public class Circle extends Figures implements GetCircle {
    private final String name;
    private final double radius;
    public Circle(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }
    @Override
    public Double getArea() {
        return Math.PI * (radius * radius);
    }
    @Override
    public Double getCircleCircle() {
        return Math.PI * (2 * radius);
    }
    @Override
    public String toString() {
        return String.format("%s Имеет площадь - %f; Радиус %f; Окружность %f", name, getArea(), radius, getCircleCircle());
    }
    @Override
    public int compareTo(Figures o) {
        return this.getArea().compareTo(o.getArea());
    }
}