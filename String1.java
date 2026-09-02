
/**
 * Write a description of class String1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class String1
{
    public static void main() {
        // Replace "smallTestString" with the name you used for your lowercase string
        String smallTestString = new String( "whisper" );       // Proper string definition
        String bigTestString = smallTestString.toUpperCase(); 
        System.out.println(bigTestString);
        System.out.println(smallTestString);
        String Hello = "Hello, World";                          // String literal(More common)
        int n = 7;
        System.out.println(Hello+n);
        smallTestString = smallTestString.toUpperCase();
        System.out.println(smallTestString);
    }
}