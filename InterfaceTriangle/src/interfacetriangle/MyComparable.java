/*
 * File:
 * Author: Roman Campbell
 * Concentration: Cybersecurity and Networking
 * Date: 
 * Java class description:
 */
package interfacetriangle;

/**
 *
 * @author roman
 */
public interface MyComparable {
    public boolean isLarger(MyComparable obj1, MyComparable obj2);
    public double getValue();
    public int compareTo(MyComparable obj1, MyComparable obj2);
}
