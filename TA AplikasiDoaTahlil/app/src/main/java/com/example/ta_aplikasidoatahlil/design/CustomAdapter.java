package com.example.ta_aplikasidoatahlil.design;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.ta_aplikasidoatahlil.R;
import com.example.ta_aplikasidoatahlil.model.DoaList;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends BaseAdapter {

    private final Context context;
    private final ArrayList<DoaList> mediaList;

    public CustomAdapter(Context context, ArrayList<DoaList> mediaList) {
        this.context = context;
        this.mediaList = mediaList;
    }

    @Override
    public int getCount() {
        return mediaList.size();
    }

    @Override
    public Object getItem(int position) {
        return mediaList.get(position);
    }

    @Override
    public long getItemId(int id) {
        return id;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        HolderView holderView;
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.activity_list_item, parent, false);
            holderView = new HolderView(convertView);
            convertView.setTag(holderView);
        }

        else {
            holderView = (HolderView) convertView.getTag();
        }

        DoaList list = mediaList.get(position);
        holderView.noList.setText(list.getNoDoa());
        holderView.judulList.setText(list.getJudulDoa());
        return convertView;
    }

    private static class HolderView{
        private final TextView noList;
        private final TextView judulList;

        public HolderView(View view){
            noList = view.findViewById(R.id.noId);
            judulList = view.findViewById(R.id.judulDoa);
        }
    }
}
