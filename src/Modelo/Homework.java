package Modelo;

public class Homework {

    private int id;
    private String tittle;
    private String description;
    private String priority;
    private String status;

    public Homework(int id, String tittle, String description, String priority, String status) {
        this.id = id;
        this.tittle = tittle;
        this.description = description;
        this.priority = priority;
        this.status = status;
    }

    private static String[] priorities = {"Low", "Middle", "High"};
    private static String[] statusS = {"Pending","In process","Done"};

    public static String[] getPriorities() {
        return priorities;
    }

    public static void setPriorities(String[] priorities) {
        Homework.priorities = priorities;
    }

    public static String[] getStatusS() {
        return statusS;
    }

    public static void setStatusS(String[] statusS) {
        Homework.statusS = statusS;
    }

    @Override
    public String toString() {
        return "Homework #" +id+  ": " +
                tittle + '\n' +
                "Description: " + description + '\n' +
                "priority: " + priority + '\n' +
                "status: " + status + '\n';
    }

}
