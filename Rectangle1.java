import java.awt.Rectangle;
/**
 * Write a description of class Rectangle1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rectangle1
{
   public static void main(String[] args)
   {
      Rectangle r1 = new Rectangle(0, 0, 100, 50);
      Rectangle r2 = r1;
      r2.grow(10,20);
      /* Your code goes here */
      /* and here */
      double n1 = 150;
      double n2 = n1;
      n2*=20;
      System.out.println(n1);
      System.out.println(n2);
   }
}