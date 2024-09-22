package Modelo;

import java.util.ArrayList;

public class HomeworkList {

    ArrayList<Homework> hwList = new ArrayList<>();

    public void create(Homework hw){
        hwList.add(hw);
    }

    public ArrayList<Homework> getHwList() {
        return hwList;
    }
}
