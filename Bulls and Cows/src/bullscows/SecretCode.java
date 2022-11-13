package bullscows;

class SecretCode {

    private final int SECRET_CODE_LENGTH;
    private String secretCode;
    private final int NUMBER_OF_POSSIBLE_SYMBOLS;
    static final String ALL_POSSIBLE_SYMBOLS = "0123456789abcdefghijklmnopqrstuvwxyz";

    SecretCode(int SECRET_CODE_LENGTH, int NUMBER_OF_POSSIBLE_SYMBOLS) {
        this.SECRET_CODE_LENGTH = SECRET_CODE_LENGTH;
        this.NUMBER_OF_POSSIBLE_SYMBOLS = NUMBER_OF_POSSIBLE_SYMBOLS;
    }

    int getSECRET_CODE_LENGTH() {
        return SECRET_CODE_LENGTH;
    }

    void getSecretPreparedMessage() {
        System.out.print("The secret is prepared: ");
        for (int i = 0; i < SECRET_CODE_LENGTH; i++) {
            System.out.print("*");
        }
        String possibleNumbers = NUMBER_OF_POSSIBLE_SYMBOLS > 10 ? "9" : String.valueOf(ALL_POSSIBLE_SYMBOLS.charAt(NUMBER_OF_POSSIBLE_SYMBOLS - 1));
        System.out.printf(" (0-%s", possibleNumbers);
        if (NUMBER_OF_POSSIBLE_SYMBOLS > 10) {
            System.out.print(", ");
            String possibleChars = String.valueOf(ALL_POSSIBLE_SYMBOLS.charAt(NUMBER_OF_POSSIBLE_SYMBOLS - 1));
            if (NUMBER_OF_POSSIBLE_SYMBOLS > 11) {
                System.out.printf("a-%s", possibleChars);
            } else {
                System.out.print("a");
            }
        }
        System.out.print(").");
    }

    String getSecretCode() {
        return secretCode;
    }

    void setSecretCode() {
        StringBuilder randomSecretNumber = new StringBuilder();
        String possibleSymbols = ALL_POSSIBLE_SYMBOLS.substring(0, NUMBER_OF_POSSIBLE_SYMBOLS);

        while (randomSecretNumber.length() != SECRET_CODE_LENGTH) {
            int index = (int) (possibleSymbols.length() * Math.random());
            if (!randomSecretNumber.toString().contains(String.valueOf(possibleSymbols.charAt(index)))) {
                randomSecretNumber.append(possibleSymbols.charAt(index));
            }
        }
        this.secretCode = String.valueOf(randomSecretNumber);
    }
}