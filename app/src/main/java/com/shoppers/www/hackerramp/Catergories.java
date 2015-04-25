package com.shoppers.www.hackerramp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class Catergories extends ActionBarActivity {

    private Intent listItemIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catergories);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_catergories, menu);
        return true;
    }
    public void showShoeCatogeryList(View e){
        listItemIntent = new Intent(Catergories.this,ListItem.class);
        listItemIntent.putExtra("category","3");
        startActivity(listItemIntent);
    }
    public void showBagCatogeryList(View e){
        listItemIntent = new Intent(Catergories.this,ListItem.class);
        listItemIntent.putExtra("category","1");
        startActivity(listItemIntent);
    }
    public void showWatchCatogeryList(View e){
        listItemIntent = new Intent(Catergories.this,ListItem.class);
        listItemIntent.putExtra("category","2");
        startActivity(listItemIntent);
    }
    public void showMiscCatogeryList(View e){
        listItemIntent = new Intent(Catergories.this,ListItem.class);
        listItemIntent.putExtra("category","4");
        startActivity(listItemIntent);
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
}
