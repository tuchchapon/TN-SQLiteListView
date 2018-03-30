package com.example.user.tn_sqlitelistview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomHolder {
      ImageView imageView;
      TextView textView;

      public CustomHolder(View v) {
            imageView = (ImageView)v.findViewById(R.id.image_view);
            textView = (TextView)v.findViewById(R.id.text_name);
      }
}

