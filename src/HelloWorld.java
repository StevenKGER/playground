public class HelloWorld {

    public static void main(String[] args) {
        final String testString = "Hello World";

        for (int i = 0; i <= testString.length(); i++) {
            System.out.println(testString.substring(0, i));
        }

        for (int j = testString.length() - 1; j >= 0; j--) {
            System.out.println(testString.substring(0, j));
        }
    }

}
