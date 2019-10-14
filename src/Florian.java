public class Florian {

    public static void main(String[] args) throws AutismException {
        doSomething();
    }

    private static void doSomething() throws AutismException {
        processCommand();
    }

    private static void processCommand() throws AutismException {
        react();
    }

    private static void react() throws AutismException {
        throw new AutismException();
    }

    static class AutismException extends Exception {
        @Override
        public String getMessage() {
            return "TeamSpeak bad, Discord good.";
        }
    }

}
