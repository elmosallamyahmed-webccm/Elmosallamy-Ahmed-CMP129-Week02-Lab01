import java.util.Scanner;
public class KineticEnergy{
 public static void main(String[] args){
   Scanner hi = new Scanner(System.in);
   System.out.println("What is your mass in kg?");
   double mass = hi.nextDouble();
   System.out.println("What is your velocity in meters per second?");
   double velocity = hi.nextDouble();
   double KE = calculation(mass,velocity);
   System.out.printf("The kinetic energy is %d", KE);
}
public int KineticEnergy()

