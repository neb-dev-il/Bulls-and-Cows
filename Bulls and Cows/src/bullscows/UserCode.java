package bullscows;

class UserCode {

    private final String USER_CODE;
    private int bulls;
    private int cows;

    UserCode(String USER_CODE) {
        this.USER_CODE = USER_CODE;
    }

    int getBulls() {
        return bulls;
    }

    void setBulls(String SECRET_CODE) {
        int bulls = 0;
        for (int i = 0; i < USER_CODE.length(); i++) {
            if (USER_CODE.charAt(i) == SECRET_CODE.charAt(i)) {
                ++bulls;
            }
        }
        this.bulls = bulls;
    }

    void setCows(String secretCode) {
        int bullsAndCows = 0;
        for (int i = 0; i < USER_CODE.length(); i++) {
            for (int j = 0; j < secretCode.length(); j++) {
                if (USER_CODE.charAt(i) == secretCode.charAt(j)) {
                    ++bullsAndCows;
                }
            }
        }
        this.cows = bullsAndCows - bulls;
    }

    void getAnswear() {
        System.out.print("Grade: ");
        String numberOfBulls = bulls == 1 ? "bull" : "bulls";
        String numberOfCows = cows == 1 ? "cow" : "cows";
        if (bulls == 0 && cows == 0) {
            System.out.print("None");
        } else if (bulls == 0) {
            System.out.printf("%d " + numberOfCows, cows);
        } else if (cows == 0) {
            System.out.printf("%d " + numberOfBulls, bulls);
        } else {
            System.out.printf("%d " + numberOfBulls + " and %d " + numberOfCows, bulls, cows);
        }
    }
}