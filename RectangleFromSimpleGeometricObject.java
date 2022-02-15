public class RectangleFromSimpleGeometricObject extends GeometricObject{
    private double width ;
    private double height;


    public RectangleFromSimpleGeometricObject() {
        super();
        this.width = 1.0;
        this.height = 1.0;
    }     

    public RectangleFromSimpleGeometricObject(double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }

    public RectangleFromSimpleGeometricObject(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return (this.height * this.width);
    }

    public double getPerimeter(){
        return (this.height * 2.0 + this.width * 2.0);
    }
}
