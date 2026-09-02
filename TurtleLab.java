import java.awt.Color;

/**
 * Add a description of the Turtle Lab.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TurtleLab {
    World  Pacific = new World();
    
    Turtle Turtle1 = new Turtle(Pacific);
    Turtle Turtle2 = new Turtle(Pacific);
    
    public static void main(String[] args) {
        
    }
    
    public static void drawStarOfGivenRadius(Turtle turtle, int radius) {
        int pentagramExteriorAngle = 324;
        int pentagramInteriorAngle = 360-pentagramExteriorAngle;
        double cosineOfInteriorAngle = Math.cos(pentagramInteriorAngle);
        int sideLength             = radius * cosineOfInteriorAngle.intValue();
        
        turtle.penUp();
        turtle.setHeading(0);
        turtle.forward(radius);
        turtle.turn(pentagramExteriorAngle/2);
        turtle.penDown();
        
        
    }
}
