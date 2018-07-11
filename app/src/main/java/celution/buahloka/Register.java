package celution.buahloka;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.HashMap;

public class Register extends AppCompatActivity {
    private EditText etNama;
    private EditText etEmail;
    private EditText etPass;
    private EditText etAlamat;
    private EditText etProvinsi;
    private EditText etKota;

    private Button bAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etNama = (EditText) findViewById(R.id.reg_nama);
        etEmail = (EditText) findViewById(R.id.reg_email);
        etPass = (EditText) findViewById(R.id.reg_pass);
        etAlamat = (EditText) findViewById(R.id.reg_alamat);
        etProvinsi = (EditText) findViewById(R.id.reg_prov);
        etKota = (EditText) findViewById(R.id.reg_kota);

        bAdd = (Button) findViewById(R.id.btn_reg);
    }

    private void addUser(){
        final String nama = etNama.getText().toString().trim();
        final String email = etEmail.getText().toString().trim();
        final String pass = etPass.getText().toString().trim();
        final String alamat = etPass.getText().toString().trim();
        final String prov = etProvinsi.getText().toString().trim();
        final String kota = etKota.getText().toString().trim();

        class AddEmployee extends AsyncTask<Void,Void,String> {

            ProgressDialog loading;

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(Register.this,"Menambahkan...","Tunggu...",false,false);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
                Toast.makeText(Register.this,s,Toast.LENGTH_LONG).show();
            }

            @Override
            protected String doInBackground(Void... v) {
                HashMap<String,String> params = new HashMap<>();
                params.put(Konfigurasi.KEY_USR_NAMA,nama);
                params.put(Konfigurasi.KEY_USR_EMAIL,email);
                params.put(Konfigurasi.KEY_USR_PASS,pass);
                params.put(Konfigurasi.KEY_USR_ALAMAT,alamat);
                params.put(Konfigurasi.KEY_USR_KOTA,kota);
                params.put(Konfigurasi.KEY_USR_PROV,prov);


                RequestHandler rh = new RequestHandler();
                String res = rh.sendPostRequest(Konfigurasi.URL_ADD, params);
                return res;
            }
        }

        AddEmployee ae = new AddEmployee();
        ae.execute();
    }

    public void launchInsert(View view) {
        addUser();
    }
}
