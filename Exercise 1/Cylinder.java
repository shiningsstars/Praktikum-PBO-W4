public class Cylinder extends Circle {
    private double height;

    // Constructor default
    public Cylinder() {
        super();
        height = 1.0;
    }

    // Constructor height
    public Cylinder(double height) {
        super();
        this.height = height;
    }

    // Constructor radius dan height
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    // Constructor tambahan radius, height, color
    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    // Getter height
    public double getHeight() {
        return height;
    }

    // Task 1.2
    // Surface area cylinder
    @Override
    public double getArea() {
        return 2 * Math.PI * getRadius() * height
                + 2 * super.getArea();
    }

    // Volume cylinder
    public double getVolume() {
        // Menggunakan getArea() milik Circle
        return super.getArea() * height;
    }

    // Task 1.3
    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString()
                + " height=" + height;
    }
}