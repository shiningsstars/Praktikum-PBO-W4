public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super();
        height = 1.0;
    }

    public Cylinder(double height) {
        super();
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    // baru: override, sekarang hasilnya luas permukaan
    // 2*pi*r*h + 2*luas alas
    @Override
    public double getArea() {
        return 2 * Math.PI * getRadius() * height + 2 * super.getArea();
    }

    // diubah: super.getArea() = luas alas milik Circle
    public double getVolume() {
        return super.getArea() * height;
    }

    @Override
    public String toString() { // in Cylinder class
        return "Cylinder: subclass of " + super.toString() // use Circle's toString()
        + " height=" + height;
    }
}
