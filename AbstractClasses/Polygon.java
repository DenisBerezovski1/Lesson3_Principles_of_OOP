package AbstractClasses;

import Interfaces.Perimeter;

public abstract class Polygon extends Figures implements Perimeter {
    protected double [] sides;
    protected Polygon(double [] sides){
        this.sides = sides;
    }
    public Double getPerimeter(){
        double result = 0;
        for (double side:this.sides) {
            result += side;
        }
        return result;
    }
    @Override
    public abstract Double getArea();

    
}
