public class Circle extends Shape {

    private double radius;

    // Constructor default
    public Circle() {
        super();
        radius = 1.0;
    }

    // Constructor radius
    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    // Constructor lengkap
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    // Getter radius
    public double getRadius() {
        return radius;
    }

    // Setter radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Luas
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Keliling
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Override toString
    @Override
    public String toString() {
        return "A Circle with radius=" + radius
                + ", which is a subclass of "
                + super.toString();
    }
}