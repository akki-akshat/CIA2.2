package apackage.magicalstationary.com.magicalstationary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickLogin(View view) {
        Intent i = new Intent(getApplicationContext(),Login.class);
        startActivity(i);
    }

    public void onClickRegister(View view) {
        Intent i = new Intent(getApplicationContext(),NewUser.class);
        startActivity(i);
    }
}
