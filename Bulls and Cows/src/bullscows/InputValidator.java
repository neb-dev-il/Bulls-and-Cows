package bullscows;

import java.util.Scanner;

class InputValidator {

    private String secretCodeLength;
    private String numberOfPossibleSymbols;

    private final static Scanner SCANNER = new Scanner(System.in);

    String getSecretCodeLength() {
        return secretCodeLength;
    }

    String getNumberOfPossibleSymbols() {
        return numberOfPossibleSymbols;
    }

    boolean checkNumberOfPossibleSymbols (int numberOfPossibleSymbols) {
        if (numberOfPossibleSymbols > 36) {
            System.out.print("Error: maximum number of possible symbols in the code is 36 (0-9, a-z).");
            return false;
        }
        return true;
    }

    boolean checkNumberOfPossibleSymbols (int numberOfPossibleSymbols, int secretCodeLength) {
        if (secretCodeLength > numberOfPossibleSymbols) {
            System.out.print("Error: it's not possible to generate a code with a length of " + secretCodeLength + " with " + numberOfPossibleSymbols + " unique symbols.");
            return false;
        }
        return true;
    }

    boolean isZero (int input) {
        if (input == 0) {
            System.out.print("Error: input cannot be 0.");
            return false;
        }
        return true;
    }

    boolean checkValidInput(String text) {
        if (!text.matches("[0-9]+")) {
            System.out.printf("Error: \"%s\" isn't a valid number.", text);
            return false;
        }
        return true;
    }

    boolean isInputValid() {
        System.out.println("Input the length of the secret code:");
        this.secretCodeLength = SCANNER.nextLine();
        if (checkValidInput(secretCodeLength) && isZero(Integer.parseInt(secretCodeLength))) {
            System.out.println("Input the number of possible symbols in the code:");
            this.numberOfPossibleSymbols = SCANNER.nextLine();
            return checkValidInput(numberOfPossibleSymbols) && isZero(Integer.parseInt(numberOfPossibleSymbols));
        }
        return false;
    }
}