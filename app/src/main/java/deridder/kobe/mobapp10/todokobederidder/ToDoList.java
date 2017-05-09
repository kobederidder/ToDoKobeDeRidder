package deridder.kobe.mobapp10.todokobederidder;

import java.util.List;

/**
 * Created by kobe on 9/05/2017.
 */

public class ToDoList {
    List<ToDoItem> toDoList;

    public ToDoList() {
    }

    private static ToDoList ourInstance = new ToDoList();

    public static ToDoList getInstance() {
        return ourInstance;
    }


}
