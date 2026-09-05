import java.awt.Color;

/**
 * Add a description of the Turtle Lab.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TurtleLab {
    static World  Pacific = new World(1000,1000);
    
    static Turtle turtle1 = new Turtle(Pacific);
    static Turtle turtle2 = new Turtle(Pacific);
    
    static int recursionVariable = 0;
    
    public static void main() {
        turtle1.setPenColor(Color.black);
        //drawPentagramOfGivenRadius(turtle1, 100);
        
        turtle2.setPenColor(Color.magenta);
        initFractalTriangle(turtle1, 256, 3);
    }
    
    public static void drawTriangleOfGivenRadius(Turtle turtle, int radius){
        int    triangleExteriorAngle = 300;
        int    triangleInteriorAngle = 360 - triangleExteriorAngle;
        double cosineOfInteriorAngle = Math.cos(triangleInteriorAngle);
        double sideLength            = radius * cosineOfInteriorAngle * 2;
        int    intSideLength         = (int) sideLength;
        int    turnAngle             = 180 - triangleInteriorAngle;
        
        turtle.penUp();
        turtle.setHeading(0);
        turtle.forward(radius);
        turtle.turn(triangleExteriorAngle/2);
        turtle.penDown();
        
        for (int i = 0; i < 3; i++) {
            turtle.forward(intSideLength);
            turtle.turn(turnAngle);
        }
    }
    
    public static void fractalTree(Turtle turtle, int angle, int length, double ratio, int depth) { //Used old python code
        double doubleNewLength = ratio * length;
        int    newLength       = (int) doubleNewLength;
        if (recursionVariable == depth) {
            return;
        }
        recursionVariable++;
        turtle.turn(angle/2);
        turtle.forward(length);
        fractalTree(turtle, angle, newLength, ratio, depth);
        
        turtle.backward(length);
        
        turtle.turn(-1 * angle);
        turtle.forward(length);
        fractalTree(turtle, angle, newLength, ratio, depth);
        
        turtle.backward(length);
        turtle.turn(angle/2);
        recursionVariable--;
    }
    
    public static void initFractalTriangle(Turtle turtle, int sideLength, int depth) { //THIS AWFUL CODE EDITOR DOESN'T SAVE PROJECTS IN THE LINUX FILES. WTF. I JUST LOST SO MANY COMMENTS! I CLOSED MY LAPTOP LID AND THE CHROMEBOOK SHUT DOWN AND I HAD TO REIMPORT THE REPO WHICH I DIDN'T COMMIT PUSH TO IN THE 5 MINUTES I LEFT MY CHROMEBOOK.
        int triangleInteriorAngle = 60;
        int turnAngle             = 180 - 60;
        
        turtle.setHeading(90);
        
        for (int i = 0; i < 3 ; i++) {
            turtle.forward(sideLength);
            turtle.turn(-1 * turnAngle);
        }
        
        fractalTriangle(turtle, sideLength, depth); //Turtle will experience "drift" from recursion. Fix using positions. Plan: have turtle go to bottom left corner.
    }
    
    public static void fractalTriangle(Turtle turtle, int sideLength, int depth) {
        int triangleInteriorAngle = 60;
        int turnAngle             = 180 - 60;
        
        if (recursionVariable == depth) {
            return;
        }
        recursionVariable++;
        
        turtle.turn(-1 * triangleInteriorAngle);
        turtle.penUp();
        turtle.forward(sideLength/2);
        turtle.penDown();
        turtle.turn(triangleInteriorAngle);
        for (int i = 0; i < 3; i++) {
            turtle.forward(sideLength/2);
            turtle.turn(turnAngle);
        }
        
        turtle.turn(turnAngle);
        turtle.penUp();
        turtle.forward(sideLength/2);
        turtle.turn(-1 * turnAngle);
        turtle.penDown();
        fractalTriangle(turtle, sideLength/2, depth);
        
        turtle.turn(-1 * triangleInteriorAngle);
        turtle.penUp();
        turtle.forward(sideLength/2);
        turtle.penDown();
        turtle.turn(triangleInteriorAngle);
        fractalTriangle(turtle, sideLength/2, depth);
        
        turtle.penUp();
        turtle.turn(turnAngle);
        turtle.forward(sideLength/2);
        turtle.turn(-1 * turnAngle);
        turtle.forward(sideLength/2);
        turtle.penDown();
        fractalTriangle(turtle, sideLength/2, depth);
        
        turtle.penUp();
        turtle.backward(sideLength/2);
        turtle.penDown();
        recursionVariable--;
    }
    
    public static void drawPentagramOfGivenRadius(Turtle turtle, int radius) {
        int    pentagramExteriorAngle = 324;
        int    pentagramInteriorAngle = 360-pentagramExteriorAngle;
        double cosineOfInteriorAngle  = Math.cos(pentagramInteriorAngle/2);
        double sideLength             = radius * cosineOfInteriorAngle * 2;
        int    intSideLength          = (int) sideLength;
        int    turnAngle              = 180 - pentagramInteriorAngle;

        turtle.penUp();
        turtle.setHeading(0);
        turtle.forward(radius);
        turtle.turn(pentagramExteriorAngle/2);
        turtle.penDown();
        
        for (int i = 0; i < 5; i++) {
            turtle.forward(intSideLength);
            turtle.turn(turnAngle);
        }
    }
}
