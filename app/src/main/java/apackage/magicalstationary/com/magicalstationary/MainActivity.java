package apackage.magicalstationary.com.magicalstationary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickLogin(View view) {
        Intent i = new Intent(getApplicationContext(), Login.class);
        startActivity(i);
    }

    public void onClickRegister(View view) {
        Intent i = new Intent(getApplicationContext(), NewUser.class);
        startActivity(i);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.exit:
                Toast.makeText(MainActivity.this, "exit is Selected", Toast.LENGTH_SHORT).show();
                System.exit(0);
                return true;

            case R.id.newUser:
                Toast.makeText(MainActivity.this, "New User registering", Toast.LENGTH_SHORT).show();
                onClickRegister(findViewById(R.id.newUser));
                return true;

            case R.id.login:
                Toast.makeText(MainActivity.this, "Loging In", Toast.LENGTH_SHORT).show();
                onClickLogin(findViewById(R.id.login));
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
