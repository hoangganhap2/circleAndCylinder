public class Circle {
    private String color = "blue";
    private boolean filled = true;
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius ;
        this.color = color ;
        this.filled = filled ;
    }

    public double getRadius() {
        return radius ;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color ;
    }
    public void setColor(String color) {
        this.color = color ;
    }

    public boolean isFilled() {
        return filled ;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return " A Circle with radius ="
                + getRadius()
                + ", color : "
                + getColor()
                + " and "
                +(isFilled() ? "filled" : "not filled");
    }
}
