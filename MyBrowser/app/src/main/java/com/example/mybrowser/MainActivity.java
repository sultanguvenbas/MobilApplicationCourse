package com.example.mybrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    WebView webview;
    Button btnGo;
    EditText txtAddress;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGo=(Button)findViewById(R.id.go) ;
        txtAddress=(EditText)findViewById(R.id.address);
        webview=(WebView)findViewById(R.id.webview);

        webview.setWebViewClient(new WebViewClient());

        if((getIntent() != null) && (getIntent().getData() != null)){//when another application oepn this application, it will open
            txtAddress.setText(getIntent().getData().toString());
            webview.loadUrl(getIntent().getData().toString());

        }





        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                webview.loadUrl("http://"+ txtAddress.getText());
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
}