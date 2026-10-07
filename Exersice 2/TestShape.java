public class TestShape {

    public static void main(String[] args) {
        // Shape
        printShape(new Shape());
        printShape(new Shape("yellow", false));

        // Circle
        printCircle(new Circle());
        printCircle(new Circle(2.0));
        printCircle(new Circle(3.0, "red", true));

        // Rectangle
        printRectangle(new Rectangle());
        printRectangle(new Rectangle(2.0, 4.0));
        printRectangle(new Rectangle(3.0, 5.0, "blue", false));

        // Square
        printSquare(new Square());
        printSquare(new Square(4.0));

        Square sq = new Square(5.0, "purple", true);
        printSquare(sq);

        // Ubah width, length ikut berubah
        sq.setWidth(6.0);
        System.out.println("Square: width=" + sq.getWidth()
                + " length=" + sq.getLength());

        // Ubah length, width ikut berubah
        sq.setLength(8.0);
        System.out.println("Square: width=" + sq.getWidth()
                + " length=" + sq.getLength());
    }

    private static void printShape(Shape s) {
        System.out.println("Shape:"
                + " color=" + s.getColor()
                + " filled=" + s.isFilled());
        System.out.println(s);
    }

    private static void printCircle(Circle c) {
        System.out.println("Circle:"
                + " radius=" + c.getRadius()
                + " area=" + c.getArea()
                + " perimeter=" + c.getPerimeter());
        System.out.println(c);
    }

    private static void printRectangle(Rectangle r) {
        System.out.println("Rectangle:"
                + " width=" + r.getWidth()
                + " length=" + r.getLength()
                + " area=" + r.getArea()
                + " perimeter=" + r.getPerimeter());
        System.out.println(r);
    }

    private static void printSquare(Square s) {
        System.out.println("Square:"
                + " width=" + s.getWidth()
                + " length=" + s.getLength()
                + " area=" + s.getArea()
                + " perimeter=" + s.getPerimeter());
        System.out.println(s);
    }
}