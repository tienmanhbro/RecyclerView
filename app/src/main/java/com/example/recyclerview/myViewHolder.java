package com.example.recyclerview;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class myViewHolder extends RecyclerView.ViewHolder {
    ImageView image;
    TextView name;
    TextView email;
    LinearLayout linearlayout;
    Button btn;
    public myViewHolder(@NonNull View itemView) {
        super(itemView);
        image = itemView.findViewById(R.id.imageView);
        name = itemView.findViewById(R.id.Name);
        email = itemView.findViewById(R.id.email);
        linearlayout = itemView.findViewById(R.id.linearLayout);
        btn = itemView.findViewById(R.id.btn1);
    }
}
