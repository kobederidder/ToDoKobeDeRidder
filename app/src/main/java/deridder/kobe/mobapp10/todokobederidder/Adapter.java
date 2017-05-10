package deridder.kobe.mobapp10.todokobederidder;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mobapp10 on 10/05/17.
 */

public class Adapter extends BaseAdapter {
    private static class ViewHolder {
        CheckBox cbToDo;
    }

    private LayoutInflater inflater;
    private ArrayList<ToDoItem> itemsList;

    public Adapter(Activity context, List itemsList) {
        this.inflater = context.getLayoutInflater();
        this.itemsList = itemsList;
    }

    public void remove(ToDoItem t) {
        itemsList.remove(t);
    }

    @Override
    public int getCount() {
        return itemsList.size();
    }

    @Override
    public Object getItem(int position) {
        return itemsList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return itemsList.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        //is er al een view aangemaakt?
        if (convertView == null) {
            holder = new ViewHolder();

            convertView = inflater.inflate(R.layout.todo_row, null);
            holder.cbToDo = (CheckBox) convertView.findViewById(R.id.cb_finish_task);


            convertView.setTag(holder);
        } else
            holder = (ViewHolder) convertView.getTag();

        ToDoItem temp = itemsList.get(position);


        holder.cbToDo.setText(temp.getName());

        return convertView;
    }


}
