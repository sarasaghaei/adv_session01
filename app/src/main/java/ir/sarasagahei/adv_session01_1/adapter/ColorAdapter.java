package ir.sarasagahei.adv_session01_1.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

import ir.sarasagahei.adv_session01_1.R;
import ir.sarasagahei.adv_session01_1.entity.Color;

public class ColorAdapter extends BaseAdapter {
    private final Context context;
    private ArrayList<Color> list_colors;

    public ColorAdapter(Context context, ArrayList<Color> colors){
        this.context = context;
        this.list_colors = colors;
    }
    @Override
    public int getCount() {
        return list_colors.size();
    }

    @Override
    public Object getItem(int position) {
        return list_colors.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        if (view == null){
            view = LayoutInflater.from(context).inflate(R.layout.list_color,null);
        }

        final Color color = list_colors.get(position);
        ImageView imageView = view.findViewById(R.id.img);
        imageView.setImageResource(color.getImageId());
        return view;
    }
}
