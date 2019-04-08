package com.quyunshuo.moduleb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulea_activity_register);
    }

    public void gotoModuleA(View view) {
        gotoClassForName("com.quyunshuo.modulea.LoginActivity");
    }


    public void gotoApp(View view) {
        gotoClassForName("com.quyunshuo.componentdemo.MainActivity");
    }

    private void gotoClassForName(String packageName) {
        try {
            Class bClass = Class.forName(packageName);
            Intent intent = new Intent(RegisterActivity.this, bClass);
            startActivity(intent);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
