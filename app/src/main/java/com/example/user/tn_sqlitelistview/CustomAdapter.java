package com.example.user.tn_sqlitelistview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

class CustomAdapter extends ArrayAdapter {
      private Context mContext;
      private ArrayList<RowItem> mItems;
      private CustomHolder mHolder;

      public CustomAdapter(Context context, ArrayList<RowItem> items) {
            super(context, 0, items);
            mContext = context;
            mItems = items;
      }

      @Override
      public View getView(int pos, View convertView, ViewGroup parent) {
            if(convertView == null) {
                  LayoutInflater inflater = LayoutInflater.from(mContext);
                  convertView = inflater.inflate(
                          R.layout.item_layout, parent, false);

                  mHolder = new CustomHolder(convertView);
                  convertView.setTag(mHolder);
            } else {
                  mHolder = (CustomHolder) convertView.getTag();
            }

            RowItem item = mItems.get(pos);
            mHolder.imageView.setImageBitmap(getImage(item.image));
            mHolder.textView.setText(item.name);

            mHolder.textView.setTag(item._id);

            return convertView;
      }

      public Bitmap getImage(byte[] image) {
            return BitmapFactory.decodeByteArray(image, 0, image.length);
      }
}
