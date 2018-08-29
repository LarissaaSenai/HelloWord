package br.com.senaijandira.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //criando elemento do texto
        TextView txtHello = new TextView(this);

        //defininfo o texto para exibição
        txtHello.setText("Meu primeiro App Android. Uau");

        //exibir o conteudo
        setContentView(txtHello);
    }


}
