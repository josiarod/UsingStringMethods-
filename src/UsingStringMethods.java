import java.util.Scanner;

public class UsingStringMethods {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String input = sc.next();
        System.out.println("Please enter an index number: ");
        int index = sc.nextInt();

        System.out.println("The length of " + input + " is: " + input.length());
        System.out.println("The substring from 0 to " +index+ " is: " + input.substring(0, index));
    }

}
