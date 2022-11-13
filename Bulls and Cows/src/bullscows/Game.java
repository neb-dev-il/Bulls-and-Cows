package bullscows;

import java.util.Scanner;

class Game {

    private final SecretCode SECRET_CODE;
    private final static Scanner SCANNER = new Scanner(System.in);

    Game(SecretCode SECRET_CODE) {
        this.SECRET_CODE = SECRET_CODE;
    }

    void guessTheSecretNumber() {
        System.out.println("\nOkay, let's start a game!");
        int turnsCounter = 1;
        System.out.printf("Turn %d:\n", turnsCounter);
        UserCode userCode = new UserCode(SCANNER.nextLine());
        userCode.setBulls(SECRET_CODE.getSecretCode());
        userCode.setCows(SECRET_CODE.getSecretCode());
        userCode.getAnswear();

        while (SECRET_CODE.getSECRET_CODE_LENGTH() != userCode.getBulls()) {
            ++turnsCounter;
            System.out.printf("\nTurn %d:\n", turnsCounter);
            userCode = new UserCode(SCANNER.nextLine());
            userCode.setBulls(SECRET_CODE.getSecretCode());
            userCode.setCows(SECRET_CODE.getSecretCode());
            userCode.getAnswear();

        }
        System.out.println("Congratulations! You guessed the secret code.");
    }
}