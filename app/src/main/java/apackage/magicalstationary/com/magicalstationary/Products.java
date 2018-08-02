package apackage.magicalstationary.com.magicalstationary;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.prefs.Preferences;

public class Products extends AppCompatActivity {

    Product1 pen = new Product1();
    Product2 pencil = new Product2();
    Product3 notebook = new Product3();
    Product4 eraser = new Product4();
    RadioButton rb;
    RadioGroup rg1;
    Button buys;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);
        rg1 = (RadioGroup) findViewById(R.id.rg);
        buys = (Button) findViewById(R.id.buy);


    }


        @Override
        public boolean onCreateOptionsMenu(Menu menu)
        {
            MenuInflater menuInflater = getMenuInflater();
            menuInflater.inflate(R.menu.menu, menu);
            return true;
        }
        @Override
        public boolean onOptionsItemSelected(MenuItem item)
        {
            switch (item.getItemId())
            {
                case R.id.pen:

                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment, pen);
                    fragmentTransaction.commit();

                    Toast.makeText(Products.this, "Bookmark is Selected", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.pencil:

                    FragmentTransaction Transaction = getSupportFragmentManager().beginTransaction();
                    Transaction.replace(R.id.fragment, pencil);
                    Transaction.commit();

                    Toast.makeText(Products.this, "Save is Selected", Toast.LENGTH_SHORT).show();
                    return true;

                case R.id.notebook:
                    FragmentTransaction fragment = getSupportFragmentManager().beginTransaction();
                    fragment.replace(R.id.fragment,notebook);
                    fragment.commit();

                    Toast.makeText(Products.this, "Search is Selected", Toast.LENGTH_SHORT).show();
                    return true;

                    case R.id.eraser:
                    Toast.makeText(Products.this, "Share is Selected", Toast.LENGTH_SHORT).show();
                    return true;
                default:
                    return super.onOptionsItemSelected(item);
            }
        }

    }
