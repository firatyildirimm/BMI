import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your height(m): " );
        double height = input.nextDouble();
        System.out.print("Please enter your weight : " );
        double weight = input.nextDouble();
        System.out.print("Your Body Mass Index: "+ (weight/(height*height)) );

    }
}
