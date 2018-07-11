package celution.buahloka;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    private EditText etLogin;
    private EditText etPass;
    private Button bLogin;
    private Button bDaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }

    public void launchReg(View view) {
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
    }

    public void launchMain(View view) {
        Toast.makeText(Login.this, "Clicked", Toast.LENGTH_SHORT).show();
    }
}
