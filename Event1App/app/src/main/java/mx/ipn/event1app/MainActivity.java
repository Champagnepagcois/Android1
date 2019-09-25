package mx.ipn.event1app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Declarar componentes del xml a ocupar
    Button button1;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Recuperar instancias del main
        button1 = (Button) this.findViewById(R.id.id_button1);
        button2 = (Button) this.findViewById(R.id.id_button2);
        //Asignar Listener del evento a escuchar
        button1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //TODO responder al evento
                        Toast.makeText(getApplicationContext(),
                                "HELLO SHORT", Toast.LENGTH_SHORT).show();


                    }
                }
        );
        button2.setOnLongClickListener (
                new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View view) {
                        //Todo responder al evento 
                        Toast.makeText(getApplicationContext(),
                                "HELLO LONG", Toast.LENGTH_LONG).show();
                        return false;
                    }
                }

        );

    }
}
