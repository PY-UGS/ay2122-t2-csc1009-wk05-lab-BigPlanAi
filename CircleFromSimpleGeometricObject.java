import java.lang.Math;

public class CircleFromSimpleGeometricObject extends GeometricObject{
    private double radius;

    public CircleFromSimpleGeometricObject() {
        super();
        this.radius = 1.0 ;
    }

    public CircleFromSimpleGeometricObject(double radius) {
        super();
        this.radius = radius;
    }
    public CircleFromSimpleGeometricObject(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }

    public double getPerimeter(){
        return 2.0 * Math.PI *radius;
    }

    public double getDiameter(){
        return 2 * this.radius;
    }

    void printCircle(){
        
    }

    
    
}