package com.example.loginactivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class LoginTabFragment extends Fragment {
    EditText username,password;
    Button login;
    TextView forgetpass,createacc;
    float v=0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.login_tab_fragment, container, false);

        username=root.findViewById(R.id.username);
        password=root.findViewById(R.id.password);
        forgetpass=root.findViewById(R.id.forgetpass);
        login=root.findViewById(R.id.login);
        createacc=root.findViewById(R.id.createacc);

        username.setTranslationX(800);
        password.setTranslationX(800);
        forgetpass.setTranslationX(800);
        login.setTranslationX(800);
        createacc.setTranslationX(800);

        username.setAlpha(v);
        password.setAlpha(v);
        forgetpass.setAlpha(v);
        login.setAlpha(v);
        createacc.setAlpha(v);

        username.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        password.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        forgetpass.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        login.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(700).start();
        createacc.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(600).start();



        return root;
    }
}