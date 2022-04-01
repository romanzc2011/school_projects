package staticvariablesmethods;

/**
 *
 * @author mtrutsch
 */
public class MyCircle {
  private int x; // = Integer.MAX_VALUE;
  private int y; // = Integer.MAX_VALUE;
  private int radius; // = Integer.MAX_VALUE;
  
  
  public MyCircle(int x, int y, int radius) {
    this.x = x;
    this.y = y;
    this.radius = radius;
  }
  
   
  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public int getRadius() {
    return radius;
  }
}
