package com.quyunshuo.componentdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gotoModuleA(View view) {
//        gotoClassForName("com.quyunshuo.modulea.LoginActivity");
        try {
            Class bClass = Class.forName("com.quyunshuo.modulea.LoginActivity");
            Intent intent = new Intent(MainActivity.this, bClass);
            intent.putExtra("test", "123");
            startActivity(intent);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    public void gotoModuleB(View view) {
        gotoClassForName("com.quyunshuo.moduleb.RegisterActivity");

    }

    private void gotoClassForName(String packageName) {
        try {
            Class bClass = Class.forName(packageName);
            Intent intent = new Intent(MainActivity.this, bClass);
            startActivity(intent);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
