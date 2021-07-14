package com.example.recyclerviews;

public class ReceiverModel extends BaseModel{
    private String receivermsg;

    public ReceiverModel(String receivermsg) {
        this.receivermsg = receivermsg;
    }

    public String getReceivermsg() {
        return receivermsg;
    }

    @Override
    int getviewtype() {
        return 1;
    }
}
