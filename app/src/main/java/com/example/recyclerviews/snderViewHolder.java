package com.example.recyclerviews;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class snderViewHolder extends RecyclerView.ViewHolder {
    private TextView tvsender;


    public snderViewHolder(@NonNull View itemView) {
        super(itemView);
        initt(itemView);
    }

    private void initt(View itemView){
        tvsender=itemView.findViewById(R.id.tvSenderMessage);
    }
    public void setdata(senderModel senderModel){
        tvsender.setText(senderModel.getMessage());
    }
}
