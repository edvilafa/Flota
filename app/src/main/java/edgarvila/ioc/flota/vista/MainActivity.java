package edgarvila.ioc.flota.vista;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

//import java.sql.CallableStatement;

import edgarvila.ioc.flota.controlador.ConnexioServidor;
import edgarvila.ioc.flota.R;
import edgarvila.ioc.flota.modelo.Empleats;

public class MainActivity extends AppCompatActivity {

    //Declarem la varibale de connexió
    private static ConnexioServidor conn=new ConnexioServidor();

    //Variables de formulari MainActivity (Login)
    Button btnIniciar;
    EditText txtUser,txtPassword;

    private Empleats usuari;
    //private ConnexioServidor empleats = new ConnexioServidor();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Assignem valor a les variables
        btnIniciar=findViewById(R.id.btnIniciar);
        txtUser=findViewById(R.id.txtUser);
        txtPassword=findViewById(R.id.txtPassword);

        //Botó iniciar. A l clickar agafa el text dels TextView com a aparameters per la funció
        //IniciSessio
        btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //IniciSessio(txtUser.getText().toString(),txtPassword.getText().toString());
                usuari.setNom(txtUser.getText().toString());
                usuari.setContrasenya(txtPassword.getText().toString());

                try {
                    conn.enviaLogin(usuari);
                }catch (Exception er){
                    Toast.makeText(getApplicationContext(),er.toString(),Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    //
    /*public void IniciSessio(String user, String password){
        try{




            if (_msg.equals("OK")){
                //Si es correcte llancem l'activityMenu

            } else {
                Toast.makeText(getApplicationContext(),_msg,Toast.LENGTH_SHORT).show();
            }

        }catch (Exception er){
            Toast.makeText(getApplicationContext(),er.toString(),Toast.LENGTH_SHORT).show();
        }

    }*/
    }