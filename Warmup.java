import java.awt.Rectangle;
/**
 * Write a description of class Warmup here.
 *
 * @author Evren
 * @version August 27 2026
 */
public class Warmup {
    public static void warmup1() {
        World myWorld = new World();
        Turtle pumpkin = new Turtle(myWorld);
        pumpkin.forward(25);
    }
    
    public static void warmup2() {
        String city, bigCity;
        
        city    = new String("Naperville");   //Assign values to the respective strings
        bigCity = city.toUpperCase();
        
        System.out.print(city);               //outputs "Naperville / NAPERVILLE"
        System.out.print(" / ");
        System.out.print(bigCity);
    }
    public static void warmup3() {
        int rectangle1XCoordinate = 10;
        int rectangle1YCoordinate = 20;
        int rectangle1Width       = 50;
        int rectangle1Height      = 100;
        Rectangle rectangle1      = new Rectangle(rectangle1XCoordinate,rectangle1YCoordinate,rectangle1Width,rectangle1Height);
        
        int rectangle2XCoordinate = 50;
        int rectangle2YCoordinate = 100;
        int rectangle2Width       = 30;
        int rectangle2Height      = 20;
        Rectangle rectangle2      = new Rectangle(rectangle2XCoordinate,rectangle2YCoordinate,rectangle2Width,rectangle2Height);
        
        boolean doesIntersect = rectangle1.intersects(rectangle2);
        
        System.out.println(doesIntersect);
    }
}