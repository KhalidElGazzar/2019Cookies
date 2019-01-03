package com.example.khalid.a2019cookies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    protected boolean isButtonClicked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {

        // [Done] T O D O: Find a reference to the ImageView in the layout. Change the image.
        ImageView imageView = (ImageView) findViewById(R.id.android_cookie_image_view);

        // [Done] T O D O: Find a reference to the TextView in the layout. Change the text.
        TextView textView = (TextView) findViewById(R.id.status_text_view);

        // [Done] T O D O: Find a reference to the Button in the layout. Change its displaying text.
        Button btn = (Button) findViewById(R.id.eat_cookie);


        if ( !isButtonClicked ) { //hungry
            imageView.setImageResource(R.drawable.after_cookie);
            textView.setText(R.string.status_text_full);
            btn.setText(R.string.button_label_full);
            isButtonClicked = true;
        }
        else { // full
            imageView.setImageResource(R.drawable.before_cookie);
            textView.setText(R.string.status_text_hungry);
            btn.setText(R.string.button_label_hungry);
            isButtonClicked = false;
        }
    }
}
