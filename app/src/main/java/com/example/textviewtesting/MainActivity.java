package com.example.textviewtesting; /*Package for the entire thingy*/
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;


import android.view.View;

import androidx.appcompat.app.AppCompatActivity; /*THIS IS THE LAYOUT PACKAGE ALL THE XML*/
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.textviewtesting.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
  //public class MainActivity extends AppCompatActivity implements View.OnClickListener
    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    @Override   /* Indicates that a method declaration is intended to override a method declaration in a superclass.*/
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }

    public void login(View view){
        //if(togglebutton.ButtonFirst)// pressed?

        EditText registerField = (EditText) findViewById(R.id.registerField);
        EditText passwordField = (EditText)  findViewById(R.id.passwordField);

        //registerField.setOnClickListener(this);
    }

    //Logic is because we have multiple buttons it needs a switch or case for each buttons and element
   /*
    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.registerField:
                startActivity(new Intent(this,Register);

        }
    }
*/


}