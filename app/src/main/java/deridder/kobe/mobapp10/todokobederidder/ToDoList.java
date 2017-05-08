package deridder.kobe.mobapp10.todokobederidder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kobe on 8/05/2017.
 */

public class ToDoList {
    List<String> listItems = new ArrayList<>();

    private static ToDoList ourInstance = new ToDoList();

    public static ToDoList getInstance() {
        return ourInstance;
    }

    public ToDoList() {
    }



}
