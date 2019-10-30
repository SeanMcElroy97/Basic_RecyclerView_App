package com.example.listapp2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {


    private ArrayList<String> nameList = new ArrayList<>();
    private Context mContext;


    public Adapter(Context context, ArrayList<String> nameList) {
        this.nameList = nameList;
        this.mContext = context;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_tem_layout, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.listItemText.setText(nameList.get(position));
    }

    @Override
    public int getItemCount() {
        return nameList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView listItemText;
        LinearLayout listItemView;

        public ViewHolder(View itemView) {
            super(itemView);
            listItemText = itemView.findViewById(R.id.textView);
            listItemView = itemView.findViewById(R.id.listItemView);
        }
    }
}
