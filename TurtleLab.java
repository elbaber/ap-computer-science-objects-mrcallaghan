import java.awt.Color;

/**
 * Add a description of the Turtle Lab.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TurtleLab {
    static World Pacific  = new World();
    
    static Turtle turtle1 = new Turtle(Pacific);
    static Turtle turtle2 = new Turtle(Pacific);
    
    public static void main(String[] args) {
        drawStarOfGivenRadius(turtle1, 100);
    }
    
    public static void drawStarOfGivenRadius(Turtle turtle, int radius) {
        int pentagramExteriorAngle   = 324;
        int pentagramInteriorAngle   = 360-pentagramExteriorAngle;
        double cosineOfInteriorAngle = Math.cos(pentagramInteriorAngle/2);
        double sideLength            = radius * cosineOfInteriorAngle * 2;
        int intSideLength            = (int) sideLength;
        int turnAngle                = 180 - pentagramInteriorAngle;

        turtle.penUp();
        turtle.setHeading(0);
        turtle.forward(radius);
        turtle.turn(pentagramExteriorAngle/2);
        turtle.penDown();
        
        for(int i = 0; i < 5; i++) {
            turtle.forward(intSideLength);
            turtle.turn(turnAngle);
        }
        
    }
}
