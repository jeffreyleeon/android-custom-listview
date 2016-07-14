package com.jeffreyleeon.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by leechunon on 14/7/2016.
 */
public class CustomAdapter extends BaseAdapter {

    String [] mPrgmNameList;
    Context context;
    int [] mPrgmImages;
    private static LayoutInflater inflater =null;

    public CustomAdapter(MainActivity mainActivity, String[] prgmNameList, int[] prgmImages) {
        mPrgmNameList = prgmNameList;
        context = mainActivity;
        mPrgmImages = prgmImages;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return mPrgmNameList.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public class Holder {
        TextView textView;
        ImageView imageView;
    }
    @Override
    public View getView(
            final int position,
            View convertView,
            ViewGroup parent
    ) {
        Holder holder = new Holder();
        View rowView;
        rowView = inflater.inflate(R.layout.program_list, null);
        holder.textView = (TextView) rowView.findViewById(R.id.textView1);
        holder.imageView = (ImageView) rowView.findViewById(R.id.imageView1);
        holder.textView.setText(mPrgmNameList[position]);
        holder.imageView.setImageResource(mPrgmImages[position]);
        rowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "You Clicked " + mPrgmNameList[position], Toast.LENGTH_LONG).show();
            }
        });
        return rowView;
    }

}
