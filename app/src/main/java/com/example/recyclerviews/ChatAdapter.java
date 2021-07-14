package com.example.recyclerviews;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ChatAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private ArrayList<BaseModel> basemodellist;

    public ChatAdapter(ArrayList<BaseModel> basemodellist) {
        this.basemodellist = basemodellist;
    }

    @NonNull

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        switch (viewType){
            case 0:
                View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.sender_item_layout,parent,false);
                return new snderViewHolder(view);
            case 1:
                View view1=LayoutInflater.from(parent.getContext()).inflate(R.layout.receiver_item_layout,parent,false);
                return new ReceiverviewHolder(view1);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        int viewtype=basemodellist.get(position).getviewtype();
        switch (viewtype){
            case 0:
                if(holder instanceof snderViewHolder){
                    senderModel senderModel=(senderModel)basemodellist.get(position);
                    ((snderViewHolder)holder).setdata(senderModel);
                }
                break;
            case 1:
                if(holder instanceof ReceiverviewHolder){
                   ReceiverModel receiverModel=(ReceiverModel) basemodellist.get(position);
                    ((ReceiverviewHolder)holder).setdata(receiverModel);
                }
                break;
        }

    }

    @Override
    public int getItemViewType(int position) {


        return basemodellist.get(position).getviewtype();
    }

    @Override
    public int getItemCount() {
        return basemodellist.size();
    }
}
