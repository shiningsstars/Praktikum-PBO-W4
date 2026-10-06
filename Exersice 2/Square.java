public class Square extends Rectangle {

    // Constructor default
    public Square() {
        super();
    }

    // Constructor side
    public Square(double side) {
        super(side, side);
    }

    // Constructor lengkap
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    // Getter side
    public double getSide() {
        return getWidth();
    }

    // Setter side
    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    // Agar width dan length selalu sama
    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    // Agar width dan length selalu sama
    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    // Override toString
    @Override
    public String toString() {
        return "A Square with side=" + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
}