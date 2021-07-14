package com.example.recyclerviews;

public class senderModel extends BaseModel {
    private String sendermessage;

    public senderModel(String message) {
        this.sendermessage = message;
    }

    public String getMessage() {
        return sendermessage;
    }

    @Override
    int getviewtype() {
        return 0;
    }
}
