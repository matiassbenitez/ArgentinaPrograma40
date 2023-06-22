package exception;

public class Exception {

    public static void main(String[] args) {

        try {
            int division = 10 / 0;
        } catch (RuntimeException a) {
            System.out.println("Error: " + a.getMessage());
            System.out.println("Error: " + a);
            System.out.println(a.fillInStackTrace());
        }
    }
}
