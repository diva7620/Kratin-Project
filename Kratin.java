/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kratin;

/**
 *
 * @author Divya
 */  import java.util.Scanner;
public class Kratin {

    /**
     * @param args the command line arguments
     */
    
        // TODO code application logic here
       

 {
    public static void main(String[] args) {
        System.out.println("User: Sunita Sharma");
        Scanner sc = new Scanner(System.in);
        int x = 0;
        while(x!=4){
            System.out.println("Select from the options below: ");
            System.out.println("1.Appointments");
            System.out.println("2. Medical Record");
            System.out.println("3. Medicines");
            System.out.println("4. Details");
            System.out.println("5. Exit");
            System.out.println();
            System.out.print("Choose an Option: ");
            x = sc.nextInt();

            switch (x) {
                case 1:
                    System.out.println("Your Appointments :");
                    System.out.println("1st October 2023 : CT scan");
                    System.out.println("15th October 2023 : ");
                    break;
                     case 2:
                    System.out.println("Medical History :");
                    System.out.println("High Bloood Pressure");
                    System.out.println("Bone Crack of Right Hand");
                    System.out.println("Knees Problem ");
                    break;
                case 3:
                    System.out.println("Medication :");
                    System.out.println("Morning : Tablet Amlodiphine");
                    System.out.println("Afternoon : Tablet Calvirich Calcium 500");
                    System.out.println("Night : Amlodiphine Tablets 5mg, ");
                    break;
                case 4:
                    System.out.println("Details Info: ");
                    System.out.println("Name : Sunita Sharma");
                    System.out.println("Blood Group : B +ve");
                    System.out.println("Ailment : Narcolepsy");
                    System.out.println("Contact no : 6676773728");
                    System.out.println("Doctor  : Dr. Sunil Narayan, Mobile Number : 8888462917");
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Choose valid Input.");
            }
            System.out.println();
        }
    }
}
    }
    
}
