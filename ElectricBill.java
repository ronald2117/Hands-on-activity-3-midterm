import java.util.Scanner;
class ElectricBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Customer ID no.:");
        int id = input.nextInt();
        input.nextLine();
        
        System.out.println("Customer name:");
        String name = input.nextLine();
        
        System.out.println("Unit Consumed:");
        double unitConsumed = input.nextDouble();
     
        double charge;
        if(unitConsumed <= 199){
            charge = 1.2;
        }
        else if(unitConsumed >= 200 && unitConsumed <= 399){
            charge = 1.5;
        }
        else if(unitConsumed >= 400 && unitConsumed <= 599){
            charge = 1.8;
        }
        else{
            charge = 2;
        }
        
        double totalCharge = charge * unitConsumed;

        System.out.println("******************");
        System.out.println("Amount of Charges(" + charge + " per unit): " + totalCharge);
        
        //surecharge
        double sureCharge = 0;
        if(totalCharge > 400){
            sureCharge = totalCharge * 0.15;
            System.out.println("SureCharge Amount: " + sureCharge);
        }

        System.out.println("Total amount to be paid: " + (totalCharge + sureCharge));
        System.out.println("Thank you " + name + "!");
    }
}
