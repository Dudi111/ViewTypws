package com.example.recyclerviews;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recycle;
    private EditText etoption;
    private EditText etsend;
    private ImageView ivimage;
    private ArrayList<BaseModel> massagelist=new ArrayList<>();
    private ChatAdapter chatAdapter=new ChatAdapter(massagelist);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        buildlist();
        Recycleview();
    }

    private void Recycleview() {
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        recycle.setLayoutManager(linearLayoutManager);
        recycle.setAdapter(chatAdapter);

    }

    private void buildlist(){
        if(etoption.getText().toString().equals("0")){
            massagelist.add(new senderModel(etsend.getText().toString()));
        }else if(etoption.getText().toString().equals("1")){
            massagelist.add(new ReceiverModel(etsend.getText().toString()));
        }
        chatAdapter.notifyDataSetChanged();
    }


    private void init(){
        recycle=findViewById(R.id.recyclerView);
        etoption=findViewById(R.id.etChoice);
        etsend=findViewById(R.id.etSendMessage);
        ivimage=findViewById(R.id.ivSend);
        ivimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              buildlist();
            }
        });
    }
}