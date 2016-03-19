package listdemo.listdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class MainActivity extends AppCompatActivity {


    ListView lstItems;
    public ArrayAdapter<CharSequence> listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstItems = (ListView) findViewById(R.id.lstItems);

        // lstItems.setAdapter(new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.dataelements)));

        listAdapter = ArrayAdapter.createFromResource(this, R.array.dataelements, R.layout.simplerow);
        lstItems.setAdapter(listAdapter);


        //for Listview Item Click.
        lstItems.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position,
                                    long arg3) {
                String s = listAdapter.getItem(position).toString();
                Toast.makeText(MainActivity.this, "Selected Item is " + s, 3000).show();
            }
        });
    }






}
