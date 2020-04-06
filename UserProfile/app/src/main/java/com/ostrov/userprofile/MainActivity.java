package com.ostrov.userprofile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.graphics.Typeface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView photo = findViewById(R.id.photo);
        photo.setImageResource(R.drawable.photo);
        photo.setScaleType(ImageView.ScaleType.CENTER_CROP);
        photo.setContentDescription(getString(R.string.photo_image));

        TextView name = findViewById(R.id.name);
        setAttributes(name, R.string.name);

        TextView birthday = findViewById(R.id.birthday);
        setAttributes(birthday, R.string.birthday);

        TextView country = findViewById(R.id.country);
        setAttributes(country, R.string.country);

        findViewById(android.R.id.content).invalidate();
    }

    private void setAttributes(TextView v, int textId) {
        v.setText(getString(textId));
        if (textId == R.string.birthday)
            v.setTextSize(getResources().getDimension(R.dimen.text_birthday));
        else
            v.setTextSize(getResources().getDimension(R.dimen.text_size));
        v.setTextColor(getResources().getColor(R.color.textColor));

        Typeface face = ResourcesCompat.getFont(getApplicationContext(), R.font.dance);
        v.setTypeface(face);
    }
}
