package deridder.kobe.mobapp10.todokobederidder;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button btnAdd, btnEdit;
    ListView lvToDoList;


    List<String> listItems;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final AlertDialog.Builder AddItemAlert = new AlertDialog.Builder(this);
        final EditText edittext = new EditText(this);

        btnAdd = (Button) findViewById(R.id.btn_new_item);
        btnEdit = (Button) findViewById(R.id.btn_edit_item);
        lvToDoList = (ListView) findViewById(R.id.lv_todo_list);

        listItems = new ArrayList<>();

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                listItems );

        lvToDoList.setAdapter(arrayAdapter);

        AddItemAlert.setMessage("Task description");
        AddItemAlert.setTitle("Add");

        AddItemAlert.setView(edittext);

        AddItemAlert.setPositiveButton("Add", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                String NewItemText = edittext.getText().toString();
                listItems.add(NewItemText);


            }
        });

        AddItemAlert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {

            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            AddItemAlert.getContext();

            }
        });

    }


}
