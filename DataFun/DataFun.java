// any imports here
import java.util.Scanner;
/**
     * Program tells user things about their favorite integer and their favorite character
     * @author [Bryce Reeder]
     * @version [11/15/24]
     */
public class DataFun{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your favorite integer?");
        int favInt = scanner.nextInt();
        if (favInt < 0) {
            System.out.println(favInt + " is a negative number,");
        } else {
            System.out.println(favInt + " is a negative number,");
        }
        
        if (favInt > 1000) {
            System.out.println("it is greater than 1000,");
        } else if (favInt > 100) {
            System.out.println("It is greater than 100,");
        } else if (favInt > 10) {
            System.out.println("It is greater than 10,");
        } else {
            System.out.println("it is not greater than 10,");
        }
        if (favInt % 2 == 1) {
            System.out.println("It is odd,");
        } else {
            System.out.println("it is even,");
        }
        
        if (favInt == 2) {
            System.out.println("it is the atomic number for Helium,");
        } else if (favInt == 10) {
            System.out.println("It is the atomic number for Neon,");
        } else if (favInt == 18) {
            System.out.println("It is the atomic number for argon,");
        } else if (favInt == 36) {
            System.out.println("it is the atomic number of Krypton,");
        } else if (favInt == 54) {
            System.out.println("it is the atomic number of Xenon,");
        } else if (favInt == 86) {
            System.out.println("it is the atomic number of Radon,");
        } else if (favInt == 118) {
            System.out.println("it is the atomic number of Oganesson,");
        } else {
            System.out.println("it is not the atomic number of a noble gas,");
        }
        if (favInt % 2 == 1) {
            System.out.println("It is odd,");
        } else {
            System.out.println("it is even,");
        }
        
        switch (favInt) {
            case 7:
            System.out.println("and you are basic, unfunny, and erinaceous.");
            break;
            case 69:
            System.out.println("and you aren't in middle school.");
            break;
            case 11:
            System.out.println("and you like the nose bleeder from Stranger Things.");
            break;
            case 118:
            System.out.println("and you are a nerd.");
            break;
            case 420:
            System.out.println("and Snoop Dogg is your favorite musician.");
            break;
            case 10:
            System.out.println("and you are a boring human being.");
            break;
            default:
            System.out.println("and you have a good favorite number");
        }
        
        System.out.println("\nWhat is your favorite character? ");
        char favChar = scanner.next().charAt(0);
        if (favChar >= '0' && favChar <= '9') {
            System.out.println(favChar + " is a numeric digit,");
        }
        
        else if (favChar >= 'a' && favChar <= 'z') {
            System.out.println(favChar + " is a lowercase letter,");
            if (favChar == 'a' || favChar == 'e' || favChar == 'i' || favChar == 'o' || favChar == 'u') {
                System.out.println(favChar + " is a vowel,");
            } else {
                System.out.println(favChar + " is a numeric digit,");
            }
        }
        
        else if (favChar >= 'A' && favChar <= 'Z') {
            System.out.println(favChar + " is a lowercase letter,");
            if (favChar == 'A' || favChar == 'E' || favChar == 'I' || favChar == 'O' || favChar == 'U') {
                System.out.println(favChar + " is a vowel,");
            } else {
                System.out.println(favChar + " is a numeric digit,");
            }
        }
        
        else {
            System.out.println("STOP LOOKING FOR REASONS TO GRADE ME DOWN!!!");
        }
        
        int asciiValue = (int) favChar;
        System.out.println("it's ASCII value is " + asciiValue + ",");
        if (favChar == 'A') {
            System.out.println("and it is the 1st letter of the alphabet.");
        
        } else if (favChar == 'B') {
            System.out.println("and it is the 2nd letter of the alphabet.");
        
        } else if (favChar == 'C') {
            System.out.println("and it is the 3rd letter of the alphabet.");
        
        } else if (favChar >= 'D' && favChar <= 'Z') {
            int alph = favChar - 'A' + 1;
            System.out.println("and it is the " + alph + "th letter in the alphabet.");
        
        } else if (favChar == 'a') {
            System.out.println("and it is the 1st letter of the alphabet.");
        
        } else if (favChar == 'b') {
            System.out.println("and it is the 2nd letter of the alphabet.");
        
        } else if (favChar == 'c') {
            System.out.println("and it is the 3rd letter of the alphabet.");
        
        } else if (favChar >= 'd' && favChar <= 'z') {
            int alph = favChar - 'a' + 1;
            System.out.println("and it is the " + alph + "th letter in the alphabet.");
        }
        
        scanner.close();
    }
}
