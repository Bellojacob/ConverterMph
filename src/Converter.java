import java.util.Scanner;

public class Converter {
    public static int convertToMph(double kph){
        double mph = kph * .621371;
        mph = Math.round(mph);
        int num = Double.valueOf(mph).intValue();
        return num;
    }
    public static int convertToKph(double mph){
        double kph = mph * 1.609344;
        kph = Math.round(kph);
        int num = Double.valueOf(kph).intValue();
        return num;
    }

    public static void StringOfConvertToMph(double kph){
        System.out.println(kph + " in Kph and it is " + convertToMph(kph) + " in Mph");
    }

    public static void StringOfConvertToKph(double mph){
        System.out.println(mph + " in Mph and it is " + convertToKph(mph) + " in Kph");
    }

    public static void prompt(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to convert to MPH\nEnter 2 to convert to KPH\nEnter 0 to exit");
        int userInput = sc.nextInt();

        while (userInput != 0){

            if (userInput == 1){
                System.out.println("Enter a KPH to convert to MPH");
                int userKPH = sc.nextInt();
                StringOfConvertToMph(userKPH);
                System.out.println();
                System.out.println("Enter 1 to convert to MPH\nEnter 2 to convert to KPH\nEnter 0 to exit");
                userInput = sc.nextInt();
            }
            else if (userInput == 2) {
                System.out.println("Enter a MPH to convert to KPH");
                int userMPH = sc.nextInt();
                StringOfConvertToKph(userMPH);
                System.out.println();
                System.out.println("Enter 1 to convert to MPH\nEnter 2 to convert to KPH\nEnter 0 to exit");
                userInput = sc.nextInt();
            }
            else {
                System.out.println("Please enter a value between 0,1,or 2");
                System.out.println();
                System.out.println("Enter 1 to convert to MPH\nEnter 2 to convert to KPH\nEnter 0 to exit");
                userInput = sc.nextInt();
            }
        }
        System.out.println("\nThank you!");
    }
}
