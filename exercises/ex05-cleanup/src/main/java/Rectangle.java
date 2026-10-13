/** Rectangle shape. */
public class Rectangle {
  private double width;
  private double height;

  /**
   * Construct a rectangle shape.
   *
   * @param w rectangle width
   * @param h rectangle height
   */
  public Rectangle(double w, double h) {
    this.width = w;
    this.height = h;
  }

  /**
   * Return the area of a rectangle shape.
   *
   * @return the numerical value of the rectangle area
   */
  public double area() {
    return width * height;
  }

  /**
   * Scales the rectangle.
   *
   * @param factor the scaling factor
   */
  public void scale(double factor) {
    width = width * factor;
    height = height * factor;
  }

  /**
   * Check if this rectangle is larger than another rectangle.
   *
   * @param other the other rectangle
   * @return whether this rectangle is larger than the other rectangle
   */
  public boolean isLargerThan(Rectangle other) {
    return area() > other.area();
  }
}
