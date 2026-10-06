public class TestCylinder {
    public static void main(String[] args) {

        // Cylinder 1
        Cylinder c1 = new Cylinder();

        System.out.println("Cylinder 1");
        System.out.println("Radius     = " + c1.getRadius());
        System.out.println("Height     = " + c1.getHeight());
        System.out.println("Surface Area = " + c1.getArea());
        System.out.println("Volume     = " + c1.getVolume());
        System.out.println("ToString   = " + c1);

        // Cylinder 2
        Cylinder c2 = new Cylinder(10.0);

        System.out.println("\nCylinder 2");
        System.out.println("Radius     = " + c2.getRadius());
        System.out.println("Height     = " + c2.getHeight());
        System.out.println("Surface Area = " + c2.getArea());
        System.out.println("Volume     = " + c2.getVolume());

        // Cylinder 3
        Cylinder c3 = new Cylinder(2.0, 10.0);

        System.out.println("\nCylinder 3");
        System.out.println("Radius     = " + c3.getRadius());
        System.out.println("Height     = " + c3.getHeight());
        System.out.println("Surface Area = " + c3.getArea());
        System.out.println("Volume     = " + c3.getVolume());

        // Constructor dengan color
        Cylinder c4 = new Cylinder(2.0, 10.0, "blue");

        System.out.println("\nCylinder 4");
        System.out.println("Radius     = " + c4.getRadius());
        System.out.println("Height     = " + c4.getHeight());
        System.out.println("Color      = " + c4.getColor());
        System.out.println("Surface Area = " + c4.getArea());
        System.out.println("Volume     = " + c4.getVolume());

        // Test setter
        c4.setColor("yellow");

        System.out.println("Color setelah setColor = "
                + c4.getColor());

        System.out.println("ToString = " + c4);
    }
}