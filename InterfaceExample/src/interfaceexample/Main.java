package interfaceexample;


public class Main {

    
    public static void main(String[] args) {
        System.out.println("Part 1 ==============================================================");
        MyCircle mc1 = new MyCircle(12.37f);
        System.out.println("Radius: " + mc1.getRadius());
        
        System.out.println("\nPart 2 ============================================================");
        MyRectangle mr1 = new MyRectangle(22.0f, 34.5f);
        System.out.println("Rectangle width: " + mr1.getWidth());
        System.out.println("Rectangle height: " + mr1.getHeight());
        System.out.println("Rectangle area: " + mr1.getArea());
        System.out.println();
        
        System.out.println("\nPart 3 ============================================================");
        
        int result = mr1.compareTo(mr1, mc1);
        System.out.println("mr1 vs. mr1: " + result);
        
        System.out.println("\nPart 4 ============================================================");
        result = mr1.compareTo(mc1, mr1);
        System.out.println("mc1 vs. mr1: " + result);
        
        System.out.println("\nPart 5 ============================================================");
        result = mr1.compareTo(mr1, mr1);
        System.out.println("mr1 vs mr1: " + result);
    }

}
