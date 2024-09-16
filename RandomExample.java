import java.util.Random;
public class RandomExample {
 public static void main(String[] args) {
 Random random = new Random();
 // Generate a random integer
 int randomInt = random.nextInt();
 System.out.println("Random Integer: " + randomInt);
 // Generate a random integer within a range (0 to 99)
 int randomIntRange = random.nextInt(100);
 System.out.println("Random Integer (0-99): " + randomIntRange);
 // Generate a random double
 double randomDouble = random.nextDouble();
 System.out.println("Random Double: " + randomDouble);
 }
}