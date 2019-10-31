public class Cylinder extends Circle{
    private double height = 1.0;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder( double radius, double height, String color, boolean filled) {
        super(radius, color, filled);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return height * (getRadius() *getRadius()) * Math.PI;
    }

    @Override
    public String toString() {
        return "A Cylinder with heiht = "
                + getHeight()
                + ", which is a subclass of "
                + super.toString();
    }
}
