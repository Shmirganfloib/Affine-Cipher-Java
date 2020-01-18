import java.util.Scanner;

public class Main {
    public static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] Args) {
        System.out.println("Would you like to encode (type \'E\') or decode (type \'D\')?");
        String type = myScanner.nextLine();
        if (type.equals("E")) {
            System.out.println("You chose to Encrypt a message.");
        } else if (type.equals("D")) {
            System.out.println("You chose to Decrypt a message.");
        } else {
            System.out.println("Error");
        }
    }
}