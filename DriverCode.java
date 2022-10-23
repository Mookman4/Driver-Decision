import java.util.Scanner;

public class DriverCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you have a driving permit (Y/N)? ");
        String drivingPermit = scanner.nextLine();
        if (drivingPermit.equalsIgnoreCase("N")) {
            System.out.println("Driving permit is a prerequisite to purchase a vehicle! ");
        } else if (drivingPermit.equalsIgnoreCase("Y")) {
            System.out.println("Do you have a commercial driving license (Y/N)? ");
            {
                String commercialDrivingLicense = scanner.nextLine();
                if (commercialDrivingLicense.equalsIgnoreCase("N")) {
                    System.out.println("Commercial driving license is a prerequisite to purchase a vehicle!\n ");
                } else if (commercialDrivingLicense.equalsIgnoreCase("Y")) {
                    System.out.println("Congratulations! You can purchase a vehicle, let’s start talking options! ");
                }
            }
        }
    }
}


