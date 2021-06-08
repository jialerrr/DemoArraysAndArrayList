package sg.edu.rp.c346.day2.demoarraysarraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class ArrayListActivity extends AppCompatActivity {

    TextView tv;
    String msg = "Fruits\n=====\n";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_list);

        tv = findViewById(R.id.textView2);
        setTitle("ArrayList");

        //continue view the code in the worksheet
        ArrayList<String> fruits;
        fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");

        fruits.add("durian");
        String theFruit = fruits.get(1);
        fruits.remove(0);
        fruits.set(2, "dragon fruit");

        for (int i = 0; i <= (fruits.size()-1); i++){
            msg += fruits.get(i) + "\n";
        }

        tv.setText(msg);

    }
}