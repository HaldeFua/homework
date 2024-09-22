import Modelo.Homework;
import Modelo.HomeworkList;

import java.util.ArrayList;
import java.util.Scanner;

public class Controler {

    static Scanner sc = new Scanner(System.in);
    static HomeworkList list = new HomeworkList();
    static int counter = 0;

    public static void run(){

        boolean conditional = false;
        do {
            View.mainMenu();
            int userAnser = sc.nextInt();

            switch (userAnser) {
                case 0:
                    System.out.println("Googbye!");
                    conditional = true;
                case 1:
                    View.menuCreate();
                    list.create(createController());
                    System.out.println("Homework created sucessfully");
                    break;
                case 4:
                    viewList(list.getHwList());
                    break;
            }

        }while (!conditional);
    }

    public static Homework createController(){

        counter++;

        String[] priorities = Homework.getPriorities();
        String[] statusS = Homework.getPriorities();

        sc.nextLine();

        System.out.println("Provide a tittle: ");
        String tittle = sc.nextLine();

        System.out.println("Provide a description: ");
        String description = sc.nextLine();

        System.out.println("Provide a priority: ");
        for (int i = 0; i < priorities.length; i++) {
            System.out.println((i+1) + ") " + priorities[i]);
        }
        String priotityInt = priorities[sc.nextInt() - 1];


        System.out.println("Provide an status");
        for (int i = 0; i < statusS.length; i++) {
            System.out.println((i+1) + ") " + statusS[i]);
        }
        String statusInt = statusS[sc.nextInt() - 1];

        Homework newHW = new Homework(counter, tittle, description, priotityInt, statusInt);
        return  newHW;
    }

    public static void viewList(ArrayList<Homework> list){

        boolean control = false;
        do{
            for (Homework homework:list){
                System.out.println(homework);
            }

            System.out.println("Press 0 to exit");

            if(sc.nextInt() == 0){control = true;}

        }while (!control);

    }

}
