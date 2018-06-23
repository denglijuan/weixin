package com.zpx.weixin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends BaseAdapter {
    private List<Data> mData;
    private Context mcontext;
    public MyAdapter(List<Data> mData,Context mcontext){
        this.mcontext=mcontext;
        this.mData=mData;
    }
    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if(convertView == null){
            convertView = LayoutInflater.from(mcontext).inflate(R.layout.fg_newlist,parent,false);
            viewHolder = new ViewHolder();
            viewHolder.txt_item_terle = (TextView) convertView.findViewById(R.id.txt_content);
            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder)convertView.getTag();
        }
        viewHolder.txt_item_terle.setText(mData.get(position).getNew_title());
        return convertView;
    }


    private class ViewHolder {
        TextView txt_item_terle;
    }
}
