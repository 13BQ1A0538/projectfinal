package  com.example.lenovo.project;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class adminlogin extends AppCompatActivity {

    private Button buttonLogin;
    private EditText editTextEmail;
    private EditText editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminlogin);
        buttonLogin =(Button) findViewById(R.id.buttonLogin);
        editTextEmail =(EditText) findViewById(R.id.editTextEmail);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);

    }
    public void log(View v){
        Intent i=new Intent(adminlogin.this,stores.class);
        startActivity(i);
    }
}

