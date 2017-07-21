package com.example.cindy_r.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText text;

    Button btnAgregar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (EditText) findViewById(R.id.txturl);
        btnAgregar = (Button) findViewById(R.id.agregar);

        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                 WebView webView = (WebView) findViewById(R.id.webView);
                webView.setWebViewClient(new WebViewClient(){});
                webView.loadUrl("http://"+text.getText().toString());
                text.setText(" ");
            }
        });

    }

}
