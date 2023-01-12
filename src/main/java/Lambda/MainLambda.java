package Lambda;

public class MainLambda {
    public static void main(String[] args) {
        //Traditional way
         MyErrorMessage errorMessage = new MyErrorMessage() {
            @Override
            public void show(String message, int skaicius) {
                System.out.println(message + " | " + skaicius);
            }
        };
        errorMessage.show("Sveiki biciuliai", 45);

        // Lambda
        MyErrorMessage errorMessageSecond =
                (message, skaicius) -> {
                        System.out.println(message + " | " + skaicius);
        };

        errorMessageSecond.show("Sveiki biciuliai", 45);

        System.out.println();
        Addable addable = (a, b) -> {return a + b;};
        System.out.println("Suma: " + addable.doMath(3, 2));

        addable = (a, b) -> {return a - b;};
        System.out.println("Skirtumas: " + addable.doMath(3, 2));

        addable = Integer::sum;
        System.out.println("Suma: " + addable.doMath(3, 2));



    }
}
