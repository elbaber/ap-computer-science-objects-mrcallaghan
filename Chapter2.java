
import java.awt.Color;       //Imports colors for usage. First ref at line 27
/**
 * Write a description of class Chapter2 here.
 *
 * @author Evren
 * @version 25aug2026
 */
public class Chapter2 {
    public static void drawLine(){
        /*
         * Objects are entities
         *      They have attributes
         *      And manipulated by invoking methods
         *      
         * Classes describe a collection of objects (like a template)
         * All objects of a class have the same behavior (methods)
         *  and have the same types of attributes
         */
        World ocean  = new World();
        Turtle crush = new Turtle(ocean);
        
        Turtle leo = new Turtle(ocean);
        
        crush.penDown();
        crush.forward(50);
        crush.setPenColor(Color.RED);
        crush.forward(25);
    }
}