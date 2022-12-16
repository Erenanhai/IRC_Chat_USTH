package vn.edu.usth.ircproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create a new Fragment to be placed in the activity layout
        ChatInputFragment firstFragment = new ChatInputFragment();
        ChatFragment secondFragment = new ChatFragment();

        // Add the fragment to the 'container' FrameLayout
        getSupportFragmentManager().beginTransaction().add(R.id.container, firstFragment).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.container, secondFragment).commit();
    }
}