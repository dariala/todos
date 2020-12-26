class Todos {

    private static void printMessage(String message) {
        System.out.println(message);




    }

    private static String getWhat(String[] args) {
        if (args != null && args.length > 0) {
            return Todos.reardArguments(args);
        } else {
            return "Hello World!";
        }
    }

    private static String reardArguments(String[] args) {
        String result = "Priviet ";
        for (int i = 0; i < args.length; i++) {
            if (i == 0) {
                result = result + args[i];
            } else {
                result = result + " and " + args[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Todos.printMessage(Todos.getWhat(args));
    }
}
