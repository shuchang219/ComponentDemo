package com.quyunshuo.modulea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    String string = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulea_activity_login);
        try {
            string = getIntent().getExtras().getString("test");
        } catch (Exception e) {

        }
        Toast.makeText(this, string, Toast.LENGTH_SHORT).show();
    }

    public void gotoModuleB(View view) {
        gotoClassForName("com.quyunshuo.moduleb.RegisterActivity");

    }

    public void gotoApp(View view) {
        gotoClassForName("com.quyunshuo.componentdemo.MainActivity");

    }

    private void gotoClassForName(String packageName) {
        try {
            Class bClass = Class.forName(packageName);
            Intent intent = new Intent(LoginActivity.this, bClass);
            startActivity(intent);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
