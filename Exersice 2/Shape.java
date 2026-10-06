public class Shape {

    private String color;
    private boolean filled;

    // Constructor default
    public Shape() {
        color = "green";
        filled = true;
    }

    // Constructor dengan parameter
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Getter color
    public String getColor() {
        return color;
    }

    // Setter color
    public void setColor(String color) {
        this.color = color;
    }

    // Getter boolean
    public boolean isFilled() {
        return filled;
    }

    // Setter boolean
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of " + color
                + " and "
                + (filled ? "filled" : "Not filled");
    }
}