package com.example.expandablelistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CursorAdapter;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ExpandableListView expandableListView;
    CustomAdapter customAdapter;
    List<String> listDataHeader;
    HashMap<String,List<String>> listDatachild;
    int lastExpandablePostion=-1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        PrepareData();

        expandableListView = findViewById(R.id.expandviewId);

        customAdapter = new CustomAdapter(this,listDataHeader,listDatachild);

        expandableListView.setAdapter(customAdapter);

        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int groupPosition) {
                if (lastExpandablePostion !=-1 && lastExpandablePostion != groupPosition)
                {
                    expandableListView.collapseGroup(lastExpandablePostion);
                }
                lastExpandablePostion = groupPosition;
            }
        });
    }

    public void PrepareData()
    {
        String [] headerString=getResources().getStringArray(R.array.hederlistName);
        String [] childString = getResources().getStringArray(R.array.childlistName);


        listDataHeader = new ArrayList<>();
        listDatachild = new HashMap<>();

        for (int i=0; i<headerString.length;i++)
        {
            listDataHeader.add(headerString[i]);

            List<String> child = new ArrayList<>();

            child.add(childString[i]);

            listDatachild.put(listDataHeader.get(i),child);

        }
    }

}
