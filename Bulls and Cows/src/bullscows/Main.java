package bullscows;

class Main {

    private final static InputValidator INPUT_VALIDATOR = new InputValidator();

    private static void playGame(int secretCodeLength, int numberOfPossibleSymbols) {
        if (INPUT_VALIDATOR.checkNumberOfPossibleSymbols(secretCodeLength) && INPUT_VALIDATOR.checkNumberOfPossibleSymbols(numberOfPossibleSymbols)
                && INPUT_VALIDATOR.checkNumberOfPossibleSymbols(numberOfPossibleSymbols, secretCodeLength)) {
            SecretCode secretCode = new SecretCode(secretCodeLength, numberOfPossibleSymbols);
            secretCode.getSecretPreparedMessage();
            secretCode.setSecretCode();
            Game game = new Game(secretCode);
            game.guessTheSecretNumber();
        }
    }

    public static void main(String[] args) {
        if (INPUT_VALIDATOR.isInputValid()) {
            int secretCodeLength = Integer.parseInt(INPUT_VALIDATOR.getSecretCodeLength());
            int numberOfPossibleSymbols = Integer.parseInt(INPUT_VALIDATOR.getNumberOfPossibleSymbols());
            Main.playGame(secretCodeLength, numberOfPossibleSymbols);
        }
    }
}