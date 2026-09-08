import java.util.Scanner;
public class CelsiusTable {
    public static void main(String[] args) {
        Scanner wow = new Scanner(System.in);
        double [] tempsF = new double[20];
        double [] tempsC = new double[20];
        for(int i = 0; i<20; i++){
            System.out.printf("What is the degree in Farenheit for temperature %d%n", i+1);
            tempsF[i] = wow.nextDouble();
            tempsC[i] =  celcius(tempsF[i]);
        }
        for(int i= 0; i<20; i++){
            System.out.printf("The temperature %.2f F is equivalent to %.2f C%n", tempsF[i], tempsC[i]);
        }
    }
    public static double celcius(double F){
        double C = (F-32)*(5.0/9);
        return C;
    }   
}
