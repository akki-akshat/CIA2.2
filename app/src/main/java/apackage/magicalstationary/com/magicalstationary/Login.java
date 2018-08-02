package apackage.magicalstationary.com.magicalstationary;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    EditText user;
    EditText pass;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_login);
        user=(EditText)findViewById(R.id.userText);
        pass=(EditText)findViewById(R.id.editText);
        login=(Button)findViewById(R.id.button3);
        login.setOnClickListener(new View.OnClickListener(){
            @Override
                public void onClick(View v) {
                if((user.getText().toString().equals("admin")) && (pass.getText().toString().equals("pass"))){
                    Intent i = new Intent(getApplicationContext(),Products.class);
                    startActivity(i);
                }
                else
                {
                    login.setText("Failed");
                }
            }
        });

    }


}
