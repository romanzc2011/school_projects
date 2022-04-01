package staticvariablesmethods;

/**
 *
 * @author mtrutsch
 */
public class Main {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    System.out.println("SQRT(4): " + Math.sqrt(4));
    
    System.out.println("Add 3 and 6: " + MyMath.add(3, 6));
    System.out.println("Add 3.123 and 1111234235423: " + MyMath.add(3.123f, 1111234235423.0));
    
  }
}
