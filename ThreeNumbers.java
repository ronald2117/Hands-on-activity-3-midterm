import java.util.*;

public class ThreeNumbers{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number 1:");
        double num1 = input.nextDouble();
        System.out.println("Enter number 2:");
        double num2 = input.nextDouble();
        System.out.println("Enter number 3:");
        double num3 = input.nextDouble();

        if(num2 > num1 && num3 > num2){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
