package com.shoppers.www.hackerramp;

import android.app.ListActivity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class ListItem extends ListActivity implements AdapterView.OnItemClickListener {

    private List lendingItemsList;
    private LendingItemAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_list_item);
        lendingItemsList = new ArrayList<>();
        lendingItemsList.add("Shoe");
        lendingItemsList.add("Socks");
        lendingItemsList.add("va");
        mAdapter = new LendingItemAdapter(ListItem.this,lendingItemsList);
        getListView().setAdapter(mAdapter);
        getListView().setOnItemClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_list_item, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(ListItem.this,""+mAdapter.getItem(position),Toast.LENGTH_SHORT).show();
    }
}
