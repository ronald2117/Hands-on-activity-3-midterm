import java.util.*;

public class DivisionCategory{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Roll no:");
        int roll = input.nextInt();
        input.nextLine();
        System.out.println("Name: ");
        String name = input.nextLine();
        System.out.println("Marks in Physics: ");
        double physics = input.nextDouble();
        System.out.println("Marks in Mathematics:");
        double math = input.nextDouble();
        System.out.println("Marks in Programming:");
        double programming = input.nextDouble();
        

        double average = ((physics + math + programming) / 3);
        System.out.println("Roll No.: " + roll);
        System.out.println("Name of Student: " + name);
        System.out.println("Marks in Physics: " + physics);
        System.out.println("Marks in Mathematics: " + math);
        System.out.println("Marks in Programming: " + programming);
        System.out.println("Total Marks: " + (physics + math + programming));
        System.out.println("Average : " + average);

        if(average >= 60){
            System.out.println("First Division");
        }
        else if(average >= 48 && average <= 59){
            System.out.println("Second Division");
            if(average >= 48 && average <= 55){
                System.out.println("FAILED");
            } else{
                System.out.println("PASSED");
            }
        }
        else{
            System.out.println("Out of Bounds");
        }
    }
}
