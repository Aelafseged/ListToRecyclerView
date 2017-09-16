package com.example.aelaf.listtorecyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void doListView(View view)
    {
        Intent intent = new Intent(this,ListViewActivity.class);
        startActivity(intent);
    }
    public void doListViewCustomAdapter(View view)
    {
        Intent intent = new Intent(this,LstViewCustmAdptrActivity.class);
        startActivity(intent);
    }
    public void doRecyclerView(View view)
    {
        Intent intent = new Intent(this,RecyclerViewActivity.class);
        startActivity(intent);
    }
}
