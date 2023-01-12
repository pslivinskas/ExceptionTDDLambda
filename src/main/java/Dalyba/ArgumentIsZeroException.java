package Dalyba;

public class ArgumentIsZeroException extends Exception {

    String message;

    public ArgumentIsZeroException(String additional1) {
        message = "Negalime atlikti veiksmo, nes " + additional1 + " skaicius yra nulis";
    }

    public ArgumentIsZeroException(String additional1, String additional2) {
        message =
                String.format(
                        "Negalime atlikti veiksmo, nes %s ir %s skaiciai yra nulis",
                        additional1,
                        additional2
                );
    }

    @Override
    public String toString() {
        return message;
    }
}
