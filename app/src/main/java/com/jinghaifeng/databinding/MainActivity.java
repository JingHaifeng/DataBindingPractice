package com.jinghaifeng.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.jinghaifeng.databinding.databinding.UserLayoutBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        UserLayoutBinding userLayoutBinding = DataBindingUtil.setContentView(this, R.layout.user_layout);
        User user = new User("Alex Jing",28);
        userLayoutBinding.setUser(user);

    }

}
