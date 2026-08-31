import java.awt.Rectangle;
/**
 * Write a description of class Rectangle2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rectangle2
{
    public static void main() {
        Rectangle box = new Rectangle(5, 10, 20, 30);
        box.add(0, 0);
    
        System.out.println(box);
    }
}