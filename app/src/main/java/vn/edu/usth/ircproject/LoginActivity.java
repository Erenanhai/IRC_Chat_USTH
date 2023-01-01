package vn.edu.usth.ircproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.firebase.auth.FirebaseUser;

public class LoginActivity extends AppCompatActivity {

    private FirebaseUser currentUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    @Override
    protected void onStart() {

        super.onStart();
//   Check and verify user
//   If the user already loged in, then send he/she to app directly
        if (currentUser != null){

            SendUsertoMainActivity();
        }
    }

    private void SendUsertoMainActivity() {
        Intent loginIntent = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(loginIntent);
    }
}