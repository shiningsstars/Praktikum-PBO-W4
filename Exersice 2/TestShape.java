public class TestShape {

    public static void main(String[] args) {

        // =========================
        // TEST SHAPE
        // =========================

        Shape s1 = new Shape();

        System.out.println("===== SHAPE =====");
        System.out.println(s1);
        System.out.println("Color  : " + s1.getColor());
        System.out.println("Filled : " + s1.isFilled());

        s1.setColor("blue");
        s1.setFilled(false);

        System.out.println("\nSetelah setter:");
        System.out.println(s1);

        Shape s2 = new Shape("yellow", false);

        System.out.println("\nShape 2:");
        System.out.println(s2);


        // =========================
        // TEST CIRCLE
        // =========================

        System.out.println("\n===== CIRCLE =====");

        Circle c1 = new Circle();

        System.out.println(c1);
        System.out.println("Area      : " + c1.getArea());
        System.out.println("Perimeter : " + c1.getPerimeter());

        Circle c2 = new Circle(2.0);

        System.out.println("\nCircle 2:");
        System.out.println(c2);
        System.out.println("Area      : " + c2.getArea());
        System.out.println("Perimeter : " + c2.getPerimeter());

        Circle c3 = new Circle(3.0, "red", true);

        System.out.println("\nCircle 3:");
        System.out.println(c3);

        c3.setRadius(4.0);

        System.out.println("Radius setelah setter: "
                + c3.getRadius());


        // =========================
        // TEST RECTANGLE
        // =========================

        System.out.println("\n===== RECTANGLE =====");

        Rectangle r1 = new Rectangle();

        System.out.println(r1);
        System.out.println("Area      : " + r1.getArea());
        System.out.println("Perimeter : " + r1.getPerimeter());

        Rectangle r2 = new Rectangle(2.0, 4.0);

        System.out.println("\nRectangle 2:");
        System.out.println(r2);
        System.out.println("Area      : " + r2.getArea());
        System.out.println("Perimeter : " + r2.getPerimeter());

        Rectangle r3 =
                new Rectangle(3.0, 5.0, "blue", false);

        System.out.println("\nRectangle 3:");
        System.out.println(r3);

        r3.setWidth(6.0);
        r3.setLength(7.0);

        System.out.println("Setelah setter:");
        System.out.println(r3);


        // =========================
        // TEST SQUARE
        // =========================

        System.out.println("\n===== SQUARE =====");

        Square sq1 = new Square();

        System.out.println(sq1);
        System.out.println("Area      : " + sq1.getArea());
        System.out.println("Perimeter : " + sq1.getPerimeter());

        Square sq2 = new Square(4.0);

        System.out.println("\nSquare 2:");
        System.out.println(sq2);
        System.out.println("Area      : " + sq2.getArea());
        System.out.println("Perimeter : " + sq2.getPerimeter());

        Square sq3 =
                new Square(5.0, "purple", true);

        System.out.println("\nSquare 3:");
        System.out.println(sq3);

        // Test setWidth
        sq3.setWidth(6.0);

        System.out.println("\nSet width menjadi 6:");
        System.out.println("Width  : " + sq3.getWidth());
        System.out.println("Length : " + sq3.getLength());

        // Test setLength
        sq3.setLength(8.0);

        System.out.println("\nSet length menjadi 8:");
        System.out.println("Width  : " + sq3.getWidth());
        System.out.println("Length : " + sq3.getLength());
    }
}