package com.example.shakil.list_view;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

//java folder = new java class
//extend likha baseadapter nita oibo
// akon mainActivity ta gia {ListviewAdapter adapter= new ListviewAdapter(this,people);} ata create korta hoba
// variable nita oibo
// constructor nita hoba right click genarate constructor
// public ListviewAdapter(Activity context, ArrayList<String> people) akana activity r jaigai je activityr kaj korbo sei activity r name
//resource file create korbo layout gia <layout=new=layout resource fle>
//mainactivity ta gia pepole a data add korta hoba
//listview likha adapter set korta hoba listView.setAdapter(adapter); main activity ta.
//nicha public view get view ta  View nita hoba
public class ListviewAdapter extends BaseAdapter {

    //variable
     Activity context;
     ArrayList<String> people;

    public ListviewAdapter(MainActivity context, ArrayList<String> people) {
        this.context = context;
        this.people = people;
    }

    @Override
    public int getCount() {
        return people.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if(view==null)
        {
            view= context.getLayoutInflater().inflate(R.layout.list_item, viewGroup, false);
        }
        TextView peopleTextView= view.findViewById(R.id.textview);

        String peopleText = people.get(i);
        peopleTextView.setText(peopleText);

        return view;
    }
}
