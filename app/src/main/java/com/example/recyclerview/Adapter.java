package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<myViewHolder> {
    Context mycontext;
    ArrayList<doituong> items;

    public Adapter(Context mycontext, ArrayList<doituong> items) {
        this.mycontext = mycontext;
        this.items = items;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(mycontext);
        View itemView =layoutInflater.inflate(R.layout.item,parent,false);
        return new myViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        holder.name.setText(items.get(position).getName());
        holder.email.setText(items.get(position).getEmail());
        holder.image.setImageResource(items.get(position).getImage());
        holder.linearlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("click layout");
            }
        });
        holder.btn.setText("chat now" + position);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
