public class Rectangle extends Shape {

    private double width;
    private double length;

    // Constructor default
    public Rectangle() {
        super();
        width = 1.0;
        length = 1.0;
    }

    // Constructor width dan length
    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    // Constructor lengkap
    public Rectangle(double width, double length,
                     String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    // Getter width
    public double getWidth() {
        return width;
    }

    // Setter width
    public void setWidth(double width) {
        this.width = width;
    }

    // Getter length
    public double getLength() {
        return length;
    }

    // Setter length
    public void setLength(double length) {
        this.length = length;
    }

    // Luas
    public double getArea() {
        return width * length;
    }

    // Keliling
    public double getPerimeter() {
        return 2 * (width + length);
    }

    // Override toString
    @Override
    public String toString() {
        return "A Rectangle with width=" + width
                + " and length=" + length
                + ", which is a subclass of "
                + super.toString();
    }
}