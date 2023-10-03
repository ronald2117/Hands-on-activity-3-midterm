import java.util.*;

public class Triangle{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the Sides of the Triangle");
        System.out.println("Side 1:");
        double side1 = input.nextDouble();
        System.out.println("Side 2:");
        double side2 = input.nextDouble();
        System.out.println("Side 3:");
        double side3 = input.nextDouble();

        if(side1 == side2 && side2 == side3){
            System.out.println("Equilateral Triangle");
        }
        else if(side1 == side2 || side2 == side3 || side3 == side1){
            System.out.println("Isosceles Triangle");
        } else{
            System.out.println("Scalene Triangle");
        }

        System.out.println("\nNext, enter the angles in degrees");
        System.out.println("Angle 1:");
        double angle1 = input.nextDouble();
        System.out.println("Angle 2:");
        double angle2 = input.nextDouble();
        System.out.println("Angle 3:");
        double angle3 = input.nextDouble();

        double biggestAngle = Math.max(angle1, angle2);
        biggestAngle = Math.max(biggestAngle, angle3);
        
        if((angle1 + angle2 + angle3) != 180){
            System.out.println("Not a Triangle");
        }     
        else if(biggestAngle == 90){
            System.out.println("Right Triangle");
        }
        else if(angle1 == angle2 && angle3 == angle2){
            System.out.println("It's an Equilateral Triangle");
        }
        else if(angle1 < 90 && angle2 < 90 && angle3 < 90){
            System.out.println("It's an Acute Triangle");
        } else if(biggestAngle > 90){
            System.out.println("It's an Obtuse Triangle");
        }
    }
}
