package deridder.kobe.mobapp10.todokobederidder;

/**
 * Created by kobe on 9/05/2017.
 */

public class ToDoItem {
    int id = 0;
    String name;

    public ToDoItem(String name) {
        this.id++;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
