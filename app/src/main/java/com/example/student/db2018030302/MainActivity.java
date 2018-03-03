package com.example.student.db2018030302;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = (ImageView) findViewById(R.id.imageView);
//        RequestQueue queue = Volley.newRequestQueue(MainActivity.this);
//        ImageRequest request = new ImageRequest("https://static1.squarespace.com/static/523b823ce4b0c90f4f169867/t/584f4d00e3df2821594ce4a6/1481592081752/",
//                new Response.Listener<Bitmap>() {
//                    @Override
//                    public void onResponse(Bitmap response) {
//                        img.setImageBitmap(response);
//                    }
//                }, 0, 0, ImageView.ScaleType.CENTER_INSIDE, Bitmap.Config.RGB_565, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//
//            }
//        });
//        queue.add(request);
//        queue.start();

        Picasso.with(MainActivity.this).load("https://static1.squarespace.com/static/523b823ce4b0c90f4f169867/t/584f4d00e3df2821594ce4a6/1481592081752/").into(img);
    }
}
