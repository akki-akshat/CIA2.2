package apackage.magicalstationary.com.magicalstationary;

import android.app.Notification;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
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
    NotificationManagerCompat notificationManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);
        rg1 = (RadioGroup) findViewById(R.id.rg);
        buys = (Button) findViewById(R.id.buy);
        final Product1 pen = new Product1();
        final Product2 pencil = new Product2();
        final Product3 notebook = new Product3();
        final Product4 eraser = new Product4();
        notificationManager = NotificationManagerCompat.from(this);
        sendOnChannel1();

    buys.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
//            sendOnChannel1();
            int selectedId = rg1.getCheckedRadioButtonId();
            rb = (RadioButton)findViewById(selectedId);
            if(rb.getText().toString().equals("Pen")){
                sendOnChannel1();
                Toast.makeText(Products.this,rb.getText(),Toast.LENGTH_SHORT).show();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment,pen);
                fragmentTransaction.commit();
            }
            else if(rb.getText().toString().equals("Pencil")){
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment,pencil);
                fragmentTransaction.commit();
            }
            else if(rb.getText().toString().equals("NoteBook")){
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment,notebook);
                fragmentTransaction.commit();
            }
            else if(rb.getText().toString().equals("Eraser")){
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment,eraser);
                fragmentTransaction.commit();
            }
        }
    });
    }
    public void sendOnChannel1() {
        Notification notification = new NotificationCompat.Builder(Products.this, app.CHANNEL_2_ID)
                .setSmallIcon(R.drawable.ic_launcher_foreground)
                .setContentTitle("Notification Title")
                .setContentText("This is my notification text")
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setCategory(NotificationCompat.CATEGORY_MESSAGE).build();

        notificationManager.notify(1,notification);
    }

}



//        @Override
//        public boolean onCreateOptionsMenu(Menu menu)
//        {
//            MenuInflater menuInflater = getMenuInflater();
//            menuInflater.inflate(R.menu.menu, menu);
//            return true;
//        }
//        @Override
//        public boolean onOptionsItemSelected(MenuItem item)
//        {
//            switch (item.getItemId())
//            {
//                case R.id.pen:
//
//                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//                    fragmentTransaction.replace(R.id.fragment, pen);
//                    fragmentTransaction.commit();
//
//                    Toast.makeText(Products.this, "Bookmark is Selected", Toast.LENGTH_SHORT).show();
//                    return true;
//                case R.id.pencil:
//
//                    FragmentTransaction Transaction = getSupportFragmentManager().beginTransaction();
//                    Transaction.replace(R.id.fragment, pencil);
//                    Transaction.commit();
//
//                    Toast.makeText(Products.this, "Save is Selected", Toast.LENGTH_SHORT).show();
//                    return true;
//
//                case R.id.notebook:
//                    FragmentTransaction fragment = getSupportFragmentManager().beginTransaction();
//                    fragment.replace(R.id.fragment,notebook);
//                    fragment.commit();
//
//                    Toast.makeText(Products.this, "Search is Selected", Toast.LENGTH_SHORT).show();
//                    return true;
//
//                    case R.id.eraser:
//                    Toast.makeText(Products.this, "Share is Selected", Toast.LENGTH_SHORT).show();
//                    return true;
//                default:
//                    return super.onOptionsItemSelected(item);
//            }



