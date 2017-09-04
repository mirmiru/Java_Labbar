//Milja Virtanen

import java.util.Scanner;

public class Labb1_final {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            char userChoice;
            System.out.println("Välkommen!");
       
            //METHOD - MENU + Användarens val
            do {

                printMenu();
                userChoice = sc.next().charAt(0);

                //METHOD - SUM TWO
                if (userChoice == '1') {
                    System.out.println("Här adderar vi två tal.");
                    int nr1, nr2;

                    System.out.print("Första talet är: ");
                    nr1 = sc.nextInt();
                    System.out.print("Andra talet är: ");
                    nr2 = sc.nextInt();

                    sumTwoNumbers(nr1, nr2);
                }

                //METHOD - RÄKNAR ANTAL BOKSTÄVER i STRÄNG
                else if (userChoice == '2') {
                    System.out.println("Här räknar vi bokstäverna i en sträng.");
                    System.out.print("Ange ett ord du vill leta i: ");
                    String userString = sc.next();
                    System.out.println("Ange bokstaven du vill leta efter: ");
                    char userChar = sc.next().charAt(0);

                    countLettersInString(userString, userChar);
                }

                //SPEGELVÄNDER STRÄNG
                else if (userChoice == '3') {
                    System.out.println("Här spegelvänder vi en sträng.");

                    mirrorString();
                }

                //SUMMERAR ALLA TAL I EN STRÄNG
                else if (userChoice == '4') {
                    System.out.println("Här summerar vi alla tal i en sträng. Ge en sträng: ");
                    String userNumbers = sc.next();
                    countNumbersInString(userNumbers);
                }

            } while (userChoice != 'e');

            System.out.println("Hejdå!");

    }

    public static void printMenu() {
        System.out.println();
        System.out.println("Vad vill du göra?");
        System.out.println("1. Addera två tal.");
        System.out.println("2. Räkna bokstäver i en sträng.");
        System.out.println("3. Spegelvända en sträng.");
        System.out.println("4. Summera alla tal i en sträng.");
        System.out.println("e. Avsluta.");
    }

    public static void sumTwoNumbers(int number1, int number2) {
        System.out.println("Summan är " + (number1 + number2));
    }

    public static void countLettersInString(String userString, char userChar) {

        //söker antal bokstäver med for-loop. Jämför bokstaven userChar med en viss bokstav i ordet userString.
        int sum = 0;
        for (int i = 0; i < userString.length(); i++) {
            if (userChar == userString.charAt(i)) {
                sum++;
            }
        }
        System.out.println("Det finns " +sum+ " " +userChar+ " i ordet " +userString +".");
    }

    public static void mirrorString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ange ett ord du vill spegelvända: ");

        String userString = sc.nextLine();
        String a = "";

        for (int i = userString.length() - 1; i >= 0; i--) {
            a = a + userString.charAt(i);
        }
        System.out.println(a);
    }

    public static void countNumbersInString(String userNumbers) {
        int sum = 0;
        for (int i = 0; i < userNumbers.length(); i++) {

            if (isDigit(userNumbers.charAt(i))) {
                sum = sum + (userNumbers.charAt(i) - 48);
            }
        } System.out.println(sum);
    }

    public static boolean isDigit(char c) {
        if (Character.isDigit(c)) {
            return true;
        } else {
            return false;
        }

    }

}

