public class View {

    public static void mainMenu(){

        System.out.println("Welcome to your homework manager");

        System.out.println("\n please selección an option:");
        System.out.println( "\n 1) Create a new homework" +
                            "\n 2) Update a homework" +
                            "\n 3) Delete a homework" +
                            "\n 4) View all homeworks" +
                            "\n 0) Exit");
    }

    public static void menuCreate(){
        System.out.println("CREATE");
        System.out.println("To create a new homework, you should provide" +
                " a tittle, descripción, priority and status");
    }

}
