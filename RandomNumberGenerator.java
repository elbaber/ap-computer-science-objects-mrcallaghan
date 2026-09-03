import java.util.Random;
public class RandomNumberGenerator
{
    public static void main() {
        Random generator = new Random();
        System.out.println(generator.nextInt(7));
    }
}