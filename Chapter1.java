
/*
 * Every Java program contains one or more classes (e.g., Chapter1).
 * 
 * In general, every source file (e.g., Chapter1.java) conatins one class (e.g., Chapter1).
 * 
 * The source file name must match the class name.
 * 
 * By convention, class names start with an uppercase letter.
 */

public class Chapter1
{
    /*
     * A class contains methods.
     * 
     * Most Java programs contain a class mith a main method.
     * 
     * The main method is executed when the program starts.
     */
    public static void man()
    {
        /*
         * A method contains statements.
         * 
         * Statements may invoke  other methods (e.g., println).
         * 
         * In general, methods are invoked on objects.
         * 
         * When invoking a method, arguments are passed in parentheses (e.g., "Hello, world.")
         */
        System.out.println("Hello, world.");

        /*
         * A statement contains identifiers.
         * 
         * Identifiers may have any combination of:
         *      letters
         *      digits (but not as the first character)
         *      underscores
         *      dollar signs
         *      
         * These are valid identifiers:
         */
        int y, x2, X_Y, total$;

        // this is a single-line comment (like # in python)
        // this is not a valid identifier
        //int 2y;

        /*
         * Identifeirs are case sensitive (case matters)
         * 
         * These are different:
         */
        String squirt, SQuiRT, SQUIRT;

        /*
         * By convention, constants are all uppercase with an underscore to separate words.
         * 
         */
        int SPEED_OF_LIGHT = 300000000; // m/s

        /*
         * By convention, most other identifiers start with a lowercase letter.
         *      Subsequent words start with an uppercase letter (Camalcase)
         */
        String pacificOcean;
        
        /*
         * This is a compile-time error.  (The code doesn't compile)
         * 
         * These are often called syntax errors.
         */
        //System.out.pritln("Hello, world.");
        
        /*
         * This is a run-time error.  (The code compiles and runs,
         *  but generates an exception.  In most cases the program crashes.
         */
        
        //System.out.println(1/0);
        
        /*
         * This is also a run-time error.  (The code compiles and runs, but doesn't produce the expected output)
         * 
         * More specifically, this is a logical error as the output differs from my intention.
         */
        System.out.println("Hello, word.");
        
        /*
         * Algorithm - aseries of steps we can follow.  Must be:
         *  - unambiguous
         *  - executable
         *  - terminating  
         *  updating repo
         */

    }
}



