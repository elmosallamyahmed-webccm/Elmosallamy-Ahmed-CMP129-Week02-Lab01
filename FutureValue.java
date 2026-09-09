import java.util.Scanner;
public class FutureValue{
    public static void main(String[] args){
    Scanner hi = new Scanner(System.in);
    System.out.println("What is your current value?");
    double P = hi.nextDouble();
    System.out.println("What is your monthly interest rate in % form?");
    double i = hi.nextDouble()/100;
    System.out.println("For how many months will it stay in the account");
    double t = (double) hi.nextInt();
    double F = futureValue(P,i,t);
    System.out.printf("The account's future value will be $%.2f%n", F);
}
public static double futureValue(double P, double i, double t){
    // F = P × (1 + i)ᵗ
    double F = P *(Math.pow((1+i),t));
    return F;
}}


