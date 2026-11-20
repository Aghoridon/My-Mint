package com.meri.superapp;
import android.os.Bundle;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
protected void onCreate(Bundle s) {
super.onCreate(s);
WebView w = new WebView(this);
w.getSettings().setJavaScriptEnabled(true);
w.getSettings().setDomStorageEnabled(true);
setContentView(w);
w.loadUrl("file:///android_asset/index.html");
}
}
