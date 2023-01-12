package Dalyba;

public class MainDalyba {
    public static void main(String[] args) {

        String[] masyvas = InputManager.askForInput();

        try {
            System.out.println(IntDivider.divide(masyvas));
        } catch (ArgumentIsZeroException e) {
            System.out.println(e);
        }
    }
}
