import java.util.Scanner;
public class KineticEnergy{
    public static void main(String[] args){
    Scanner hi = new Scanner(System.in);
    System.out.println("What is your mass in kg?");
    double mass = hi.nextDouble();
    System.out.println("What is your velocity in meters per second?");
    double velocity = hi.nextDouble();
    double KE = kineticEnergy(mass,velocity);
    System.out.printf("The kinetic energy is %.2f", KE);
}
public static double kineticEnergy(double mass, double velocity){
    double KE = 0.5 * mass * (velocity*velocity);
    return KE;
}}

