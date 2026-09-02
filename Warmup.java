
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
        
        System.out.print(city);               //outputs "Naperville/NAPERVILLE"
        System.out.print(" / ");
        System.out.print(bigCity);
    }
}