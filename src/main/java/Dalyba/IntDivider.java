package Dalyba;

public class IntDivider {

    public static int divide(String[] skaiciai) throws ArgumentIsZeroException {
        int pirmasSkaicius = Integer.parseInt(skaiciai[0]);
        int antrasSkaicius = Integer.parseInt(skaiciai[1]);

        if (pirmasSkaicius == 0 && antrasSkaicius == 0) {
            throw new ArgumentIsZeroException("Pirmas", "Antras");
        } else if (pirmasSkaicius == 0) {
            throw new ArgumentIsZeroException("Pirmas");
        } else if (antrasSkaicius == 0) {
            throw new ArgumentIsZeroException("Antras");
        }
        return pirmasSkaicius / antrasSkaicius;
    }
}
