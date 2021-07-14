package com.example.recyclerviews;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ReceiverviewHolder extends RecyclerView.ViewHolder {
    private TextView tvreceive;

    public ReceiverviewHolder(@NonNull View itemView) {
        super(itemView);
        inii(itemView);
    }

    private void inii(View itemView){
        tvreceive=itemView.findViewById(R.id.tvReceiverMessage);
    }

    public void setdata(ReceiverModel receiverModel){
    tvreceive.setText(receiverModel.getReceivermsg());
    }
}
