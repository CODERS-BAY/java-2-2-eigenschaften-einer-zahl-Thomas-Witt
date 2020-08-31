import java.util.Scanner;

public class CharacteristicOfANumber {
    public static void main(String[] args) {

        System.out.println("Please input a number. You are free to choose my favourite number '5':");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number%10==0)
            System.out.println("The number is a round number.");
        else
            System.out.println("The number is not a round number.");

        if (number%2==0)
            System.out.println("The number is even.");
        else
            System.out.println("The number is odd.");

        if (number == 5)
            System.out.println("You have chosen my favourite number! You are awesome!");
        else
            System.out.println("Why didn't you choose my favourite number?");

        if (number / 10 == 0)
                System.out.println("The Number has one digit.");
        else if (number / 100 == 0)
            System.out.println("The number has two digits.");
        else if (number / 1000 == 0)
            System.out.println("The number has three digits.");
        else
            System.out.println("The number has more than tree digits");

    }
}
