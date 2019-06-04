package sg.edu.rp.c346.demotipsforexam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lvExamTips;
    String [] examTips = new String[5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvExamTips = findViewById(R.id.listViewExamTips);

        //create an instance of the ArrayAdapter,taking the String array,examTipsArray as an input
        //context,resource,List<T>objects(array)
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,examTips);

        //list view
        examTips[0] = "Prepare way before the exam";
        examTips[1] = "Practice coding";
        examTips[2] = "Seek help from lecturer";
        examTips[3] = "Prepare template code";
        examTips[4] = "Create empty projects for MSA";

        //listview name .setAdapter (adapter)
        lvExamTips.setAdapter(adapter);
    }
}
